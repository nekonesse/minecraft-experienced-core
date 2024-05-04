package io.github.nekonesse.minecraftexp_core.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import io.github.nekonesse.minecraftexp_core.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractMinecartEntity.class)
public abstract class AbstractMinecartEntityMixin extends Entity {
	protected AbstractMinecartEntityMixin(EntityType<?> entityType, World world) {
		super(entityType, world);
		this.inanimate = true;
	}
	@Unique private boolean onCopperRail;
	@Unique private boolean onWoodenRail;

	@ModifyExpressionValue(
		method = "tick",
		allow = 1,
		require = 1,
		slice = @Slice(
			from = @At(
				value = "FIELD",
				target = "Lnet/minecraft/registry/tag/BlockTags;RAILS:Lnet/minecraft/registry/tag/TagKey;"
			),
			to = @At(
				value = "FIELD",
				target = "Lnet/minecraft/entity/vehicle/AbstractMinecartEntity;onRails:Z"
			)
		),
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/world/World;getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockState;"
		)
	)
	private BlockState setOnRail(BlockState onState) {
		this.onCopperRail = onState.isOf(ModBlocks.COPPER_RAIL);
		this.onWoodenRail = onState.isOf(ModBlocks.WOODEN_RAIL);
		return onState;
	}

	@Inject(method = "tick", at = @At("TAIL"))
	private void resetOnRail(CallbackInfo ci) {
		this.onCopperRail = false;
		this.onWoodenRail = false;
	}
	@ModifyExpressionValue(
		method = "moveOnRail",
		at = @At(value = "INVOKE",
			target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"
		)
	)
	private boolean RailIsAllowed(boolean original, BlockPos pos, BlockState state) {
		return original || onCopperRail || onWoodenRail;
	}

	@WrapOperation(
		method = "moveOnRail",
		slice = @Slice(
			from = @At(
				value = "FIELD",
				target = "Lnet/minecraft/block/PoweredRailBlock;POWERED:Lnet/minecraft/state/property/BooleanProperty;"
			)
		),
		at = @At(value = "INVOKE",
			target = "Lnet/minecraft/block/BlockState;get(Lnet/minecraft/state/property/Property;)Ljava/lang/Comparable;",
			ordinal = 0
		)
	)
	private Comparable<Boolean> RailIsPoweredOrAllowed(BlockState state, Property<?> powered, Operation<Comparable<Boolean>> original) {
		if (onWoodenRail) {
			return Boolean.valueOf(true);
		} else if (onCopperRail) {
			return Boolean.valueOf(true);
		} else
			return original.call(state, powered);
	}

	@ModifyExpressionValue(
		method = "getMaxOffRailSpeed",
		at = @At(value = "CONSTANT",
			args = "doubleValue=20.0")
	)
	private double ModifyRailSpeed(double original) {
		if (onWoodenRail) {
			return 60.0;
		} else if (onCopperRail) {
			return 15.0;
		}

		return 10.0;
	}

	/*@ModifyArg(method = "moveOnRail",
		allow = 1,
		require = 1,
		slice = @Slice(
			from = @At(
				value = "CONSTANT",
				args = "doubleValue=0.06"
			)
		),
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/entity/vehicle/AbstractMinecartEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V",
			ordinal = 0
		)
	)
	private Vec3d modifyPoweredRailAcceleration(Vec3d original) {
		//if (!onCopperRail) return original.multiply(50.0);
		return original.multiply(25.0);
	}*/
}

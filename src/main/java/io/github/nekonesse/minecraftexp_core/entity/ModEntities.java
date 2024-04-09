package io.github.nekonesse.minecraftexp_core.entity;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import io.github.nekonesse.minecraftexp_core.entity.custom.FireArrowEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.quiltmc.qsl.entity.api.QuiltEntityTypeBuilder;

public class ModEntities {
	public static EntityType<FireArrowEntity> FIRE_ARROW;

	private static <T extends Entity> EntityType<T> register(String s, EntityType<T> entityType) {
		return Registry.register(Registries.ENTITY_TYPE, MinecraftExp_Core.MOD_ID + ":" + s, entityType);
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return QuiltEntityTypeBuilder.create(SpawnGroup.MISC, factory).setDimensions(EntityDimensions.fixed(0.5f, 0.5f)).maxBlockTrackingRange(4).trackingTickInterval(20).build();
	}

	public static void registerModEntites() {
		FIRE_ARROW = register("fire_arrow", createArrowEntityType(FireArrowEntity::new));
	}
}

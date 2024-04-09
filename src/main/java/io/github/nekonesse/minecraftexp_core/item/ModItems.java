package io.github.nekonesse.minecraftexp_core.item;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.dispenser.DispenserBlock;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
	public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new QuiltItemSettings()));
	public static final Item SHORTBOW = registerItem("shortbow", new ShortBowItem(new QuiltItemSettings().maxDamage(640)));
	public static final Item LONGBOW = registerItem("longbow", new LongBowItem(new QuiltItemSettings().maxDamage(640)));
	public static final Item FIRE_ARROW_ITEM = registerItem("fire_arrow", new FireArrowItem(new QuiltItemSettings()));
	public static final Item COPPER_WRENCH = registerItem("copper_wrench", new WrenchItem(new QuiltItemSettings().maxDamage(64)));
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(MinecraftExp_Core.MOD_ID, name), item);
	}

	public static void registerModItems() {
		MinecraftExp_Core.LOGGER.info("Registering Mod Items for " + MinecraftExp_Core.MOD_ID);
	}

}

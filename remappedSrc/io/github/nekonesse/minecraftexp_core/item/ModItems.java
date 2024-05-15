package io.github.nekonesse.minecraftexp_core.item;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import io.wispforest.gelatin.dye_entities.ducks.Colored;
import io.wispforest.gelatin.dye_entries.item.ColoredItem;
import io.wispforest.gelatin.dye_registry.DyeColorant;
import io.wispforest.gelatin.dye_registry.DyeColorantRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
	public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new QuiltItemSettings()));
	public static final Item SHORTBOW = registerItem("shortbow", new ShortBowItem(new QuiltItemSettings().maxDamage(640)));
	public static final Item LONGBOW = registerItem("longbow", new LongBowItem(new QuiltItemSettings().maxDamage(640)));
	public static final Item FIRE_ARROW_ITEM = registerItem("fire_arrow", new FireArrowItem(new QuiltItemSettings()));
	public static final Item COPPER_WRENCH = registerItem("copper_wrench", new WrenchItem(new QuiltItemSettings().maxDamage(80)));
	public static final Item APRICOT_DYE = registerItem("apricot_dye", new DyeItem(DyeColor.WHITE,new QuiltItemSettings()));
	public static final Item CRIMSON_DYE = registerItem("crimson_dye", new DyeItem(DyeColor.WHITE,new QuiltItemSettings()));
	public static final Item ORCHID_DYE = registerItem("orchid_dye", new DyeItem(DyeColor.WHITE,new QuiltItemSettings()));
	public static final Item SPRING_GREEN_DYE = registerItem("spring_green_dye", new DyeItem(DyeColor.WHITE,new QuiltItemSettings()));
	public static final Item SKY_DYE = registerItem("sky_dye", new DyeItem(DyeColor.WHITE,new QuiltItemSettings()));
	public static final Item CHARTREUSE_DYE = registerItem("chartreuse_dye", new DyeItem(DyeColor.WHITE,new QuiltItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(MinecraftExp_Core.MOD_ID, name), item);
	}

	private static void registerTabs() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.addAfter(Items.BRUSH,COPPER_WRENCH);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(Items.BOW,SHORTBOW);
			entries.addAfter(SHORTBOW,LONGBOW);
			entries.addAfter(Items.ARROW,FIRE_ARROW_ITEM);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.IRON_NUGGET,COPPER_NUGGET);
			entries.addAfter(Items.ORANGE_DYE,APRICOT_DYE);
			entries.addBefore(Items.RED_DYE,CRIMSON_DYE);
			entries.addAfter(Items.PURPLE_DYE,ORCHID_DYE);
			entries.addAfter(Items.LIGHT_BLUE_DYE,SKY_DYE);
			entries.addAfter(Items.GREEN_DYE,SPRING_GREEN_DYE);
			entries.addBefore(Items.LIME_DYE,CHARTREUSE_DYE);
		});
	}
	public static void registerModItems() {
		registerTabs();
		MinecraftExp_Core.LOGGER.info("Registering Mod Items for " + MinecraftExp_Core.MOD_ID);
	}

}

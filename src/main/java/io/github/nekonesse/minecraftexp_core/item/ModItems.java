package io.github.nekonesse.minecraftexp_core.item;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
	public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new QuiltItemSettings()));
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(MinecraftExp_Core.MOD_ID, name), item);
	}
	public static void registerModItems() {
		MinecraftExp_Core.LOGGER.info("Registering Mod Items for " + MinecraftExp_Core.MOD_ID);
	}

}

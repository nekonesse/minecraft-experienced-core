package io.github.nekonesse.minecraftexp_core.block;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {
	public static final Block CRACKED_POLISHED_ANDESITE = registerBlock("cracked_polished_andesite",
		new Block(QuiltBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
	public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
		new WallBlock(QuiltBlockSettings.copyOf(Blocks.ANDESITE_WALL)));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(MinecraftExp_Core.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(MinecraftExp_Core.MOD_ID, name),
			new BlockItem(block, new QuiltItemSettings()));
	}
	public static void registerModBlock() {
		MinecraftExp_Core.LOGGER.info("Registering ModBlocks for" + MinecraftExp_Core.MOD_ID);
	}
}

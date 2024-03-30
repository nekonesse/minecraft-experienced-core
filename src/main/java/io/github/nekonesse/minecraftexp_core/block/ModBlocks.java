package io.github.nekonesse.minecraftexp_core.block;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {
	//POLISHED ANDESITE
	public static final Block CRACKED_POLISHED_ANDESITE = registerBlock("cracked_polished_andesite",
		new Block(QuiltBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
	public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
		new WallBlock(QuiltBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
	//POLISHED NETHERRACK
	public static final Block POLISHED_NETHERRACK = registerBlock("polished_netherrack",
		new Block(QuiltBlockSettings.copyOf(Blocks.NETHER_BRICKS).strength(4f)));
	public static final Block POLISHED_NETHERRACK_SLAB = registerBlock("polished_netherrack_slab",
		new SlabBlock(QuiltBlockSettings.copyOf(ModBlocks.POLISHED_NETHERRACK)));
	public static final Block POLISHED_NETHERRACK_STAIRS = registerBlock("polished_netherrack_stairs",
		new StairsBlock(ModBlocks.POLISHED_NETHERRACK.getDefaultState(), QuiltBlockSettings.copyOf(ModBlocks.POLISHED_NETHERRACK)));
	public static final Block POLISHED_NETHERRACK_WALL = registerBlock("polished_netherrack_wall",
		new WallBlock(QuiltBlockSettings.copyOf(ModBlocks.POLISHED_NETHERRACK)));
	public static final Block LAYERED_POLISHED_NETHERRACK = registerBlock("layered_polished_netherrack",
		new Block(QuiltBlockSettings.copyOf(ModBlocks.POLISHED_NETHERRACK)));
	public static final Block CUT_POLISHED_NETHERRACK = registerBlock("cut_polished_netherrack",
		new Block(QuiltBlockSettings.copyOf(ModBlocks.POLISHED_NETHERRACK)));
	public static final Block POLISHED_NETHERRACK_PILLAR = registerBlock("polished_netherrack_pillar",
		new PillarBlock(QuiltBlockSettings.copyOf(ModBlocks.POLISHED_NETHERRACK)));


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

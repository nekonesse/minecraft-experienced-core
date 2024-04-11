package io.github.nekonesse.minecraftexp_core.block;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
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
	//POLISHED GRANITE

	public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
		new WallBlock(QuiltBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));
	//POLISHED DIORITE
	public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
		new WallBlock(QuiltBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
	//COBBLESTONE
	public static final Block COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block LAYERED_COBBLESTONE_BRICKS = registerBlock("layered_cobblestone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block STACKED_COBBLESTONE_BRICKS = registerBlock("stacked_cobblestone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CUT_COBBLESTONE_BRICKS = registerBlock("cut_cobblestone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block SMALL_COBBLESTONE_BRICKS = registerBlock("small_cobblestone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block TRIPLE_COBBLESTONE_BRICKS = registerBlock("triple_cobblestone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.COBBLESTONE)));
	//STONE
	public static final Block LAYERED_STONE_BRICKS = registerBlock("layered_stone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.STONE)));
	public static final Block STACKED_STONE_BRICKS = registerBlock("stacked_stone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CUT_STONE_BRICKS = registerBlock("cut_stone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.STONE)));
	public static final Block SMALL_STONE_BRICKS = registerBlock("small_stone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.STONE)));
	public static final Block TRIPLE_STONE_BRICKS = registerBlock("triple_stone_bricks",
		new Block(QuiltBlockSettings.copyOf(Blocks.STONE)));
	//DIRT
	public static final Block ROCKY_DIRT = registerBlock("rocky_dirt",
		new Block(QuiltBlockSettings.copyOf(Blocks.COARSE_DIRT)));
	//POLISHED NETHERRACK
	public static final Block POLISHED_NETHERRACK = registerBlock("polished_netherrack",
		new Block(QuiltBlockSettings.copyOf(Blocks.NETHER_BRICKS).strength(2f)));
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

	private static void registerTabs() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(Blocks.COBBLESTONE_WALL,COBBLESTONE_BRICKS);
			entries.addAfter(COBBLESTONE_BRICKS,LAYERED_COBBLESTONE_BRICKS);
			entries.addAfter(COBBLESTONE_BRICKS,STACKED_COBBLESTONE_BRICKS);
			entries.addAfter(COBBLESTONE_BRICKS,CUT_COBBLESTONE_BRICKS);
			entries.addAfter(COBBLESTONE_BRICKS,SMALL_COBBLESTONE_BRICKS);
			entries.addAfter(COBBLESTONE_BRICKS,TRIPLE_COBBLESTONE_BRICKS);
			entries.addAfter(Blocks.STONE_BRICKS,LAYERED_STONE_BRICKS);
			entries.addAfter(Blocks.STONE_BRICKS,STACKED_STONE_BRICKS);
			entries.addAfter(Blocks.STONE_BRICKS,CUT_STONE_BRICKS);
			entries.addAfter(Blocks.STONE_BRICKS,SMALL_STONE_BRICKS);
			entries.addAfter(Blocks.STONE_BRICKS,TRIPLE_STONE_BRICKS);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(entries -> {
			entries.addAfter(Blocks.COARSE_DIRT,ROCKY_DIRT);
		});
	}

	public static void registerModBlock() {
		registerTabs();
		MinecraftExp_Core.LOGGER.info("Registering ModBlocks for" + MinecraftExp_Core.MOD_ID);
	}
}

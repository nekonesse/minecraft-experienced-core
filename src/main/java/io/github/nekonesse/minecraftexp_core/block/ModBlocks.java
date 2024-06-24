package io.github.nekonesse.minecraftexp_core.block;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.RailShape;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.content.registry.api.BlockContentRegistries;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {
	//POLISHED ANDESITE
	public static final Block CRACKED_POLISHED_ANDESITE = registerBlock("cracked_polished_andesite",
		new Block(QuiltBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
	public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
		new WallBlock(QuiltBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
	//POLISHED GRANITE
	public static final Block CRACKED_POLISHED_GRANITE = registerBlock("cracked_polished_granite",
		new Block(QuiltBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));
	public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
		new WallBlock(QuiltBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));
	//POLISHED DIORITE
	public static final Block CRACKED_POLISHED_DIORITE = registerBlock("cracked_polished_diorite",
		new Block(QuiltBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
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
	public static final Block POLISHED_NETHERRACK_BRICKS = registerBlock("polished_netherrack_bricks",
		new Block(QuiltBlockSettings.copyOf(POLISHED_NETHERRACK)));
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
	//RAILS
	public static final Block OXIDIZED_COPPER_RAIL = registerBlock("oxidized_copper_rail",
		new OxidizableCopperRailBlock(Oxidizable.OxidizationLevel.OXIDIZED,QuiltBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
	public static final Block WEATHERED_COPPER_RAIL = registerBlock("weathered_copper_rail",
		new OxidizableCopperRailBlock(Oxidizable.OxidizationLevel.WEATHERED,QuiltBlockSettings.copyOf(Blocks.RAIL).ticksRandomly(true).sounds(BlockSoundGroup.COPPER)));
	public static final Block EXPOSED_COPPER_RAIL = registerBlock("exposed_copper_rail",
		new OxidizableCopperRailBlock(Oxidizable.OxidizationLevel.EXPOSED,QuiltBlockSettings.copyOf(Blocks.RAIL).ticksRandomly(true).sounds(BlockSoundGroup.COPPER)));
	public static final Block COPPER_RAIL = registerBlock("copper_rail",
		new OxidizableCopperRailBlock(Oxidizable.OxidizationLevel.UNAFFECTED,QuiltBlockSettings.copyOf(Blocks.RAIL).ticksRandomly(true).sounds(BlockSoundGroup.COPPER)));
	public static final Block WAXED_OXIDIZED_COPPER_RAIL = registerBlock("waxed_oxidized_copper_rail",
		new CopperRailBlock(QuiltBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
	public static final Block WAXED_WEATHERED_COPPER_RAIL = registerBlock("waxed_weathered_copper_rail",
		new CopperRailBlock(QuiltBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
	public static final Block WAXED_EXPOSED_COPPER_RAIL = registerBlock("waxed_exposed_copper_rail",
		new CopperRailBlock(QuiltBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
	public static final Block WAXED_COPPER_RAIL = registerBlock("waxed_copper_rail",
		new CopperRailBlock(QuiltBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.COPPER)));
	public static final Block WOODEN_RAIL = registerBlock("wooden_rail",
		new RailBlock(QuiltBlockSettings.copyOf(Blocks.RAIL).hardness(0.7F).strength(0.4F).sounds(BlockSoundGroup.WOOD)));
	//DYED BLOCKS
	public static final Block APRICOT_WOOL = registerBlock("apricot_wool",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL)));
	public static final Block CRIMSON_WOOL = registerBlock("crimson_wool",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL)));
	public static final Block ORCHID_WOOL = registerBlock("orchid_wool",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL)));
	public static final Block SPRING_GREEN_WOOL = registerBlock("spring_green_wool",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL)));
	public static final Block SKY_WOOL = registerBlock("sky_wool",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL)));
	public static final Block CHARTREUSE_WOOL = registerBlock("chartreuse_wool",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL)));
	public static final Block APRICOT_CARPET = registerBlock("apricot_carpet",
		new CarpetBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_CARPET)));
	public static final Block CRIMSON_CARPET = registerBlock("crimson_carpet",
		new CarpetBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_CARPET)));
	public static final Block ORCHID_CARPET = registerBlock("orchid_carpet",
		new CarpetBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_CARPET)));
	public static final Block SPRING_GREEN_CARPET = registerBlock("spring_green_carpet",
		new CarpetBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_CARPET)));
	public static final Block SKY_CARPET = registerBlock("sky_carpet",
		new CarpetBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_CARPET)));
	public static final Block CHARTREUSE_CARPET = registerBlock("chartreuse_carpet",
		new CarpetBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_CARPET)));
	public static final Block APRICOT_TERRACOTTA = registerBlock("apricot_terracotta",
		new Block(QuiltBlockSettings.copyOf(Blocks.TERRACOTTA)));
	public static final Block CRIMSON_TERRACOTTA = registerBlock("crimson_terracotta",
		new Block(QuiltBlockSettings.copyOf(Blocks.TERRACOTTA)));
	public static final Block ORCHID_TERRACOTTA = registerBlock("orchid_terracotta",
		new Block(QuiltBlockSettings.copyOf(Blocks.TERRACOTTA)));
	public static final Block SPRING_GREEN_TERRACOTTA = registerBlock("spring_green_terracotta",
		new Block(QuiltBlockSettings.copyOf(Blocks.TERRACOTTA)));
	public static final Block SKY_TERRACOTTA = registerBlock("sky_terracotta",
		new Block(QuiltBlockSettings.copyOf(Blocks.TERRACOTTA)));
	public static final Block CHARTREUSE_TERRACOTTA = registerBlock("chartreuse_terracotta",
		new Block(QuiltBlockSettings.copyOf(Blocks.TERRACOTTA)));
	public static final Block APRICOT_GLAZED_TERRACOTTA = registerBlock("apricot_glazed_terracotta",
		new GlazedTerracottaBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA)));
	public static final Block CRIMSON_GLAZED_TERRACOTTA = registerBlock("crimson_glazed_terracotta",
		new GlazedTerracottaBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA)));
	public static final Block ORCHID_GLAZED_TERRACOTTA = registerBlock("orchid_glazed_terracotta",
		new GlazedTerracottaBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA)));
	public static final Block SPRING_GREEN_GLAZED_TERRACOTTA = registerBlock("spring_green_glazed_terracotta",
		new GlazedTerracottaBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA)));
	public static final Block SKY_GLAZED_TERRACOTTA = registerBlock("sky_glazed_terracotta",
		new GlazedTerracottaBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA)));
	public static final Block CHARTREUSE_GLAZED_TERRACOTTA = registerBlock("chartreuse_glazed_terracotta",
		new GlazedTerracottaBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_GLAZED_TERRACOTTA)));
	public static final Block APRICOT_STAINED_GLASS = registerBlock("apricot_stained_glass",
		new StainedGlassBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)));
	public static final Block CRIMSON_STAINED_GLASS = registerBlock("crimson_stained_glass",
		new StainedGlassBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)));
	public static final Block ORCHID_STAINED_GLASS = registerBlock("orchid_stained_glass",
		new StainedGlassBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)));
	public static final Block SPRING_GREEN_STAINED_GLASS = registerBlock("spring_green_stained_glass",
		new StainedGlassBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)));
	public static final Block SKY_STAINED_GLASS = registerBlock("sky_stained_glass",
		new StainedGlassBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)));
	public static final Block CHARTREUSE_STAINED_GLASS = registerBlock("chartreuse_stained_glass",
		new StainedGlassBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)));
	public static final Block APRICOT_STAINED_GLASS_PANE = registerBlock("apricot_stained_glass_pane",
		new StainedGlassPaneBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)));
	public static final Block CRIMSON_STAINED_GLASS_PANE = registerBlock("crimson_stained_glass_pane",
		new StainedGlassPaneBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)));
	public static final Block ORCHID_STAINED_GLASS_PANE = registerBlock("orchid_stained_glass_pane",
		new StainedGlassPaneBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)));
	public static final Block SPRING_GREEN_STAINED_GLASS_PANE = registerBlock("spring_green_stained_glass_pane",
		new StainedGlassPaneBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)));
	public static final Block SKY_STAINED_GLASS_PANE = registerBlock("sky_stained_glass_pane",
		new StainedGlassPaneBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)));
	public static final Block CHARTREUSE_STAINED_GLASS_PANE = registerBlock("chartreuse_stained_glass_pane",
		new StainedGlassPaneBlock(DyeColor.WHITE, QuiltBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)));
	public static final Block APRICOT_CONCRETE = registerBlock("apricot_concrete",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
	public static final Block CRIMSON_CONCRETE = registerBlock("crimson_concrete",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
	public static final Block ORCHID_CONCRETE = registerBlock("orchid_concrete",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
	public static final Block SPRING_GREEN_CONCRETE = registerBlock("spring_green_concrete",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
	public static final Block SKY_CONCRETE = registerBlock("sky_concrete",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
	public static final Block CHARTREUSE_CONCRETE = registerBlock("chartreuse_concrete",
		new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
	public static final Block APRICOT_CONCRETE_POWDER = registerBlock("apricot_concrete_powder",
		new ConcretePowderBlock(APRICOT_CONCRETE, QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)));
	public static final Block CRIMSON_CONCRETE_POWDER = registerBlock("crimson_concrete_powder",
		new ConcretePowderBlock(CRIMSON_CONCRETE, QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)));
	public static final Block ORCHID_CONCRETE_POWDER = registerBlock("orchid_concrete_powder",
		new ConcretePowderBlock(ORCHID_CONCRETE, QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)));
	public static final Block SPRING_GREEN_CONCRETE_POWDER = registerBlock("spring_green_concrete_powder",
		new ConcretePowderBlock(SPRING_GREEN_CONCRETE, QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)));
	public static final Block SKY_CONCRETE_POWDER = registerBlock("sky_concrete_powder",
		new ConcretePowderBlock(SKY_CONCRETE, QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)));
	public static final Block CHARTREUSE_CONCRETE_POWDER = registerBlock("chartreuse_concrete_powder",
		new ConcretePowderBlock(CHARTREUSE_CONCRETE, QuiltBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)));
	public static final Block ITEM_CUBBY = registerBlock("item_cubby",
		new ItemCubbyBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS).pistonBehavior(PistonBehavior.DESTROY)));

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
			entries.addAfter(LAYERED_COBBLESTONE_BRICKS,STACKED_COBBLESTONE_BRICKS);
			entries.addAfter(STACKED_COBBLESTONE_BRICKS,CUT_COBBLESTONE_BRICKS);
			entries.addAfter(CUT_COBBLESTONE_BRICKS,SMALL_COBBLESTONE_BRICKS);
			entries.addAfter(SMALL_COBBLESTONE_BRICKS,TRIPLE_COBBLESTONE_BRICKS);

			entries.addAfter(Blocks.STONE_BRICKS,LAYERED_STONE_BRICKS);
			entries.addAfter(LAYERED_STONE_BRICKS,STACKED_STONE_BRICKS);
			entries.addAfter(STACKED_STONE_BRICKS,CUT_STONE_BRICKS);
			entries.addAfter(CUT_STONE_BRICKS,SMALL_STONE_BRICKS);
			entries.addAfter(SMALL_STONE_BRICKS,TRIPLE_STONE_BRICKS);

			entries.addAfter(Blocks.NETHERRACK,POLISHED_NETHERRACK);
			entries.addAfter(POLISHED_NETHERRACK,POLISHED_NETHERRACK_BRICKS);
			entries.addAfter(POLISHED_NETHERRACK_BRICKS,LAYERED_POLISHED_NETHERRACK);
			entries.addAfter(LAYERED_POLISHED_NETHERRACK,CUT_POLISHED_NETHERRACK);
			entries.addAfter(CUT_POLISHED_NETHERRACK,POLISHED_NETHERRACK_PILLAR);

			entries.addAfter(Blocks.POLISHED_ANDESITE_SLAB,POLISHED_ANDESITE_WALL);
			entries.addAfter(POLISHED_ANDESITE_WALL,CRACKED_POLISHED_ANDESITE);

			entries.addAfter(Blocks.POLISHED_DIORITE_SLAB,POLISHED_DIORITE_WALL);
			entries.addAfter(POLISHED_DIORITE_WALL,CRACKED_POLISHED_DIORITE);

			entries.addAfter(Blocks.POLISHED_GRANITE_SLAB,POLISHED_GRANITE_WALL);
			entries.addAfter(POLISHED_GRANITE_WALL,CRACKED_POLISHED_GRANITE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
			entries.addAfter(Blocks.ORANGE_WOOL,APRICOT_WOOL);
			entries.addBefore(Blocks.RED_WOOL,CRIMSON_WOOL);
			entries.addAfter(Blocks.PURPLE_WOOL,ORCHID_WOOL);
			entries.addAfter(Blocks.LIGHT_BLUE_WOOL,SKY_WOOL);
			entries.addAfter(Blocks.GREEN_WOOL,SPRING_GREEN_WOOL);
			entries.addBefore(Blocks.LIME_WOOL,CHARTREUSE_WOOL);

			entries.addAfter(Blocks.ORANGE_CARPET,APRICOT_CARPET);
			entries.addBefore(Blocks.RED_CARPET,CRIMSON_CARPET);
			entries.addAfter(Blocks.PURPLE_CARPET,ORCHID_CARPET);
			entries.addAfter(Blocks.LIGHT_BLUE_CARPET,SKY_CARPET);
			entries.addAfter(Blocks.GREEN_CARPET,SPRING_GREEN_CARPET);
			entries.addBefore(Blocks.LIME_CARPET,CHARTREUSE_CARPET);

			entries.addAfter(Blocks.ORANGE_TERRACOTTA,APRICOT_TERRACOTTA);
			entries.addBefore(Blocks.RED_TERRACOTTA,CRIMSON_TERRACOTTA);
			entries.addAfter(Blocks.PURPLE_TERRACOTTA,ORCHID_TERRACOTTA);
			entries.addAfter(Blocks.LIGHT_BLUE_TERRACOTTA,SKY_TERRACOTTA);
			entries.addAfter(Blocks.GREEN_TERRACOTTA,SPRING_GREEN_TERRACOTTA);
			entries.addBefore(Blocks.LIME_TERRACOTTA,CHARTREUSE_TERRACOTTA);

			entries.addAfter(Blocks.ORANGE_GLAZED_TERRACOTTA,APRICOT_GLAZED_TERRACOTTA);
			entries.addBefore(Blocks.RED_GLAZED_TERRACOTTA,CRIMSON_GLAZED_TERRACOTTA);
			entries.addAfter(Blocks.PURPLE_GLAZED_TERRACOTTA,ORCHID_GLAZED_TERRACOTTA);
			entries.addAfter(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA,SKY_GLAZED_TERRACOTTA);
			entries.addAfter(Blocks.GREEN_GLAZED_TERRACOTTA,SPRING_GREEN_GLAZED_TERRACOTTA);
			entries.addBefore(Blocks.LIME_GLAZED_TERRACOTTA,CHARTREUSE_GLAZED_TERRACOTTA);

			entries.addAfter(Blocks.ORANGE_CONCRETE,APRICOT_CONCRETE);
			entries.addBefore(Blocks.RED_CONCRETE,CRIMSON_CONCRETE);
			entries.addAfter(Blocks.PURPLE_CONCRETE,ORCHID_CONCRETE);
			entries.addAfter(Blocks.LIGHT_BLUE_CONCRETE,SKY_CONCRETE);
			entries.addAfter(Blocks.GREEN_CONCRETE,SPRING_GREEN_CONCRETE);
			entries.addBefore(Blocks.LIME_CONCRETE,CHARTREUSE_CONCRETE);

			entries.addAfter(Blocks.ORANGE_CONCRETE_POWDER,APRICOT_CONCRETE_POWDER);
			entries.addBefore(Blocks.RED_CONCRETE_POWDER,CRIMSON_CONCRETE_POWDER);
			entries.addAfter(Blocks.PURPLE_CONCRETE_POWDER,ORCHID_CONCRETE_POWDER);
			entries.addAfter(Blocks.LIGHT_BLUE_CONCRETE_POWDER,SKY_CONCRETE_POWDER);
			entries.addAfter(Blocks.GREEN_CONCRETE_POWDER,SPRING_GREEN_CONCRETE_POWDER);
			entries.addBefore(Blocks.LIME_CONCRETE_POWDER,CHARTREUSE_CONCRETE_POWDER);

			entries.addAfter(Blocks.ORANGE_STAINED_GLASS,APRICOT_STAINED_GLASS);
			entries.addBefore(Blocks.RED_STAINED_GLASS,CRIMSON_STAINED_GLASS);
			entries.addAfter(Blocks.PURPLE_STAINED_GLASS,ORCHID_STAINED_GLASS);
			entries.addAfter(Blocks.LIGHT_BLUE_STAINED_GLASS,SKY_STAINED_GLASS);
			entries.addAfter(Blocks.GREEN_STAINED_GLASS,SPRING_GREEN_STAINED_GLASS);
			entries.addBefore(Blocks.LIME_STAINED_GLASS,CHARTREUSE_STAINED_GLASS);
			entries.addAfter(Blocks.ORANGE_STAINED_GLASS_PANE,APRICOT_STAINED_GLASS_PANE);
			entries.addBefore(Blocks.RED_STAINED_GLASS_PANE,CRIMSON_STAINED_GLASS_PANE);
			entries.addAfter(Blocks.PURPLE_STAINED_GLASS_PANE,ORCHID_STAINED_GLASS_PANE);
			entries.addAfter(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE,SKY_STAINED_GLASS_PANE);
			entries.addAfter(Blocks.GREEN_STAINED_GLASS_PANE,SPRING_GREEN_STAINED_GLASS_PANE);
			entries.addBefore(Blocks.LIME_STAINED_GLASS_PANE,CHARTREUSE_STAINED_GLASS_PANE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(entries -> {
			entries.addAfter(Blocks.COARSE_DIRT,ROCKY_DIRT);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE_BLOCKS).register(entries -> {
			entries.addBefore(Blocks.RAIL,WOODEN_RAIL);
			entries.addAfter(Blocks.ACTIVATOR_RAIL,COPPER_RAIL);
			entries.addAfter(COPPER_RAIL,EXPOSED_COPPER_RAIL);
			entries.addAfter(EXPOSED_COPPER_RAIL,WEATHERED_COPPER_RAIL);
			entries.addAfter(WEATHERED_COPPER_RAIL,OXIDIZED_COPPER_RAIL);
			entries.addAfter(OXIDIZED_COPPER_RAIL,WAXED_COPPER_RAIL);
			entries.addAfter(WAXED_COPPER_RAIL,WAXED_EXPOSED_COPPER_RAIL);
			entries.addAfter(WAXED_EXPOSED_COPPER_RAIL,WAXED_WEATHERED_COPPER_RAIL);
			entries.addAfter(WAXED_WEATHERED_COPPER_RAIL,WAXED_OXIDIZED_COPPER_RAIL);
		});
	}

	public static void registerModBlock() {
		registerTabs();
		MinecraftExp_Core.LOGGER.info("Registering ModBlocks for" + MinecraftExp_Core.MOD_ID);
	}
}

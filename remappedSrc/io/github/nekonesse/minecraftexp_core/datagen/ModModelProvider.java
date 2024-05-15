package io.github.nekonesse.minecraftexp_core.datagen;

import io.github.nekonesse.minecraftexp_core.block.ModBlocks;
import io.github.nekonesse.minecraftexp_core.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_POLISHED_ANDESITE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_POLISHED_GRANITE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_POLISHED_DIORITE);

		BlockStateModelGenerator.BlockTexturePool polishedNetherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_NETHERRACK);
		polishedNetherrackPool.stairs(ModBlocks.POLISHED_NETHERRACK_STAIRS);
		polishedNetherrackPool.slab(ModBlocks.POLISHED_NETHERRACK_SLAB);
		polishedNetherrackPool.wall(ModBlocks.POLISHED_NETHERRACK_WALL);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_NETHERRACK_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAYERED_POLISHED_NETHERRACK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_POLISHED_NETHERRACK);
		BlockStateModelGenerator.BlockTexturePool cobblestoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLESTONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAYERED_COBBLESTONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STACKED_COBBLESTONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COBBLESTONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRIPLE_COBBLESTONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMALL_COBBLESTONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAYERED_STONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STACKED_STONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_STONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRIPLE_STONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMALL_STONE_BRICKS);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROCKY_DIRT);

		blockStateModelGenerator.registerTurnableRail(ModBlocks.WOODEN_RAIL);

		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APRICOT_TERRACOTTA);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_TERRACOTTA);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORCHID_TERRACOTTA);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRING_GREEN_TERRACOTTA);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SKY_TERRACOTTA);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHARTREUSE_TERRACOTTA);

		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APRICOT_CONCRETE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_CONCRETE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORCHID_CONCRETE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRING_GREEN_CONCRETE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SKY_CONCRETE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHARTREUSE_CONCRETE);

		blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL, ModBlocks.APRICOT_CONCRETE_POWDER);
		blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL, ModBlocks.CRIMSON_CONCRETE_POWDER);
		blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL, ModBlocks.ORCHID_CONCRETE_POWDER);
		blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL, ModBlocks.SPRING_GREEN_CONCRETE_POWDER);
		blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL, ModBlocks.SKY_CONCRETE_POWDER);
		blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL, ModBlocks.CHARTREUSE_CONCRETE_POWDER);

		blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.APRICOT_WOOL, ModBlocks.APRICOT_CARPET);
		blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CRIMSON_WOOL, ModBlocks.CRIMSON_CARPET);
		blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.ORCHID_WOOL, ModBlocks.ORCHID_CARPET);
		blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.SPRING_GREEN_WOOL, ModBlocks.SPRING_GREEN_CARPET);
		blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.SKY_WOOL, ModBlocks.SKY_CARPET);
		blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CHARTREUSE_WOOL, ModBlocks.CHARTREUSE_CARPET);

		blockStateModelGenerator.registerGlassPane(ModBlocks.APRICOT_STAINED_GLASS, ModBlocks.APRICOT_STAINED_GLASS_PANE);
		blockStateModelGenerator.registerGlassPane(ModBlocks.CRIMSON_STAINED_GLASS, ModBlocks.CRIMSON_STAINED_GLASS_PANE);
		blockStateModelGenerator.registerGlassPane(ModBlocks.ORCHID_STAINED_GLASS, ModBlocks.ORCHID_STAINED_GLASS_PANE);
		blockStateModelGenerator.registerGlassPane(ModBlocks.SPRING_GREEN_STAINED_GLASS, ModBlocks.SPRING_GREEN_STAINED_GLASS_PANE);
		blockStateModelGenerator.registerGlassPane(ModBlocks.SKY_STAINED_GLASS, ModBlocks.SKY_STAINED_GLASS_PANE);
		blockStateModelGenerator.registerGlassPane(ModBlocks.CHARTREUSE_STAINED_GLASS, ModBlocks.CHARTREUSE_STAINED_GLASS_PANE);

		blockStateModelGenerator.registerSouthDefaultHorizontalFacing(TexturedModel.TEMPLATE_GLAZED_TERRACOTTA, ModBlocks.APRICOT_GLAZED_TERRACOTTA , ModBlocks.CRIMSON_GLAZED_TERRACOTTA, ModBlocks.ORCHID_GLAZED_TERRACOTTA, ModBlocks.SPRING_GREEN_GLAZED_TERRACOTTA, ModBlocks.SKY_GLAZED_TERRACOTTA, ModBlocks.CHARTREUSE_GLAZED_TERRACOTTA);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
		itemModelGenerator.register(ModItems.COPPER_WRENCH, Models.GENERATED);

		itemModelGenerator.register(ModItems.FIRE_ARROW_ITEM, Models.GENERATED);

		itemModelGenerator.register(ModItems.APRICOT_DYE, Models.GENERATED);
		itemModelGenerator.register(ModItems.CRIMSON_DYE, Models.GENERATED);
		itemModelGenerator.register(ModItems.ORCHID_DYE, Models.GENERATED);
		itemModelGenerator.register(ModItems.SPRING_GREEN_DYE, Models.GENERATED);
		itemModelGenerator.register(ModItems.SKY_DYE, Models.GENERATED);
		itemModelGenerator.register(ModItems.CHARTREUSE_DYE, Models.GENERATED);
	}
}

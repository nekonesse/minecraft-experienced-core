package io.github.nekonesse.minecraftexp_core.datagen;

import io.github.nekonesse.minecraftexp_core.block.ModBlocks;
import io.github.nekonesse.minecraftexp_core.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;
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
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(ModItems.COPPER_WRENCH, Models.SINGLE_LAYER_ITEM);
	}
}

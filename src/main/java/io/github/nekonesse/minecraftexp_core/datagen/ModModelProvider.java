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

		BlockStateModelGenerator.BlockTexturePool polishedNetherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_NETHERRACK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAYERED_POLISHED_NETHERRACK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_POLISHED_NETHERRACK);
		polishedNetherrackPool.stairs(ModBlocks.POLISHED_NETHERRACK_STAIRS);
		polishedNetherrackPool.slab(ModBlocks.POLISHED_NETHERRACK_SLAB);
		polishedNetherrackPool.wall(ModBlocks.POLISHED_NETHERRACK_WALL);


	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.SINGLE_LAYER_ITEM);
	}
}

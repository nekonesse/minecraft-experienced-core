package io.github.nekonesse.minecraftexp_core.datagen;

import io.github.nekonesse.minecraftexp_core.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(HolderLookup.Provider arg) {
		getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
			.add(ModBlocks.CRACKED_POLISHED_ANDESITE)
			.add(ModBlocks.POLISHED_NETHERRACK)
			.add(ModBlocks.POLISHED_NETHERRACK_STAIRS)
			.add(ModBlocks.POLISHED_NETHERRACK_SLAB)
			.add(ModBlocks.POLISHED_NETHERRACK_WALL)
			.add(ModBlocks.POLISHED_NETHERRACK_PILLAR)
			.add(ModBlocks.LAYERED_POLISHED_NETHERRACK)
			.add(ModBlocks.CUT_POLISHED_NETHERRACK)
			.add(ModBlocks.POLISHED_ANDESITE_WALL)
			.add(ModBlocks.POLISHED_DIORITE_WALL)
			.add(ModBlocks.POLISHED_GRANITE_WALL);

		getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

		getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

		getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

		getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));

		getOrCreateTagBuilder(BlockTags.WALLS)
			.add(ModBlocks.POLISHED_ANDESITE_WALL)
			.add(ModBlocks.POLISHED_GRANITE_WALL)
			.add(ModBlocks.POLISHED_DIORITE_WALL)
			.add(ModBlocks.POLISHED_NETHERRACK_WALL);

		getOrCreateTagBuilder(BlockTags.RAILS)
			.add(ModBlocks.COPPER_RAIL)
			.add(ModBlocks.WOODEN_RAIL);

	}
}

package io.github.nekonesse.minecraftexp_core.datagen;

import io.github.nekonesse.minecraftexp_core.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loot_table.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
	public ModLootTableProvider(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		addDrop(ModBlocks.CRACKED_POLISHED_ANDESITE);
		addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
		addDrop(ModBlocks.POLISHED_NETHERRACK);
		addDrop(ModBlocks.POLISHED_NETHERRACK_STAIRS);
		addDrop(ModBlocks.POLISHED_NETHERRACK_WALL);
		add(ModBlocks.POLISHED_NETHERRACK_SLAB, block -> slabDrops(block));
		addDrop(ModBlocks.POLISHED_NETHERRACK_PILLAR);
		addDrop(ModBlocks.CUT_POLISHED_NETHERRACK);
		addDrop(ModBlocks.LAYERED_POLISHED_NETHERRACK);


	}

	/*public LootTable.Builder BasicOreDrops(Block drop, Item item) {
		return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
			((LeafEntry.Builder)
				ItemEntry.builder(item)
					.apply(SetCountLootFunction
						.builder(UniformLootNumberProvider
							.create(2.0f, 5.0f))))
				.apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
	}*/
}

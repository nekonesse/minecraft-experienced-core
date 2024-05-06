package io.github.nekonesse.minecraftexp_core;

import io.github.nekonesse.minecraftexp_core.block.ModBlocks;
import io.github.nekonesse.minecraftexp_core.entity.ModEntities;
import io.github.nekonesse.minecraftexp_core.item.ModItems;
import io.github.nekonesse.minecraftexp_core.sound.ModSounds;
import io.github.nekonesse.minecraftexp_core.util.ModDyes;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.block.Block;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.content.registry.api.BlockContentRegistries;
import org.quiltmc.qsl.block.content.registry.api.ReversibleBlockEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftExp_Core implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Minecraft Experienced (Core)");
	public static final String MOD_ID = "minecraftexp_core";

	@Override
	public void onInitialize(ModContainer mod) {
		ModItems.registerModItems();
		ModBlocks.registerModBlock();
		ModEntities.registerModEntites();
		ModSounds.registerSounds();
		ModDyes.registerModDyes();
		BlockContentRegistries.OXIDIZABLE.put(ModBlocks.COPPER_RAIL, new ReversibleBlockEntry(ModBlocks.EXPOSED_COPPER_RAIL, true));
		BlockContentRegistries.OXIDIZABLE.put(ModBlocks.EXPOSED_COPPER_RAIL, new ReversibleBlockEntry(ModBlocks.WEATHERED_COPPER_RAIL, true));
		BlockContentRegistries.OXIDIZABLE.put(ModBlocks.WEATHERED_COPPER_RAIL, new ReversibleBlockEntry(ModBlocks.OXIDIZED_COPPER_RAIL, true));
	}
}



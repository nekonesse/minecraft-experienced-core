package io.github.nekonesse.minecraftexp_core;

import io.github.nekonesse.minecraftexp_core.item.ModItems;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.nekonesse.minecraftexp_core.item.ModItems.COPPER_NUGGET;

public class MinecraftExp_Core implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Minecraft Experienced (Core)");
	public static final String MOD_ID = "minecraftexp_core";

	@Override
	public void onInitialize(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "copper_nugget"), COPPER_NUGGET);
	}
}



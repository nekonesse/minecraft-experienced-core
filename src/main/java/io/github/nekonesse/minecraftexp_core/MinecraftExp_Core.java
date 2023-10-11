package io.github.nekonesse.minecraftexp_core;

import io.github.nekonesse.minecraftexp_core.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftExp_Core implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Minecraft Experienced (Core)");
	public static final String MOD_ID = "minecraftexp_core";

	@Override
	public void onInitialize(ModContainer mod) {
		ModItems.registerModItems();
	}
}



package io.github.nekonesse.minecraftexp_core.util;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import io.wispforest.gelatin.dye_registry.DyeColorant;
import io.wispforest.gelatin.dye_registry.DyeColorantRegistry;
import net.minecraft.block.MapColor;
import net.minecraft.util.Identifier;

import static io.wispforest.gelatin.dye_registry.DyeColorantRegistry.registerDyeColor;

public class ModDyes {
	public static final DyeColorant APRICOT = DyeColorantRegistry.registerDyeColor(new Identifier(MinecraftExp_Core.MOD_ID, "apricot"), MapColor.SAND, 16758600, 16758600, 16758600);

	public static void registerModDyes() {
		MinecraftExp_Core.LOGGER.info("Registering ModDyes for" + MinecraftExp_Core.MOD_ID);
	}
}

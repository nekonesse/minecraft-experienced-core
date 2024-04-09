package io.github.nekonesse.minecraftexp_core.sound;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
	public static SoundEvent WRENCH_USE = registerSoundEvent("wrench_use");
	private static SoundEvent registerSoundEvent(String name) {
		Identifier id = new Identifier(MinecraftExp_Core.MOD_ID, name);
		return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
	}

	public static void registerSounds() {
		MinecraftExp_Core.LOGGER.info("Registering Sounds for " + MinecraftExp_Core.MOD_ID);
	}
}

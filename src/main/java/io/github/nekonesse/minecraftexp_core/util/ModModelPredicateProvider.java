package io.github.nekonesse.minecraftexp_core.util;

import io.github.nekonesse.minecraftexp_core.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModModelPredicateProvider {
	public static void registerModModels() {
		registerBow(ModItems.SHORTBOW);
	}

	private static void registerBow(Item bow) {
		ModelPredicateProviderRegistry.register(bow, new Identifier("pull"), (itemStack, clientWorld, livingEntity, i) -> {
			if (livingEntity == null) {
				return 0.0F;
			}
			return livingEntity.getActiveItem() != itemStack ? 0.0F : (itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) / 20.0F;
		});

		ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"), (itemStack, clientWorld, livingEntity, i) -> {
			if (livingEntity == null) {
				return 0.0F;
			}
			return livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ? 1.0F : 0.0F;
		});

	}
}

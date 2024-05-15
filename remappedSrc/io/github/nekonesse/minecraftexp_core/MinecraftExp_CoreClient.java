package io.github.nekonesse.minecraftexp_core;

import io.github.nekonesse.minecraftexp_core.block.ModBlocks;
import io.github.nekonesse.minecraftexp_core.util.ModModelPredicateProvider;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;


public class MinecraftExp_CoreClient implements ClientModInitializer {
	public static final String MOD_ID = "minecraftexp_core";

	@Override
	public void onInitializeClient(ModContainer mod) {
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.COPPER_RAIL);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.EXPOSED_COPPER_RAIL);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.WEATHERED_COPPER_RAIL);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.OXIDIZED_COPPER_RAIL);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.WAXED_COPPER_RAIL);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.WAXED_EXPOSED_COPPER_RAIL);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.WAXED_WEATHERED_COPPER_RAIL);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.WAXED_OXIDIZED_COPPER_RAIL);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.WOODEN_RAIL);

		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.APRICOT_STAINED_GLASS);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.CRIMSON_STAINED_GLASS);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.ORCHID_STAINED_GLASS);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.SPRING_GREEN_STAINED_GLASS);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.SKY_STAINED_GLASS);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.CHARTREUSE_STAINED_GLASS);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.APRICOT_STAINED_GLASS_PANE);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.CRIMSON_STAINED_GLASS_PANE);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.ORCHID_STAINED_GLASS_PANE);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.SPRING_GREEN_STAINED_GLASS_PANE);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.SKY_STAINED_GLASS_PANE);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), ModBlocks.CHARTREUSE_STAINED_GLASS_PANE);

		ModModelPredicateProvider.registerModModels();
	}
}

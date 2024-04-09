package io.github.nekonesse.minecraftexp_core.entity.custom;

import io.github.nekonesse.minecraftexp_core.MinecraftExp_Core;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class FireArrowRenderer extends ProjectileEntityRenderer<FireArrowEntity> {
	public static final Identifier TEXTURE = new Identifier("minecraftexp_core:textures/entity/fire_arrow.png");

	public FireArrowRenderer(EntityRendererFactory.Context context) {
		super(context);
	}

	@Override
	public Identifier getTexture(FireArrowEntity entity) {
		return TEXTURE;
	}
}

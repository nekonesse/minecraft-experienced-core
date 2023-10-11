package io.github.nekonesse.minecraftexp_core.mixin;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.MinecartEntityModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

//Change minecart model cuz newer is BETTER! ((also this took me 24 fucking hours of debugging im so tired LOL
@Mixin(MinecartEntityModel.class)
public abstract class MinecartOverwriteModel extends EntityModel {
	@Overwrite
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData front = modelPartData.addChild("front", ModelPartBuilder.create(), ModelTransform.of(0.0F, -10.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData front2 = front.addChild("front2", ModelPartBuilder.create().uv(0, 28).cuboid(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 16.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData back2 = front.addChild("back2", ModelPartBuilder.create().uv(0, 28).cuboid(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 16.0F, 0.0F));

		ModelPartData right2 = front.addChild("right2", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -10.0F, 6.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 16.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData left2 = front.addChild("left2", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -10.0F, 6.0F, 16.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 16.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData base = front.addChild("base", ModelPartBuilder.create().uv(0, 10).cuboid(-9.0F, -7.0F, 0.0F, 18.0F, 14.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 16.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));
		return TexturedModelData.of(modelData, 48, 48);
	}
}

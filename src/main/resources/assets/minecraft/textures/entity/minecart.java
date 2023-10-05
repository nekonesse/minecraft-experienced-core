// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class minecart<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "minecart"), "main");
	private final ModelPart front;

	public minecart(ModelPart root) {
		this.front = root.getChild("front");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition front = partdefinition.addOrReplaceChild("front", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 9.0F));

		PartDefinition front2 = front.addOrReplaceChild("front2", CubeListBuilder.create().texOffs(0, 28).addBox(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -9.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition back2 = front.addOrReplaceChild("back2", CubeListBuilder.create().texOffs(0, 28).addBox(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -9.0F));

		PartDefinition right2 = front.addOrReplaceChild("right2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -10.0F, 6.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -9.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition left2 = front.addOrReplaceChild("left2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -10.0F, 6.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -9.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition base = front.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 10).addBox(-9.0F, -7.0F, 0.0F, 18.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -9.0F, 0.0F, -1.5708F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		front.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
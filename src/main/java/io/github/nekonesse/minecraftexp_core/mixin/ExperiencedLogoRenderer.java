package io.github.nekonesse.minecraftexp_core.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.LogoRenderer;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LogoRenderer.class)
public class ExperiencedLogoRenderer {
	private static final Identifier EXPERIENCED_TEXTURE = new Identifier("textures/gui/title/experienced.png");
	private static final int LOGO_WIDTH = 256;
	private static final int LOGO_HEIGHT = 44;
	private static final int LOGO_TEXTURE_WIDTH = 256;
	private static final int LOGO_TEXTURE_HEIGHT = 64;
	private static final int DEFAULT_Y = 60;
	public final boolean ignoreAlpha;

	public ExperiencedLogoRenderer(boolean ignoreAlpha) {
		this.ignoreAlpha = ignoreAlpha;
	}

	public static void draw(GuiGraphics graphics, int screenWidth, float alpha, int y) {
		graphics.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
		int i = screenWidth / 2 - 128;
		graphics.drawTexture(EXPERIENCED_TEXTURE, i, y, 0.0F, 0.0F, LOGO_WIDTH, LOGO_HEIGHT, LOGO_TEXTURE_WIDTH, LOGO_TEXTURE_HEIGHT);
		int j = screenWidth / 2 - 64;
		int k = y + 44 - 7;
		graphics.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
	}
}

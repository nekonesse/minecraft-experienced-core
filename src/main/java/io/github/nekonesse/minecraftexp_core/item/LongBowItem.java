package io.github.nekonesse.minecraftexp_core.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import org.quiltmc.qsl.item.extensions.api.bow.BowShotProjectileEvents;
import org.quiltmc.qsl.item.extensions.api.bow.ProjectileModifyingBowItem;

public class LongBowItem extends ProjectileModifyingBowItem {
	public LongBowItem(Settings settings) {
		super(settings);
		BowShotProjectileEvents.BOW_MODIFY_SHOT_PROJECTILE.register(this);
	}

	@Override
	public void onProjectileShot(ItemStack bowStack, ItemStack arrowStack, LivingEntity user, float pullProgress, PersistentProjectileEntity projectile) {
		double dmgMultiplier = 0.7;

		projectile.setDamage(projectile.getDamage() * dmgMultiplier);
		projectile.setVelocity(projectile.getVelocity().multiply(1.25));
	}
}

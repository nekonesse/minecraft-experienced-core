package io.github.nekonesse.minecraftexp_core.item;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import org.quiltmc.qsl.item.extensions.api.bow.BowShotProjectileEvents;
import org.quiltmc.qsl.item.extensions.api.bow.ProjectileModifyingBowItem;

public class ShortBowItem extends ProjectileModifyingBowItem {
	public ShortBowItem(Settings settings) {
		super(settings);
		BowShotProjectileEvents.BOW_MODIFY_SHOT_PROJECTILE.register(this);
	}

	@Override
	public void onProjectileShot(ItemStack bowStack, ItemStack arrowStack, LivingEntity user, float pullProgress, PersistentProjectileEntity projectile) {
		double dmgMultiplier = 10;

		projectile.setDamage(projectile.getDamage() * dmgMultiplier);
	}
}

package io.github.nekonesse.minecraftexp_core.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class WrenchItem extends Item {
	public WrenchItem(Settings settings) {
		super(settings);
	}
	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		BlockState block = context.getWorld().getBlockState(context.getBlockPos());
		World world = context.getWorld();

		BlockState rotation = block.rotate(BlockRotation.CLOCKWISE_90); //rotate block
		if (context.getPlayer().isSneaking()) {
			rotation = block.rotate(BlockRotation.COUNTERCLOCKWISE_90);
		}

		if (block != rotation) { //check if rotation has actually changed
			context.getStack().damage(1, context.getPlayer(), p -> p.sendToolBreakStatus(context.getPlayer().getActiveHand()));

			if (context.getPlayer().getOffHandStack() == context.getStack()) { //swing hand
				context.getPlayer().swingHand(Hand.OFF_HAND);
			}
			if (context.getPlayer().getMainHandStack() == context.getStack()) {
				context.getPlayer().swingHand(Hand.MAIN_HAND);
			}
		}
		world.setBlockState(context.getBlockPos(), rotation, Block.NOTIFY_ALL);
		return super.useOnBlock(context);
	}
}

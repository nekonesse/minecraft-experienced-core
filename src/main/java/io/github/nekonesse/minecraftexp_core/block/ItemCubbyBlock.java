package io.github.nekonesse.minecraftexp_core.block;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class ItemCubbyBlock extends BlockWithEntity implements BlockEntityProvider {
	public ItemCubbyBlock(AbstractBlock.Settings settings) {
		super(settings);
	}

	@Nullable
	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return
	}
}

package io.github.nekonesse.minecraftexp_core.block;

import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.RailShape;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;

public class CopperRailBlock extends AbstractRailBlock {
	public CopperRailBlock(Settings settings) {
		super(true, settings);
		this.setDefaultState(this.stateManager.getDefaultState().with(SHAPE, RailShape.NORTH_SOUTH).with(WATERLOGGED, Boolean.valueOf(false)));
	}
	public static final EnumProperty<RailShape> SHAPE = Properties.STRAIGHT_RAIL_SHAPE;

	@Override
	public Property<RailShape> getShapeProperty() {
		return Properties.STRAIGHT_RAIL_SHAPE;
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(WATERLOGGED, SHAPE);
	}
}

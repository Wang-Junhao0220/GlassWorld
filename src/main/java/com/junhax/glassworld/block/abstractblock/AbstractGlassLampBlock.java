package com.junhax.glassworld.block.abstractblock;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;

public abstract class AbstractGlassLampBlock extends AbstractGlassBlock {
    public AbstractGlassLampBlock(Settings settings) {
        super(settings.luminance(state -> 15));
        this.setDefaultState(this.getStateManager().getDefaultState().with(LIT, true));
    }

    public static final BooleanProperty LIT = Properties.LIT;

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }


}

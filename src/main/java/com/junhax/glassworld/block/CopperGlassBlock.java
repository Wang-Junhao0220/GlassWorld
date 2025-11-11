package com.junhax.glassworld.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.util.math.Direction;

public class CopperGlassBlock extends GlassBlock {
    public CopperGlassBlock(Settings settings) {
        super(settings);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if(stateFrom.getBlock() == ModBlocks.COPPER_GLASS || stateFrom.getBlock() == ModBlocks.SOFT_COPPER_GLASS) {
            return true;
        }
        return super.isSideInvisible(state, stateFrom, direction);
    }
}

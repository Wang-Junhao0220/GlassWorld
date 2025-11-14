package com.junhax.glassworld.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.util.math.Direction;

public class DiamondGlassBlock extends GlassBlock {
    public DiamondGlassBlock(Settings settings) {
        super(settings);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if(stateFrom.getBlock() == ModBlocks.DIAMOND_GLASS || stateFrom.getBlock() == ModBlocks.SOFT_DIAMOND_GLASS) {
            return true;
        }
        return super.isSideInvisible(state, stateFrom, direction);
    }
}

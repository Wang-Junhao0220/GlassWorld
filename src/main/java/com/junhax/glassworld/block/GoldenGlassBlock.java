package com.junhax.glassworld.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class GoldenGlassBlock extends GlassBlock {
    public GoldenGlassBlock(Settings settings) {
        super(settings);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if(stateFrom.getBlock() == ModBlocks.GOLDEN_GLASS || stateFrom.getBlock() == ModBlocks.SOFT_GOLDEN_GLASS) {
            return true;
        }
        return super.isSideInvisible(state, stateFrom, direction);
    }
}

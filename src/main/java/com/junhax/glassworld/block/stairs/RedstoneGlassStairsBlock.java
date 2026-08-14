package com.junhax.glassworld.block.stairs;

import com.junhax.glassworld.block.abstractblock.AbstractGlassStairsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class RedstoneGlassStairsBlock extends AbstractGlassStairsBlock {
    public RedstoneGlassStairsBlock(BlockState blockState, Settings settings) {
        super(blockState,settings);
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @SuppressWarnings("deprecation")
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }
}

package com.junhax.glassworld.block;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

// file: RedstoneGlass.java
@SuppressWarnings("deprecation")
public class RedstoneGlass extends GlassBlock {
    public RedstoneGlass(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }
}


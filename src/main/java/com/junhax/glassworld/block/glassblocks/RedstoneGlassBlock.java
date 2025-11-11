package com.junhax.glassworld.block.glassblocks;

import com.junhax.glassworld.block.ModBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

// file: RedstoneGlass.java
@SuppressWarnings("deprecation")
public class RedstoneGlassBlock extends GlassBlock {
    public RedstoneGlassBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if(stateFrom.getBlock() == ModBlocks.REDSTONE_GLASS || stateFrom.getBlock() == ModBlocks.SOFT_REDSTONE_GLASS)
            return true;

        return super.isSideInvisible(state, stateFrom, direction);
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }
}


package com.junhax.glassworld.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GlassStairsBlock extends AbstractGlassStairsBlock {
    public GlassStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState,settings);
    }

//    @Override
//    @Environment(EnvType.CLIENT)
//    public boolean isSideInvisible(BlockState state, BlockState stateFrom,
//                                   Direction direction)
//    {
////        if(stateFrom.getBlock() == Blocks.GLASS)
//        if(state.isIn(ModTags.GLASS_BLOCK_TAG))
//            return true;
//
////        if(stateFrom.getBlock() == ModBlocks.GLASS_SLAB)
//        if(state.isIn(ModTags.GLASS_SLAB_TAG))
//            if(isInvisibleToGlassSlab(state, stateFrom, direction))
//                return true;
//

}

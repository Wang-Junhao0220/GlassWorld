package com.junhax.glassworld.block.stairs;

import com.junhax.glassworld.block.abstractblock.AbstractGlassStairsBlock;
import net.minecraft.block.BlockState;

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

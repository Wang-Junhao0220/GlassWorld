package com.junhax.glassworld.block.typeblock;

import net.minecraft.block.GlassBlock;

public class EmeraldGlassBlock extends GlassBlock {
    public EmeraldGlassBlock(Settings settings) {
        super(settings);
    }
//    @Override
//    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
//        if (state.isIn(ModTags.GLASS_BLOCK_TAG)) {
//            return true;
//        }
//        return super.isSideInvisible(state, stateFrom, direction);
//    }
    // todo:BUG! ALL INVISIBLE!
}

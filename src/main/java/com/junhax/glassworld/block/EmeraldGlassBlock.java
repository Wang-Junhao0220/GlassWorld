package com.junhax.glassworld.block;

import com.junhax.glassworld.ModTags;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.util.math.Direction;

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

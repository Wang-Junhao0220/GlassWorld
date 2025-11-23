package com.junhax.glassworld.mixin.block;

import com.junhax.glassworld.ModTags;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(AbstractGlassBlock.class)
public abstract class AbstractGlassBlockMixin extends TransparentBlock {

    private AbstractGlassBlockMixin(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if (stateFrom.isIn(ModTags.GLASS_BLOCK_TAG)) {
            return true;
        }

        if (stateFrom.isIn(ModTags.GLASS_SLAB_TAG))
            if (isInvisibleToGlassSlab(state, stateFrom, direction))
                return true;

        if (stateFrom.isIn(ModTags.GLASS_STAIRS_TAG))
            if (isInvisibleToGlassStairs(state, stateFrom, direction))
                return true;

        return super.isSideInvisible(state, stateFrom, direction);
    }

    @Unique
    private boolean isInvisibleToGlassSlab(BlockState state, BlockState stateFrom, Direction direction) {
        SlabType typeFrom = stateFrom.get(SlabBlock.TYPE);

        if (typeFrom == SlabType.DOUBLE)
            return true;

        if (direction == Direction.UP)
            if (typeFrom != SlabType.TOP)
                return true;

        if (direction == Direction.DOWN)
            return typeFrom != SlabType.BOTTOM;

        return false;
    }

    @Unique
    private boolean isInvisibleToGlassStairs(BlockState state, BlockState stateFrom, Direction direction) {
        BlockHalf halfFrom = stateFrom.get(StairsBlock.HALF);
        Direction facingFrom = stateFrom.get(StairsBlock.FACING);
        StairShape shapeFrom = stateFrom.get(StairsBlock.SHAPE);

        // up
        if (direction == Direction.UP)
            if (halfFrom == BlockHalf.BOTTOM)
                return true;

        // down
        if (direction == Direction.DOWN)
            if (halfFrom == BlockHalf.TOP)
                return true;

        // other stairs rear
        if (facingFrom == direction.getOpposite()
                && shapeFrom != StairShape.OUTER_LEFT
                && shapeFrom != StairShape.OUTER_RIGHT)
            return true;

        // other curved stairs fully covered side
        if (facingFrom.rotateYCounterclockwise() == direction
                && shapeFrom == StairShape.INNER_RIGHT)
            return true;
        return facingFrom.rotateYClockwise() == direction
                && shapeFrom == StairShape.INNER_LEFT;
    }

}

package com.junhax.glassworld.block;

import com.junhax.glassworld.ModTags;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

@SuppressWarnings("deprecation")
public class GlassSlabBlock extends SlabBlock {
    public GlassSlabBlock(Settings settings) {
        super(settings);
    }

    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0f;
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
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
////        if(stateFrom.getBlock() == this)
//        if(stateFrom.isIn(ModTags.GLASS_SLAB_TAG))
//            if(isInvisibleToGlassSlab(state, stateFrom, direction))
//                return true;
//
//        // Todo: add a tag for all glass blocks/glass stairs/slabs, etc
////        if(stateFrom.getBlock() == ModBlocks.GLASS_STAIRS)
//        if(state.isIn(ModTags.GLASS_STAIRS_TAG))
//            if(isInvisibleToGlassStairs(state, stateFrom, direction))
//                return true;
//
//        return super.isSideInvisible(state, stateFrom, direction);
//    }
//
//    private boolean isInvisibleToGlassSlab(BlockState state,
//                                           BlockState stateFrom, Direction direction)
//    {
//        SlabType type = state.get(SlabBlock.TYPE);
//        SlabType typeFrom = stateFrom.get(SlabBlock.TYPE);
//
//        switch(direction)
//        {
//            case UP:
//                if(typeFrom != SlabType.TOP && type != SlabType.BOTTOM)
//                    return true;
//                break;
//
//            case DOWN:
//                if(typeFrom != SlabType.BOTTOM && type != SlabType.TOP)
//                    return true;
//                break;
//
//            case NORTH:
//            case EAST:
//            case SOUTH:
//            case WEST:
//                if(type == typeFrom || typeFrom == SlabType.DOUBLE)
//                    return true;
//                break;
//        }
//
//        return false;
//    }
//
//    private boolean isInvisibleToGlassStairs(BlockState state,
//                                             BlockState stateFrom, Direction direction)
//    {
//        SlabType type = state.get(SlabBlock.TYPE);
//        BlockHalf halfFrom = stateFrom.get(StairsBlock.HALF);
//        Direction facingFrom = stateFrom.get(StairsBlock.FACING);
//        StairShape shapeFrom = stateFrom.get(StairsBlock.SHAPE);
//
//        // up
//        if(direction == Direction.UP)
//            if(halfFrom == BlockHalf.BOTTOM)
//                return true;
//
//        // down
//        if(direction == Direction.DOWN)
//            if(halfFrom == BlockHalf.TOP)
//                return true;
//
//        // other stairs rear
//        if(facingFrom == direction.getOpposite()
//                && shapeFrom != StairShape.OUTER_LEFT
//                && shapeFrom != StairShape.OUTER_RIGHT)
//            return true;
//
//        // other curved stairs fully covered side
//        if(facingFrom.rotateYCounterclockwise() == direction
//                && shapeFrom == StairShape.INNER_RIGHT)
//            return true;
//        if(facingFrom.rotateYClockwise() == direction
//                && shapeFrom == StairShape.INNER_LEFT)
//            return true;
//
//        // sides
//        if(direction.getAxis().isHorizontal())
//        {
//            if(type == SlabType.BOTTOM && halfFrom == BlockHalf.BOTTOM)
//                return true;
//
//            if(type == SlabType.TOP && halfFrom == BlockHalf.TOP)
//                return true;
//        }
//
//        return false;
//    }
}

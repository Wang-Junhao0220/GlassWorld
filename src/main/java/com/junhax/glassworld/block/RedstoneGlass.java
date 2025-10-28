package com.junhax.glassworld.block;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

// file: RedstoneGlass.java
@SuppressWarnings("deprecation")
public class RedstoneGlass extends GlassBlock {
    public RedstoneGlass(AbstractBlock.Settings settings) {
        super(settings);
    }

    // 添加玻璃的透明特性
//    @Override
//    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
//        return VoxelShapes.empty();
//    }
//
//    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
//        return 1.0F;
//    }
//
//    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
//        return true;
//    }
//    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
//        return stateFrom.isOf(this) || super.isSideInvisible(state, stateFrom, direction);
//    }

    // 添加玻璃的光照特性
    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    // 添加玻璃的渲染特性
//    @Override
//    public BlockRenderType getRenderType(BlockState state) {
//        return BlockRenderType.MODEL;
//    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }
    // 可以根据需要重写其他玻璃特有的方法
}


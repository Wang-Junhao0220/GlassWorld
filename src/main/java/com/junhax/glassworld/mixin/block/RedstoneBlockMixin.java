package com.junhax.glassworld.mixin.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@SuppressWarnings("deprecation")
@Mixin(RedstoneBlock.class)
public class RedstoneBlockMixin {
    /**
     * @author Junhax
     * @reason Longer distance!
     */
    @Overwrite
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 115514;
    }
}

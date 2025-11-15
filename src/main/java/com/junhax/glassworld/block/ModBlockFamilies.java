package com.junhax.glassworld.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

public class ModBlockFamilies {
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.<Block, BlockFamily>newHashMap();

    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = (BlockFamily)BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }
    public static Stream<BlockFamily> getFamilies() {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }

    public static final BlockFamily IRON_GLASS = register(ModBlocks.IRON_GLASS)
            .slab(ModBlocks.IRON_GLASS_SLAB)
            .stairs(ModBlocks.IRON_GLASS_STAIRS)
            .wall(ModBlocks.IRON_GLASS_WALL)
            .fence(ModBlocks.IRON_GLASS_FENCE)
            .fenceGate(ModBlocks.IRON_GLASS_FENCE_GATE)
            .pressurePlate(ModBlocks.IRON_GLASS_PRESSURE_PLATE)
            .trapdoor(ModBlocks.IRON_GLASS_TRAPDOOR)
            .door(ModBlocks.IRON_GLASS_DOOR)
            .button(ModBlocks.IRON_GLASS_BUTTON)
            .build();
}

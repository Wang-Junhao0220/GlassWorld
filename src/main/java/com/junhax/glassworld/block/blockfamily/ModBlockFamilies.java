package com.junhax.glassworld.block.blockfamily;

import com.google.common.collect.Maps;
import com.junhax.glassworld.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
            .door(ModBlocks.IRON_GLASS_DOOR)
            .build();

    public static final BlockFamily GLASS = register(Blocks.GLASS)
            .slab(ModBlocks.GLASS_SLAB)
            .stairs(ModBlocks.GLASS_STAIRS)
            .door(ModBlocks.GLASS_DOOR)
            .build();

    public static final BlockFamily GOLDEN_GLASS = register(ModBlocks.PURIFIED_GLASS)
            .slab(ModBlocks.GOLDEN_GLASS_SLAB)
            .stairs(ModBlocks.GOLDEN_GLASS_STAIRS)
            .door(ModBlocks.GOLDEN_GLASS_DOOR)
            .build();

    public static final BlockFamily ANCIENT_GLASS = register(ModBlocks.ANCIENT_GLASS)
            .slab(ModBlocks.ANCIENT_GLASS_SLAB)
            .stairs(ModBlocks.ANCIENT_GLASS_STAIRS)
            .door(ModBlocks.ANCIENT_GLASS_DOOR)
            .build();

    public static final BlockFamily DIAMOND_GLASS = register(ModBlocks.DIAMOND_GLASS)
            .slab(ModBlocks.DIAMOND_GLASS_SLAB)
            .stairs(ModBlocks.DIAMOND_GLASS_STAIRS)
            .door(ModBlocks.DIAMOND_GLASS_DOOR)
            .build();

    public static final BlockFamily EMERALD_GLASS = register(ModBlocks.EMERALD_GLASS)
            .slab(ModBlocks.EMERALD_GLASS_SLAB)
            .stairs(ModBlocks.EMERALD_GLASS_STAIRS)
            .door(ModBlocks.EMERALD_GLASS_DOOR)
            .build();

    public static final BlockFamily REDSTONE_GLASS = register(ModBlocks.REDSTONE_GLASS)
            .slab(ModBlocks.REDSTONE_GLASS_SLAB)
            .stairs(ModBlocks.REDSTONE_GLASS_STAIRS)
            .door(ModBlocks.REDSTONE_GLASS_DOOR)
            .build();

    public static final BlockFamily COPPER_GLASS = register(ModBlocks.COPPER_GLASS)
            .slab(ModBlocks.COPPER_GLASS_SLAB)
            .stairs(ModBlocks.COPPER_GLASS_STAIRS)
            .door(ModBlocks.COPPER_GLASS_DOOR)
            .build();
}

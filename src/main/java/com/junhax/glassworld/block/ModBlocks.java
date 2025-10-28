package com.junhax.glassworld.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SOFT_DIAMOND_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.DIAMOND_BLUE)
                            .strength(2.5F, 100F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), "soft_diamond_glass", true);

    public static final Block DIAMOND_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.DIAMOND_BLUE)
                            .strength(4F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), "diamond_glass", true);

    public static final Block ANCIENT_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.BLACK)
                            .strength(40F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), "ancient_glass", true);

    public static final Block SOFT_ANCIENT_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.BLACK)
                            .strength(20F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), "soft_ancient_glass", true);

    public static final Block GOLDEN_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.GOLD)
                            .strength(4F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), "golden_glass", true);

    public static final Block SOFT_GOLDEN_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.GOLD)
                            .strength(2.5F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), "soft_golden_glass", true);

    public static final Block REDSTONE_GLASS = register(
            new RedstoneGlass(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.BRIGHT_RED)
                            .strength(4F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), "redstone_glass", true);
    public static <T extends Block> T register(T block, String name, boolean shouldRegisterItem) {
        Identifier id = new Identifier("glassworld", name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }


    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.DIAMOND_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.ANCIENT_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.SOFT_ANCIENT_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.SOFT_DIAMOND_GLASS.asItem()));
    }

}

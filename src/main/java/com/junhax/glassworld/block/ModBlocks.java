package com.junhax.glassworld.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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
            ), BlockId.SOFT_DIAMOND_GLASS, true);

    public static final Block DIAMOND_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.DIAMOND_BLUE)
                            .strength(4F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.DIAMOND_GLASS, true);

    public static final Block ANCIENT_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.BLACK)
                            .strength(40F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.ANCIENT_GLASS, true);

    public static final Block SOFT_ANCIENT_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.BLACK)
                            .strength(20F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.SOFT_ANCIENT_GLASS, true);

    public static final Block GOLDEN_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.GOLD)
                            .strength(4F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.GOLDEN_GLASS, true);

    public static final Block SOFT_GOLDEN_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.GOLD)
                            .strength(2.5F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.SOFT_GOLDEN_GLASS, true);

    public static final Block REDSTONE_GLASS = register(
            new RedstoneGlass(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.BRIGHT_RED)
                            .strength(4F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.REDSTONE_GLASS, true);
    public static final Block SOFT_REDSTONE_GLASS = register(
            new RedstoneGlass(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.BRIGHT_RED)
                            .strength(1F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.SOFT_REDSTONE_GLASS, true);

    public static final Block IRON_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.IRON_GRAY)
                            .strength(3F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.IRON_GLASS, true);

    public static final Block SOFT_IRON_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.IRON_GRAY)
                            .strength(1F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.SOFT_IRON_GLASS, true);

    public static final Block EMERALD_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.EMERALD_GREEN)
                            .strength(3F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.EMERALD_GLASS, true);

    public static final Block SOFT_EMERALD_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.EMERALD_GREEN)
                            .strength(1F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ),BlockId.SOFT_EMERALD_GLASS, true);

    public static final Block PURIFIED_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS)
                            .strength(1F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ),BlockId.PURIFIED_GLASS, true);
    public static final Block COPPER_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.ORANGE)
                            .strength(2F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.COPPER_GLASS, true);

    public static final Block SOFT_COPPER_GLASS = register(
            new GlassBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).mapColor(MapColor.ORANGE)
                            .strength(0.8F, 100F).requiresTool().nonOpaque()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                            .suffocates(Blocks::never).blockVision(Blocks::never)
            ), BlockId.SOFT_COPPER_GLASS, true);

    // Iron Sand
    public static final Block IRON_SAND = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND).mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F).requiresTool()
            ), BlockId.IRON_SAND, true);

    public static final Block COPPER_SAND = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F).requiresTool()
            ), BlockId.COPPER_SAND, true);

    public static final Block GOLDEN_SAND = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND).mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F).requiresTool()
            ), BlockId.GOLDEN_SAND, true);

    public static final Block REDSTONE_SAND = register(
            new RedstoneSand(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND).mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F).requiresTool()
            ), BlockId.REDSTONE_SAND, true);

    public static final Block EMERALD_SAND = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND).mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F).requiresTool()
            ), BlockId.EMERALD_SAND, true);

    public static final Block DIAMOND_SAND = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND).mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F).requiresTool()
            ), BlockId.DIAMOND_SAND, true);

    public static final Block ANCIENT_SOUL_SAND = register(
            new SoulSandBlock(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND).mapColor(MapColor.BROWN)
                            .strength(0.6F).velocityMultiplier(0.4f).requiresTool()
                            .allowsSpawning(Blocks::always).solidBlock(Blocks::always).
                            blockVision(Blocks::always).suffocates(Blocks::always)
            ), BlockId.ANCIENT_SOUL_SAND, true);

    public static <T extends Block> T register(T block, String name, boolean shouldRegisterItem) {
        Identifier id = new Identifier("glassworld", name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }


    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(Blocks.GLASS.asItem(), ModBlocks.PURIFIED_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.PURIFIED_GLASS.asItem(), ModBlocks.DIAMOND_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.DIAMOND_GLASS.asItem(), ModBlocks.ANCIENT_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.ANCIENT_GLASS.asItem(), ModBlocks.GOLDEN_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.GOLDEN_GLASS.asItem(), ModBlocks.REDSTONE_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.REDSTONE_GLASS.asItem(), ModBlocks.IRON_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.IRON_GLASS.asItem(), ModBlocks.EMERALD_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.EMERALD_GLASS.asItem(), ModBlocks.COPPER_GLASS.asItem()));
        // Soft Glass
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.COPPER_GLASS.asItem(), ModBlocks.SOFT_ANCIENT_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.SOFT_ANCIENT_GLASS.asItem(), ModBlocks.SOFT_DIAMOND_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.SOFT_DIAMOND_GLASS.asItem(), ModBlocks.SOFT_GOLDEN_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.SOFT_GOLDEN_GLASS.asItem(), ModBlocks.SOFT_REDSTONE_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.SOFT_REDSTONE_GLASS.asItem(), ModBlocks.SOFT_IRON_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.SOFT_IRON_GLASS.asItem(), ModBlocks.SOFT_EMERALD_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(ModBlocks.SOFT_EMERALD_GLASS.asItem(), ModBlocks.SOFT_COPPER_GLASS.asItem()));
        // Sand
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(Blocks.SAND.asItem(), ModBlocks.IRON_SAND.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(ModBlocks.IRON_SAND.asItem(), ModBlocks.COPPER_SAND.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(ModBlocks.COPPER_SAND.asItem(), ModBlocks.GOLDEN_SAND.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(ModBlocks.GOLDEN_SAND.asItem(), ModBlocks.REDSTONE_SAND.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(ModBlocks.REDSTONE_SAND.asItem(), ModBlocks.EMERALD_SAND.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(ModBlocks.EMERALD_SAND.asItem(), ModBlocks.DIAMOND_SAND.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(Blocks.SOUL_SAND.asItem(), ModBlocks.ANCIENT_SOUL_SAND.asItem()));
    }
}

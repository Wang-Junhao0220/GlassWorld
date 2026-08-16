package com.junhax.glassworld.block;

//import com.junhax.glassworld.block.door.GlassDoorBlock;
import com.junhax.glassworld.block.door.*;
import com.junhax.glassworld.block.glass.*;
//import com.junhax.glassworld.block.slab.GlassSlabBlock;
//import com.junhax.glassworld.block.stairs.GlassStairsBlock;
import com.junhax.glassworld.block.lamp.GlassLampBlock;
import com.junhax.glassworld.block.slab.*;
import com.junhax.glassworld.block.stairs.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;

public class ModBlocks {

    // Vanilla Glass Strength: 0.3F

    public static final Block SOFT_DIAMOND_GLASS = register(
            new DiamondGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.DIAMOND_BLUE)
                            .instrument(Instrument.HAT)
                            .strength(2.5F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.SOFT_DIAMOND_GLASS,
            true
    );

    public static final Block DIAMOND_GLASS = register(
            new DiamondGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.DIAMOND_BLUE)
                            .instrument(Instrument.HAT)
                            .strength(4F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.DIAMOND_GLASS,
            true
    );

    public static final Block ANCIENT_GLASS = register(
            new AncientGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.BLACK)
                            .instrument(Instrument.HAT)
                            .strength(40F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.ANCIENT_GLASS,
            true
    );

    public static final Block SOFT_ANCIENT_GLASS = register(
            new AncientGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.BLACK)
                            .instrument(Instrument.HAT)
                            .strength(20F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.SOFT_ANCIENT_GLASS,
            true
    );

    public static final Block GOLDEN_GLASS = register(
            new GoldenGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.GOLD)
                            .instrument(Instrument.HAT)
                            .strength(4F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.GOLDEN_GLASS,
            true
    );

    public static final Block SOFT_GOLDEN_GLASS = register(
            new GoldenGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.GOLD)
                            .instrument(Instrument.HAT)
                            .strength(2.5F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.SOFT_GOLDEN_GLASS,
            true
    );

    public static final Block REDSTONE_GLASS = register(
            new RedstoneGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.BRIGHT_RED)
                            .instrument(Instrument.HAT)
                            .strength(4F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.REDSTONE_GLASS,
            true
    );

    public static final Block SOFT_REDSTONE_GLASS = register(
            new RedstoneGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.BRIGHT_RED)
                            .instrument(Instrument.HAT)
                            .strength(1F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.SOFT_REDSTONE_GLASS,
            true
    );

    public static final Block IRON_GLASS = register(
            new IronGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.IRON_GRAY)
                            .instrument(Instrument.HAT)
                            .strength(3F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.IRON_GLASS,
            true
    );

    public static final Block SOFT_IRON_GLASS = register(
            new IronGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.IRON_GRAY)
                            .instrument(Instrument.HAT)
                            .strength(1F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.SOFT_IRON_GLASS,
            true
    );

    public static final Block EMERALD_GLASS = register(
            new EmeraldGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.EMERALD_GREEN)
                            .instrument(Instrument.HAT)
                            .strength(3F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.EMERALD_GLASS,
            true
    );

    public static final Block SOFT_EMERALD_GLASS = register(
            new EmeraldGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.EMERALD_GREEN)
                            .instrument(Instrument.HAT)
                            .strength(1F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.SOFT_EMERALD_GLASS,
            true
    );

    public static final Block PURIFIED_GLASS = register(
            new PurifiedGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .instrument(Instrument.HAT)
                            .strength(0.3F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.PURIFIED_GLASS,
            true
    );

    public static final Block COPPER_GLASS = register(
            new CopperGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.ORANGE)
                            .strength(2F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.COPPER_GLASS,
            true
    );

    public static final Block SOFT_COPPER_GLASS = register(
            new CopperGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.ORANGE)
                            .strength(0.8F, 100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.SOFT_COPPER_GLASS,
            true
    );

    public static final Block LAPIS_GLASS = register(
            new LapisGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.LAPIS_BLUE)
                            .strength(2.5F,100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.LAPIS_GLASS,
            true
    );

    public static final Block SOFT_LAPIS_GLASS = register(
            new LapisGlassBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.GLASS)
                            .mapColor(MapColor.LAPIS_BLUE)
                            .strength(1F,100F)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::always)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            ),
            BlockId.SOFT_LAPIS_GLASS,
            true
    );


    public static final Block IRON_SAND = register(
            new Block(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.SAND)
                            .mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F)
                            .requiresTool()
            ),
            BlockId.IRON_SAND,
            true
    );

    public static final Block COPPER_SAND = register(
            new Block(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.STONE)
                            .mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F)
                            .requiresTool()
            ),
            BlockId.COPPER_SAND,
            true
    );

    public static final Block GOLDEN_SAND = register(
            new Block(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.SAND)
                            .mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F)
                            .requiresTool()
            ),
            BlockId.GOLDEN_SAND,
            true
    );

    public static final Block REDSTONE_SAND = register(
            new RedstoneSandBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.SAND)
                            .mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F)
                            .requiresTool()
            ),
            BlockId.REDSTONE_SAND,
            true
    );

    public static final Block EMERALD_SAND = register(
            new Block(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.SAND)
                            .mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F)
                            .requiresTool()
            ),
            BlockId.EMERALD_SAND,
            true
    );

    public static final Block DIAMOND_SAND = register(
            new Block(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.SAND)
                            .mapColor(MapColor.PALE_YELLOW)
                            .strength(0.6F)
                            .requiresTool()
            ),
            BlockId.DIAMOND_SAND,
            true
    );

    public static final Block ANCIENT_SOUL_SAND = register(
            new SoulSandBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.SAND)
                            .mapColor(MapColor.BROWN)
                            .strength(0.6F)
                            .velocityMultiplier(0.4f)
                            .requiresTool()
            ),
            BlockId.ANCIENT_SOUL_SAND,
            true
    );

    public static final Block LAPIS_SAND = register(
            new Block(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.SAND)
                            .mapColor(MapColor.LAPIS_BLUE)
                            .strength(0.6F)
                            .requiresTool()
            ),
            BlockId.LAPIS_SAND,
            true
    );

    // ===================== 楼梯、台阶、门 =====================

    public static final Block GLASS_STAIRS = register(
            new GlassStairsBlock(
                    Blocks.GLASS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.GLASS)
            ),
            BlockId.GLASS_STAIRS,
            true
    );

    public static final Block GLASS_SLAB = register(
            new GlassSlabBlock(
                    AbstractBlock.Settings.copy(Blocks.GLASS)
            ),
            BlockId.GLASS_SLAB,
            true
    );

    public static final Block GLASS_DOOR = register(
            new GlassDoorBlock(
                    AbstractBlock.Settings.copy(Blocks.GLASS),
                    BlockSetType.STONE
            ),
            BlockId.GLASS_DOOR,
            true
    );

//    public static final Block OAK_GLASS_DOOR = register(
//            new GlassDoorBlock(
//                    AbstractBlock.Settings.create()
//                            .mapColor(OAK_PLANKS.getDefaultMapColor())
//                            .instrument(Instrument.BASS)
//                            .strength(2.0f)
//                            .nonOpaque()
//                            .burnable()
//                            .pistonBehavior(PistonBehavior.DESTROY),
//                    BlockSetType.OAK
//            ),
//            BlockId.OAK_GLASS_DOOR,
//            true
//    );
//
    public static final Block IRON_GLASS_STAIRS = register(
            new IronGlassStairsBlock(
                    IRON_GLASS.getDefaultState(),
                    AbstractBlock.Settings.copy(IRON_GLASS)
            ),
            BlockId.IRON_GLASS_STAIRS,
            true
    );

    public static final Block IRON_GLASS_SLAB = register(
            new IronGlassSlabBlock(
                    AbstractBlock.Settings.copy(IRON_GLASS)
            ),
            BlockId.IRON_GLASS_SLAB,
            true
    );

    public static final Block IRON_GLASS_DOOR = register(
            new IronGlassDoorBlock(
                    AbstractBlock.Settings.copy(IRON_GLASS),
                    BlockSetType.IRON
            ),
            BlockId.IRON_GLASS_DOOR,
            true
    );

    public static final Block GOLDEN_GLASS_STAIRS = register(
            new GoldenGlassStairsBlock(
                    GOLDEN_GLASS.getDefaultState(),
                    AbstractBlock.Settings.copy(GOLDEN_GLASS)
            ),
            BlockId.GOLDEN_GLASS_STAIRS,
            true
    );

    public static final Block GOLDEN_GLASS_SLAB = register(
            new GoldenGlassSlabBlock(
                    AbstractBlock.Settings.copy(GOLDEN_GLASS)
            ),
            BlockId.GOLDEN_GLASS_SLAB,
            true
    );

    public static final Block GOLDEN_GLASS_DOOR = register(
            new GoldenGlassDoorBlock(
                    AbstractBlock.Settings.copy(GOLDEN_GLASS),
                    BlockSetType.STONE
            ),
            BlockId.GOLDEN_GLASS_DOOR,
            true
    );

    public static final Block DIAMOND_GLASS_STAIRS = register(
            new DiamondGlassStairsBlock(
                    DIAMOND_GLASS.getDefaultState(),
                    AbstractBlock.Settings.copy(DIAMOND_GLASS)
            ),
            BlockId.DIAMOND_GLASS_STAIRS,
            true
    );

    public static final Block DIAMOND_GLASS_SLAB = register(
            new DiamondGlassSlabBlock(
                    AbstractBlock.Settings.copy(DIAMOND_GLASS)
            ),
            BlockId.DIAMOND_GLASS_SLAB,
            true
    );

    public static final Block DIAMOND_GLASS_DOOR = register(
            new DiamondGlassDoorBlock(
                    AbstractBlock.Settings.copy(DIAMOND_GLASS),
                    BlockSetType.STONE
            ),
            BlockId.DIAMOND_GLASS_DOOR,
            true
    );

    public static final Block ANCIENT_GLASS_STAIRS = register(
            new AncientGlassStairsBlock(
                    ANCIENT_GLASS.getDefaultState(),
                    AbstractBlock.Settings.copy(ANCIENT_GLASS)
            ),
            BlockId.ANCIENT_GLASS_STAIRS,
            true
    );

    public static final Block ANCIENT_GLASS_SLAB = register(
            new AncientGlassSlabBlock(
                    AbstractBlock.Settings.copy(ANCIENT_GLASS)
            ),
            BlockId.ANCIENT_GLASS_SLAB,
            true
    );

    public static final Block ANCIENT_GLASS_DOOR = register(
            new AncientGlassDoorBlock(
                    AbstractBlock.Settings.copy(ANCIENT_GLASS),
                    BlockSetType.STONE
            ),
            BlockId.ANCIENT_GLASS_DOOR,
            true
    );

    public static final Block EMERALD_GLASS_STAIRS = register(
            new EmeraldGlassStairsBlock(
                    EMERALD_GLASS.getDefaultState(),
                    AbstractBlock.Settings.copy(EMERALD_GLASS)
            ),
            BlockId.EMERALD_GLASS_STAIRS,
            true
    );

    public static final Block EMERALD_GLASS_SLAB = register(
            new EmeraldGlassSlabBlock(
                    AbstractBlock.Settings.copy(EMERALD_GLASS)
            ),
            BlockId.EMERALD_GLASS_SLAB,
            true
    );

    public static final Block EMERALD_GLASS_DOOR = register(
            new EmeraldGlassDoorBlock(
                    AbstractBlock.Settings.copy(EMERALD_GLASS),
                    BlockSetType.STONE
            ),
            BlockId.EMERALD_GLASS_DOOR,
            true
    );

    public static final Block REDSTONE_GLASS_STAIRS = register(
            new RedstoneGlassStairsBlock(
                    REDSTONE_GLASS.getDefaultState(),
                    AbstractBlock.Settings.copy(REDSTONE_GLASS)
            ),
            BlockId.REDSTONE_GLASS_STAIRS,
            true
    );

    public static final Block REDSTONE_GLASS_SLAB = register(
            new RedstoneGlassSlabBlock(
                    AbstractBlock.Settings.copy(REDSTONE_GLASS)
            ),
            BlockId.REDSTONE_GLASS_SLAB,
            true
    );

    public static final Block REDSTONE_GLASS_DOOR = register(
            new RedstoneGlassDoorBlock(
                    AbstractBlock.Settings.copy(REDSTONE_GLASS),
                    BlockSetType.STONE
            ),
            BlockId.REDSTONE_GLASS_DOOR,
            true
    );

    public static final Block COPPER_GLASS_STAIRS = register(
            new CopperGlassStairsBlock(
                    COPPER_GLASS.getDefaultState(),
                    AbstractBlock.Settings.copy(COPPER_GLASS)
            ),
            BlockId.COPPER_GLASS_STAIRS,
            true
    );

    public static final Block COPPER_GLASS_SLAB = register(
            new CopperGlassSlabBlock(
                    AbstractBlock.Settings.copy(COPPER_GLASS)
            ),
            BlockId.COPPER_GLASS_SLAB,
            true
    );

    public static final Block COPPER_GLASS_DOOR = register(
            new CopperGlassDoorBlock(
                    AbstractBlock.Settings.copy(COPPER_GLASS),
                    BlockSetType.STONE
            ),
            BlockId.COPPER_GLASS_DOOR,
            true
    );

    public static final Block LAPIS_GLASS_STAIRS = register(
            new LapisGlassStairsBlock(
                    LAPIS_GLASS.getDefaultState(),
                    AbstractBlock.Settings.copy(LAPIS_GLASS)
            ),
            BlockId.LAPIS_GLASS_STAIRS,
            true
    );

    public static final Block LAPIS_GLASS_SLAB = register(
            new LapisGlassSlabBlock(
                    AbstractBlock.Settings.copy(LAPIS_GLASS)
            ),
            BlockId.LAPIS_GLASS_SLAB,
            true
    );

    public static final Block LAPIS_GLASS_DOOR = register(
            new LapisGlassDoorBlock(
                    AbstractBlock.Settings.copy(LAPIS_GLASS),
                    BlockSetType.STONE
            ),
            BlockId.LAPIS_GLASS_DOOR,
            true
    );

    public static final Block GLASS_LAMP = register(
            new GlassLampBlock(
                    AbstractBlock.Settings.copy(ModBlocks.PURIFIED_GLASS)
            ),
            BlockId.GLASS_LAMP,
            true
    );

    public static <T extends Block> T register(T block, String name, boolean shouldRegisterItem) {
        Identifier id = new Identifier("glassworld", name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((entries) -> {
            Item previous = Blocks.GLASS.asItem();
            List<Item> coloredItems = Arrays.asList(
                    ModBlocks.PURIFIED_GLASS.asItem(),
                    ModBlocks.DIAMOND_GLASS.asItem(),
                    ModBlocks.ANCIENT_GLASS.asItem(),
                    ModBlocks.GOLDEN_GLASS.asItem(),
                    ModBlocks.REDSTONE_GLASS.asItem(),
                    ModBlocks.IRON_GLASS.asItem(),
                    ModBlocks.EMERALD_GLASS.asItem(),
                    ModBlocks.COPPER_GLASS.asItem(),
                    ModBlocks.LAPIS_GLASS.asItem(),

                    ModBlocks.SOFT_ANCIENT_GLASS.asItem(),
                    ModBlocks.SOFT_DIAMOND_GLASS.asItem(),
                    ModBlocks.SOFT_GOLDEN_GLASS.asItem(),
                    ModBlocks.SOFT_REDSTONE_GLASS.asItem(),
                    ModBlocks.SOFT_IRON_GLASS.asItem(),
                    ModBlocks.SOFT_EMERALD_GLASS.asItem(),
                    ModBlocks.SOFT_COPPER_GLASS.asItem(),
                    ModBlocks.SOFT_LAPIS_GLASS.asItem()
            );

            for (Item item : coloredItems) {
                entries.addAfter(previous, item);
                previous = item;
            }
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((entries) -> {
            Item previous = Blocks.SAND.asItem();
            List<Item> sandItems = Arrays.asList(
                    ModBlocks.IRON_SAND.asItem(),
                    ModBlocks.COPPER_SAND.asItem(),
                    ModBlocks.GOLDEN_SAND.asItem(),
                    ModBlocks.REDSTONE_SAND.asItem(),
                    ModBlocks.EMERALD_SAND.asItem(),
                    ModBlocks.DIAMOND_SAND.asItem(),
                    ModBlocks.LAPIS_SAND.asItem()
            );

            for (Item item : sandItems) {
                entries.addAfter(previous, item);
                previous = item;
            }

            entries.addAfter(Blocks.SOUL_SAND.asItem(), ModBlocks.ANCIENT_SOUL_SAND.asItem());
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((entries) -> {
            entries.addAfter(Blocks.IRON_DOOR.asItem(), ModBlocks.GLASS_DOOR.asItem());
            entries.addAfter(ModBlocks.GLASS_DOOR.asItem(), ModBlocks.IRON_GLASS_DOOR.asItem());
            entries.addAfter(ModBlocks.IRON_GLASS_DOOR.asItem(), ModBlocks.GOLDEN_GLASS_DOOR.asItem());
            entries.addAfter(ModBlocks.GOLDEN_GLASS_DOOR.asItem(), ModBlocks.REDSTONE_GLASS_DOOR.asItem());
            entries.addAfter(ModBlocks.REDSTONE_GLASS_DOOR.asItem(), ModBlocks.EMERALD_GLASS_DOOR.asItem());
            entries.addAfter(ModBlocks.EMERALD_GLASS_DOOR.asItem(), ModBlocks.COPPER_GLASS_DOOR.asItem());
            entries.addAfter(ModBlocks.COPPER_GLASS_DOOR.asItem(), ModBlocks.LAPIS_GLASS_DOOR.asItem());

            entries.addAfter(Blocks.REDSTONE_LAMP.asItem(), ModBlocks.GLASS_LAMP.asItem());

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((entries) -> {
            entries.addAfter(Blocks.SANDSTONE_STAIRS.asItem(), ModBlocks.GLASS_STAIRS.asItem());
            entries.addAfter(ModBlocks.GLASS_STAIRS.asItem(), ModBlocks.IRON_GLASS_STAIRS.asItem());
            entries.addAfter(ModBlocks.IRON_GLASS_STAIRS.asItem(), ModBlocks.GOLDEN_GLASS_STAIRS.asItem());
            entries.addAfter(ModBlocks.GOLDEN_GLASS_STAIRS.asItem(), ModBlocks.REDSTONE_GLASS_STAIRS.asItem());
            entries.addAfter(ModBlocks.REDSTONE_GLASS_STAIRS.asItem(), ModBlocks.EMERALD_GLASS_STAIRS.asItem());
            entries.addAfter(ModBlocks.EMERALD_GLASS_STAIRS.asItem(), ModBlocks.COPPER_GLASS_STAIRS.asItem());
            entries.addAfter(ModBlocks.COPPER_GLASS_STAIRS.asItem(), ModBlocks.LAPIS_GLASS_STAIRS.asItem());

            entries.addAfter(Blocks.SANDSTONE_SLAB.asItem(), ModBlocks.GLASS_SLAB.asItem());
            entries.addAfter(ModBlocks.GLASS_SLAB.asItem(), ModBlocks.IRON_GLASS_SLAB.asItem());
            entries.addAfter(ModBlocks.IRON_GLASS_SLAB.asItem(), ModBlocks.GOLDEN_GLASS_SLAB.asItem());
            entries.addAfter(ModBlocks.GOLDEN_GLASS_SLAB.asItem(), ModBlocks.REDSTONE_GLASS_SLAB.asItem());
            entries.addAfter(ModBlocks.REDSTONE_GLASS_SLAB.asItem(), ModBlocks.EMERALD_GLASS_SLAB.asItem());
            entries.addAfter(ModBlocks.EMERALD_GLASS_SLAB.asItem(), ModBlocks.COPPER_GLASS_SLAB.asItem());
            entries.addAfter(ModBlocks.COPPER_GLASS_SLAB.asItem(), ModBlocks.LAPIS_GLASS_SLAB.asItem());
        });
    }
}
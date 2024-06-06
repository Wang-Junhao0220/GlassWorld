package com.junhax.glassworld.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CONDENSED_DIRT = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS)
            ), "condensed_dirt", true);
//    public static final Block SUPER_GLASS = register(
//            new Block(
//                    AbstractBlock.Settings.create().strength(100F, 1145140114514F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()
//                            .allowsSpawning(Blocks::never).solidBlock(Blocks::never)
//                            .suffocates(Blocks::never).blockVision(Blocks::never))
//    ), "super_glass",true);
    public static final Block SOFT_SUPER_GLASS = register(
            new Block(
                    AbstractBlock.Settings.create().strength(10F, 1145140114514F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()
            ), "soft_super_glass", true);
    public static final Block SOFT_ANCIENT_GLASS = register(
            new Block(
                    AbstractBlock.Settings.create().strength(10F, 1145140114514F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()
            ), "soft_ancient_glass", true);
    public static final Block ANCIENT_GLASS = register(
            new Block(
                    AbstractBlock.Settings.create().strength(100F, 1145140114514F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()
            ), "ancient_glass", true);
    public static final Block SUPER_GLASS = new Block(
            AbstractBlock.Settings.create().instrument(Instrument.HAT)
                    .strength(100F, 1145140114514F).sounds(BlockSoundGroup.GLASS).of(Material.GLASS).nonOpaque()
                    .allowsSpawning(Blocks::never).solidBlock(Blocks::never)
                    .suffocates(Blocks::never).blockVision(Blocks::never));
//
//    public static final Block GLASS_STAIRS = new GlassStairsBlock(
//            AbstractBlock.Settings.create().instrument(Instrument.HAT)
//                    .strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()
//                    .allowsSpawning(Blocks::never).solidBlock(Blocks::never)
//                    .suffocates(Blocks::never).blockVision(Blocks::never));

//    public static final Block TINTED_GLASS_SLAB = new TintedGlassSlabBlock(
//            AbstractBlock.Settings.copy(Blocks.GLASS).mapColor(MapColor.GRAY)
//                    .nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never)
//                    .suffocates(Blocks::never).blockVision(Blocks::never));
//
//    public static final Block TINTED_GLASS_STAIRS = new TintedGlassStairsBlock(
//            AbstractBlock.Settings.copy(Blocks.GLASS).mapColor(MapColor.GRAY)
//                    .nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never)
//                    .suffocates(Blocks::never).blockVision(Blocks::never));
//    public static final SuperChest SUPER_CHEST = register(
//            new SuperChest(
//                    AbstractBlock.Settings.create().strength(5F, 54188F).requiresTool().sounds(BlockSoundGroup.WOOD)
//            ), "super_chest", true);

    public static <T extends Block> T register(T block, String name, boolean shouldRegisterItem) {
        Identifier id = new Identifier("glassworld", name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
//    public static final BlockEntityType<SuperChestEntity> SUPER_CHEST_ENTITY = Registry.register(
//            Registries.BLOCK_ENTITY_TYPE,
//            new Identifier("glassworld", "super_chest_entity"),
//            FabricBlockEntityTypeBuilder.create(SuperChestEntity::new, SUPER_CHEST).build()
//    );

    public static void initialize() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.add(ModBlocks.CONDENSED_DIRT.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.SUPER_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.ANCIENT_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.SOFT_ANCIENT_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.SOFT_SUPER_GLASS.asItem()));
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register((itemGroup) -> itemGroup.add(ModBlocks.SUPER_CHEST.asItem()));
    }

}

package com.junhax.glassworld.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SOFT_SUPER_GLASS = register(
            new Block(
                    AbstractBlock.Settings.create().strength(8F, 100F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()
            ), "soft_super_glass", true);
    public static final Block SOFT_ANCIENT_GLASS = register(
            new Block(
                    AbstractBlock.Settings.create().strength(10F, 100F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()
            ), "soft_ancient_glass", true);
    public static final Block ANCIENT_GLASS = register(
            new Block(
                    AbstractBlock.Settings.create().strength(40F, 100F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()
            ), "ancient_glass", true);
    public static final Block SUPER_GLASS = new Block(
            AbstractBlock.Settings.create().instrument(Instrument.HAT)
                    .strength(30F, 100F).sounds(BlockSoundGroup.GLASS).nonOpaque()
                    .allowsSpawning(Blocks::always).solidBlock(Blocks::never)
                    .suffocates(Blocks::never).blockVision(Blocks::never));


    public static <T extends Block> T register(T block, String name, boolean shouldRegisterItem) {
        Identifier id = new Identifier("glassworld", name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }


    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.SUPER_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.ANCIENT_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.SOFT_ANCIENT_GLASS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.SOFT_SUPER_GLASS.asItem()));
    }

}

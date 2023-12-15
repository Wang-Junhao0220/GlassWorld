package com.junhax.glassworld;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.registry.RegistryKeys.ITEM_GROUP;

public class ModBlocks {
    public static <T extends Block> T register(T block, String name, boolean shouldRegisterItem) {
        Identifier id = new Identifier("glassworld", name);

        if(shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
    public static final Block CONDENSED_DIRT = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS)
            ), "condensed_dirt", true);
    public static final Block SUPER_GLASS = register(
            new Block(
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS)
            ), "super_glass", true);
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.CONDENSED_DIRT.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(ModBlocks.SUPER_GLASS.asItem()));
    }

}
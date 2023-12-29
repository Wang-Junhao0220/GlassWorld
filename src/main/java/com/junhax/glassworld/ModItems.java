package com.junhax.glassworld;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.junhax.glassworld.ModBlocks.SUPER_GLASS;

public class ModItems {

    public static final Item IRON_SAND = register(new Item(new FabricItemSettings()), "iron_sand");

    // We can use generics to make it, so we don't need to
    // cast to an item when using this method.
    public static <T extends Item> T register(T item, String ID) {
        // Create the identifier for the item.
        Identifier itemID = new Identifier("glassworld", ID);

        // Register the item.
        T registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(IRON_SAND))
            .displayName(Text.translatable("itemGroup.glassword.super_glass"))
            .entries((context, entries) -> {
                entries.add(IRON_SAND);
                entries.add(SUPER_GLASS);
            })
            .build();
    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("glassworld", "super_glass"), ITEM_GROUP);
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.IRON_SAND));
    }
}
package com.junhax.glassworld;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
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
    public static final Item POOP = register(
            new Item(new FabricItemSettings()),
            "poop"
    );
    public static void initialize() {
        ItemGroupEvents
                // Register a "modify" event for the Ingredients item group.
                .modifyEntriesEvent(ItemGroups.INGREDIENTS)
                // Add the item to the group when you get access to it.
                .register((itemGroup) -> itemGroup.add(ModItems.POOP));
    }
}
package com.junhax.glassworld;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.junhax.glassworld.ModBlocks.SUPER_GLASS;

public class ModItems {


    public static final Item IRON_SAND = register(new Item(new FabricItemSettings()), "iron_sand");

    public static final Item INSTANT_HEALTH_APPLE = register(new Item(new FabricItemSettings().fireproof().food(new FoodComponent.Builder()
            .alwaysEdible()
            .snack()
            .hunger(10)
            .saturationModifier(10F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 10 * 60 * 60 * 20, 99), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10 * 60 * 60 * 20, 20), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 10 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 10 * 60 * 60 * 20, 255), 1.0F)
            .build())), "instant_health_apple");
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(IRON_SAND))
            .displayName(Text.translatable("itemGroup.glassworld.super_glass"))
            .entries((context, entries) -> {
                entries.add(IRON_SAND);
                entries.add(SUPER_GLASS);
                entries.add(INSTANT_HEALTH_APPLE);
            })
            .build();

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

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("glassworld", "super_glass"), ITEM_GROUP);
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.INVENTORY)
                .register((itemGroup) -> itemGroup.add(ModItems.IRON_SAND));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(ModItems.INSTANT_HEALTH_APPLE));
    }
}
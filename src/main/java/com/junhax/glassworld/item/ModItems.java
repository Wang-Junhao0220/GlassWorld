package com.junhax.glassworld.item;


import com.junhax.glassworld.effect.ModEffect;
import com.junhax.glassworld.material.*;
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

import static com.junhax.glassworld.block.ModBlocks.*;

public class ModItems {

    public static final Item DIAMOND_SWORD = register(new SwordItem(DiamondGlassMaterial.INSTANCE, 10, 8F, new FabricItemSettings()), "diamond_glass_sword");
    public static final Item DIAMOND_HOE = register(new HoeItem(DiamondGlassMaterial.INSTANCE, 6, 7F, new FabricItemSettings()), "diamond_glass_hoe");
    public static final Item DIAMOND_SHOVEL = register(new ShovelItem(DiamondGlassMaterial.INSTANCE, 8, 5F, new FabricItemSettings()), "diamond_glass_shovel");
    public static final Item DIAMOND_PICKAXE = register(new PickaxeItem(DiamondGlassMaterial.INSTANCE, 8, 5F, new FabricItemSettings()), "diamond_glass_pickaxe");
    public static final Item DIAMOND_AXE = register(new AxeItem(DiamondGlassMaterial.INSTANCE, 14, 6F, new FabricItemSettings()), "diamond_glass_axe");

    public static final Item ANCIENT_PICKAXE = register(new PickaxeItem(AncientGlassMaterial.INSTANCE, 15, 10F, new FabricItemSettings().fireproof()), "ancient_glass_pickaxe");
    public static final Item ANCIENT_SWORD = register(new SwordItem(AncientGlassMaterial.INSTANCE, 8, 8F, new FabricItemSettings().fireproof()), "ancient_glass_sword");
    public static final Item ANCIENT_AXE = register(new AxeItem(AncientGlassMaterial.INSTANCE, 10, 7F, new FabricItemSettings().fireproof()), "ancient_glass_axe");
    public static final Item ANCIENT_SHOVEL = register(new ShovelItem(AncientGlassMaterial.INSTANCE, 10, 7F, new FabricItemSettings().fireproof()), "ancient_glass_shovel");
    public static final Item ANCIENT_HOE = register(new HoeItem(AncientGlassMaterial.INSTANCE, 18, 8F, new FabricItemSettings().fireproof()), "ancient_glass_hoe");

    public static final Item IRON_SAND = register(new Item(new FabricItemSettings()), "iron_sand");

    public static final Item SUPER_GLASS_HELMET = register(new ArmorItem(DiamondGlassArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings()), "diamond_glass_helmet");
    public static final Item SUPER_GLASS_CHESTPLATE = register(new ArmorItem(DiamondGlassArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()), "diamond_glass_chestplate");
    public static final Item SUPER_GLASS_BOOTS = register(new ArmorItem(DiamondGlassArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings()), "diamond_glass_boots");
    public static final Item SUPER_GLASS_LEGGINGS = register(new ArmorItem(DiamondGlassArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()), "diamond_glass_leggings");


    public static final Item ANCIENT_GLASS_HELMET = register(new ArmorItem(AncientGlassArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()), "ancient_glass_helmet");
    public static final Item ANCIENT_GLASS_CHESTPLATE = register(new ArmorItem(AncientGlassArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()), "ancient_glass_chestplate");
    public static final Item ANCIENT_GLASS_BOOTS = register(new ArmorItem(AncientGlassArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()), "ancient_glass_boots");
    public static final Item ANCIENT_GLASS_LEGGINGS = register(new ArmorItem(AncientGlassArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()), "ancient_glass_leggings");

    public static final Item INSTANT_HEALTH_APPLE = register(new Item(new FabricItemSettings().fireproof().food(new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(5)
            .saturationModifier(2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2 * 60 * 20, 5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 10 * 60 * 20, 5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 40 * 60 * 20, 5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 10 * 60 * 20, 30), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 10 * 60 * 20, 5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60 * 20, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 60 * 20, 10), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2 * 60 * 20, 6), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 5 * 60 * 20, 5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5 * 60 * 20, 5), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 40 * 60 * 20, 10), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 10 * 60 * 20, 15), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 10 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(ModEffect.EXP, 20 * 20, 3), 0.4F)
            .build())), "instant_health_apple");

    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(DIAMOND_GLASS))
            .displayName(Text.translatable("itemGroup.glassworld.more_glass"))
            .entries((context, entries) -> {
                entries.add(DIAMOND_GLASS);
                entries.add(SOFT_DIAMOND_GLASS);
                entries.add(ANCIENT_GLASS);
                entries.add(SOFT_ANCIENT_GLASS);
                entries.add(IRON_SAND);
                entries.add(INSTANT_HEALTH_APPLE);
                entries.add(DIAMOND_SHOVEL);
                entries.add(DIAMOND_PICKAXE);
                entries.add(DIAMOND_AXE);
                entries.add(DIAMOND_HOE);
                entries.add(DIAMOND_SWORD);
                entries.add(ANCIENT_SHOVEL);
                entries.add(ANCIENT_PICKAXE);
                entries.add(ANCIENT_AXE);
                entries.add(ANCIENT_HOE);
                entries.add(ANCIENT_SWORD);
                entries.add(SUPER_GLASS_HELMET);
                entries.add(SUPER_GLASS_CHESTPLATE);
                entries.add(SUPER_GLASS_LEGGINGS);
                entries.add(SUPER_GLASS_BOOTS);
                entries.add(ANCIENT_GLASS_HELMET);
                entries.add(ANCIENT_GLASS_CHESTPLATE);
                entries.add(ANCIENT_GLASS_LEGGINGS);
                entries.add(ANCIENT_GLASS_BOOTS);

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
        Registry.register(Registries.ITEM_GROUP, new Identifier("glassworld", "more_glass"), ITEM_GROUP);
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.IRON_SAND));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(ModItems.INSTANT_HEALTH_APPLE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.DIAMOND_SHOVEL));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.DIAMOND_PICKAXE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.DIAMOND_AXE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.DIAMOND_HOE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.DIAMOND_SWORD));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.ANCIENT_SHOVEL));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.ANCIENT_PICKAXE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.ANCIENT_AXE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.ANCIENT_HOE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.ANCIENT_SWORD));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.SUPER_GLASS_HELMET));

        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.SUPER_GLASS_CHESTPLATE));

        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.SUPER_GLASS_LEGGINGS));

        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.SUPER_GLASS_BOOTS));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.ANCIENT_GLASS_HELMET));

        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.ANCIENT_GLASS_CHESTPLATE));

        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.ANCIENT_GLASS_LEGGINGS));

        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.ANCIENT_GLASS_BOOTS));
    }
}
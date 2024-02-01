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
    public static final Item GUIDITE_SWORD = register(new SwordItem(GuiditeMaterial.INSTANCE, 72, 20F, new FabricItemSettings().fireproof()), "guidite_sword");

    public static final Item SUPER_SWORD = register(new SwordItem(SuperGlassMaterial.INSTANCE, 72, 20F, new FabricItemSettings().fireproof()), "super_sword");

    public static final Item SUPER_HOE = register(new HoeItem(SuperGlassMaterial.INSTANCE, 38, 10F, new FabricItemSettings().fireproof()), "super_hoe");

    public static final Item SUPER_SHOVEL = register(new ShovelItem(SuperGlassMaterial.INSTANCE, 40, 12F, new FabricItemSettings().fireproof()), "super_shovel");

    public static final Item SUPER_PICKAXE = register(new PickaxeItem(SuperGlassMaterial.INSTANCE, 48, 16F, new FabricItemSettings().fireproof()), "super_pickaxe");

    public static final Item SUPER_AXE = register(new AxeItem(SuperGlassMaterial.INSTANCE, 40, 8F, new FabricItemSettings().fireproof()), "super_axe");

    public static final Item ANCIENT_PICKAXE = register(new PickaxeItem(AncientGlassMaterial.INSTANCE, 50, 18F, new FabricItemSettings().fireproof()), "ancient_pickaxe");

    public static final Item ANCIENT_SWORD = register(new SwordItem(AncientGlassMaterial.INSTANCE, 100, 30F, new FabricItemSettings().fireproof()), "ancient_sword");

    public static final Item ANCIENT_AXE = register(new AxeItem(AncientGlassMaterial.INSTANCE, 60, 10F, new FabricItemSettings().fireproof()), "ancient_axe");

    public static final Item ANCIENT_SHOVEL = register(new ShovelItem(AncientGlassMaterial.INSTANCE, 50, 12F, new FabricItemSettings().fireproof()), "ancient_shovel");

    public static final Item ANCIENT_HOE = register(new HoeItem(AncientGlassMaterial.INSTANCE, 45, 14F, new FabricItemSettings().fireproof()), "ancient_hoe");

    public static final Item IRON_SAND = register(new Item(new FabricItemSettings().fireproof()), "iron_sand");

    public static final Item SUPER_GLASS_HELMET = register(new ArmorItem(SuperGlassArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()), "super_helmet");
    public static final Item SUPER_GLASS_CHESTPLATE = register(new ArmorItem(SuperGlassArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()), "super_chestplate");
    public static final Item SUPER_GLASS_BOOTS = register(new ArmorItem(SuperGlassArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()), "super_boots");
    public static final Item SUPER_GLASS_LEGGINGS = register(new ArmorItem(SuperGlassArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()), "super_leggings");


    public static final Item ANCIENT_GLASS_HELMET = register(new ArmorItem(AncientGlassArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()), "ancient_helmet");
    public static final Item ANCIENT_GLASS_CHESTPLATE = register(new ArmorItem(AncientGlassArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()), "ancient_chestplate");
    public static final Item ANCIENT_GLASS_BOOTS = register(new ArmorItem(AncientGlassArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()), "ancient_boots");
    public static final Item ANCIENT_GLASS_LEGGINGS = register(new ArmorItem(AncientGlassArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()), "ancient_leggings");

    public static final Item INSTANT_HEALTH_APPLE = register(new Item(new FabricItemSettings().fireproof().food(new FoodComponent.Builder()
            .alwaysEdible()
            .snack()
            .hunger(20)
            .saturationModifier(20F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000 * 60 * 60 * 20, 99), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000 * 60 * 60 * 20, 20), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 1000 * 60 * 60 * 20, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(ModEffect.EXP, 1000 * 60 * 60 * 20, 255), 1.0F)
            .build())), "instant_health_apple");
    //    public static final Item ANCIENT_GLASS_UPGRADE_TEMPLATE= register(new SmithingTemplateItem(),"ancient_glass_upgrade_template");
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(SUPER_GLASS))
            .displayName(Text.translatable("itemGroup.glassworld.super_glass"))
            .entries((context, entries) -> {
                entries.add(SUPER_GLASS);
                entries.add(SOFT_SUPER_GLASS);
                entries.add(ANCIENT_GLASS);
                entries.add(SOFT_ANCIENT_GLASS);
                entries.add(IRON_SAND);
                entries.add(INSTANT_HEALTH_APPLE);
                entries.add(SUPER_SHOVEL);
                entries.add(SUPER_PICKAXE);
                entries.add(SUPER_AXE);
                entries.add(SUPER_HOE);
                entries.add(SUPER_SWORD);
                entries.add(ANCIENT_SHOVEL);
                entries.add(ANCIENT_PICKAXE);
                entries.add(ANCIENT_AXE);
                entries.add(ANCIENT_HOE);
                entries.add(ANCIENT_SWORD);
                entries.add(SUPER_GLASS_HELMET);
                entries.add(SUPER_GLASS_CHESTPLATE);
                entries.add(SUPER_GLASS_BOOTS);
                entries.add(SUPER_GLASS_LEGGINGS);
                //TODO:add ancients

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
                .modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.IRON_SAND));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(ModItems.INSTANT_HEALTH_APPLE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.SUPER_SHOVEL));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.SUPER_PICKAXE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.SUPER_AXE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.SUPER_HOE));
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(ModItems.SUPER_SWORD));
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
        //TODO:add ancients & textures, layers

    }
}
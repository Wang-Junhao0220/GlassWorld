package com.junhax.glassworld.datagen;

import com.junhax.glassworld.block.ModBlocks;
import com.junhax.glassworld.effect.ModEffects;
import com.junhax.glassworld.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // 添加方块翻译
        translationBuilder.add(ModBlocks.PURIFIED_GLASS, "Purified Glass");
        translationBuilder.add(ModBlocks.DIAMOND_GLASS, "Diamond Glass");
        translationBuilder.add(ModBlocks.SOFT_DIAMOND_GLASS, "Soft Diamond Glass");
        translationBuilder.add(ModBlocks.ANCIENT_GLASS, "Ancient Glass");
        translationBuilder.add(ModBlocks.SOFT_ANCIENT_GLASS, "Soft Ancient Glass");
        translationBuilder.add(ModBlocks.GOLDEN_GLASS, "Golden Glass");
        translationBuilder.add(ModBlocks.SOFT_GOLDEN_GLASS, "Soft Golden Glass");
        translationBuilder.add(ModBlocks.REDSTONE_GLASS, "Redstone Glass");
        translationBuilder.add(ModBlocks.SOFT_REDSTONE_GLASS, "Soft Redstone Glass");
        translationBuilder.add(ModBlocks.IRON_GLASS, "Iron Glass");
        translationBuilder.add(ModBlocks.SOFT_IRON_GLASS, "Soft Iron Glass");
        translationBuilder.add(ModBlocks.EMERALD_GLASS, "Emerald Glass");
        translationBuilder.add(ModBlocks.SOFT_EMERALD_GLASS, "Soft Emerald Glass");
        translationBuilder.add(ModBlocks.COPPER_GLASS, "Copper Glass");
        translationBuilder.add(ModBlocks.SOFT_COPPER_GLASS, "Soft Copper Glass");
        translationBuilder.add(ModBlocks.IRON_SAND, "Iron Sand");
        translationBuilder.add(ModBlocks.COPPER_SAND, "Copper Sand");
        translationBuilder.add(ModBlocks.GOLDEN_SAND, "Golden Sand");
        translationBuilder.add(ModBlocks.REDSTONE_SAND, "Redstone Sand");
        translationBuilder.add(ModBlocks.EMERALD_SAND, "Emerald Sand");
        translationBuilder.add(ModBlocks.DIAMOND_SAND, "Diamond Sand");
        translationBuilder.add(ModBlocks.ANCIENT_SOUL_SAND, "Ancient Soul Sand");

        translationBuilder.add(ModBlocks.IRON_GLASS_STAIRS, "Iron Glass Stairs");
        translationBuilder.add(ModBlocks.IRON_GLASS_SLAB, "Iron Glass Slab");
        translationBuilder.add(ModBlocks.IRON_GLASS_DOOR, "Iron Glass Door");

        translationBuilder.add(ModBlocks.GLASS_STAIRS, "Glass Stairs");
        translationBuilder.add(ModBlocks.GLASS_SLAB, "Glass Slab");

        // 添加物品翻译
        translationBuilder.add(ModItems.DIAMOND_GLASS_SWORD, "Diamond Glass Sword");
        translationBuilder.add(ModItems.DIAMOND_GLASS_HOE, "Diamond Glass Hoe");
        translationBuilder.add(ModItems.DIAMOND_GLASS_SHOVEL, "Diamond Glass Shovel");
        translationBuilder.add(ModItems.DIAMOND_GLASS_PICKAXE, "Diamond Glass Pickaxe");
        translationBuilder.add(ModItems.DIAMOND_GLASS_AXE, "Diamond Glass Axe");
        translationBuilder.add(ModItems.ANCIENT_GLASS_PICKAXE, "Ancient Glass Pickaxe");
        translationBuilder.add(ModItems.ANCIENT_GLASS_SWORD, "Ancient Glass Sword");
        translationBuilder.add(ModItems.ANCIENT_GLASS_AXE, "Ancient Glass Axe");
        translationBuilder.add(ModItems.ANCIENT_GLASS_SHOVEL, "Ancient Glass Shovel");
        translationBuilder.add(ModItems.ANCIENT_GLASS_HOE, "Ancient Glass Hoe");
        translationBuilder.add(ModItems.DIAMOND_GLASS_HELMET, "Diamond Glass Helmet");
        translationBuilder.add(ModItems.DIAMOND_GLASS_CHESTPLATE, "Diamond Glass Chestplate");
        translationBuilder.add(ModItems.DIAMOND_GLASS_BOOTS, "Diamond Glass Boots");
        translationBuilder.add(ModItems.DIAMOND_GLASS_LEGGINGS, "Diamond Glass Leggings");
        translationBuilder.add(ModItems.ANCIENT_GLASS_HELMET, "Ancient Glass Helmet");
        translationBuilder.add(ModItems.ANCIENT_GLASS_CHESTPLATE, "Ancient Glass Chestplate");
        translationBuilder.add(ModItems.ANCIENT_GLASS_BOOTS, "Ancient Glass Boots");
        translationBuilder.add(ModItems.ANCIENT_GLASS_LEGGINGS, "Ancient Glass Leggings");
        translationBuilder.add(ModItems.INSTANT_HEALTH_APPLE, "Super Apple");

        // 添加药水效果翻译
        translationBuilder.add(ModEffects.EXP, "Exp");
        translationBuilder.add(ModEffects.DYING, "Dying");

        // 添加附魔翻译
        translationBuilder.add("enchantment.glassworld.super_kill", "Super Kill");

        // 添加物品组翻译
        translationBuilder.add("itemGroup.glassworld.more_glass", "More Glass");
    }
}

package com.junhax.glassworld.datagen;

import com.junhax.glassworld.block.ModBlocks;
import com.junhax.glassworld.item.ModItems;
import com.junhax.glassworld.effect.ModEffects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // 方块翻译
        translationBuilder.add(ModBlocks.PURIFIED_GLASS, "纯化玻璃");
        translationBuilder.add(ModBlocks.DIAMOND_GLASS, "钻石玻璃");
        translationBuilder.add(ModBlocks.SOFT_DIAMOND_GLASS, "软钻石玻璃");
        translationBuilder.add(ModBlocks.ANCIENT_GLASS, "远古玻璃");
        translationBuilder.add(ModBlocks.SOFT_ANCIENT_GLASS, "软远古玻璃");
        translationBuilder.add(ModBlocks.GOLDEN_GLASS, "镀金玻璃");
        translationBuilder.add(ModBlocks.SOFT_GOLDEN_GLASS, "软镀金玻璃");
        translationBuilder.add(ModBlocks.REDSTONE_GLASS, "红石玻璃");
        translationBuilder.add(ModBlocks.SOFT_REDSTONE_GLASS, "软红石玻璃");
        translationBuilder.add(ModBlocks.IRON_GLASS, "钢化玻璃");
        translationBuilder.add(ModBlocks.SOFT_IRON_GLASS, "软钢化玻璃");
        translationBuilder.add(ModBlocks.EMERALD_GLASS, "绿石玻璃");
        translationBuilder.add(ModBlocks.SOFT_EMERALD_GLASS, "软绿石玻璃");
        translationBuilder.add(ModBlocks.COPPER_GLASS, "镀铜玻璃");
        translationBuilder.add(ModBlocks.SOFT_COPPER_GLASS, "软镀铜玻璃");
        translationBuilder.add(ModBlocks.IRON_SAND, "铁砂");
        translationBuilder.add(ModBlocks.COPPER_SAND, "铜砂");
        translationBuilder.add(ModBlocks.GOLDEN_SAND, "金砂");
        translationBuilder.add(ModBlocks.REDSTONE_SAND, "赤石砂");
        translationBuilder.add(ModBlocks.EMERALD_SAND, "绿石砂");
        translationBuilder.add(ModBlocks.DIAMOND_SAND, "钻砂");
        translationBuilder.add(ModBlocks.ANCIENT_SOUL_SAND, "远古灵魂沙");

        translationBuilder.add(ModBlocks.IRON_GLASS_STAIRS, "钢化玻璃楼梯");
        translationBuilder.add(ModBlocks.IRON_GLASS_SLAB, "钢化玻璃台阶");
        translationBuilder.add(ModBlocks.IRON_GLASS_DOOR, "钢化玻璃门");

        translationBuilder.add(ModBlocks.GLASS_STAIRS, "玻璃台阶");

        // 物品翻译
        translationBuilder.add(ModItems.DIAMOND_GLASS_SWORD, "钻石玻璃剑");
        translationBuilder.add(ModItems.DIAMOND_GLASS_HOE, "钻石玻璃锄");
        translationBuilder.add(ModItems.DIAMOND_GLASS_SHOVEL, "钻石玻璃铲");
        translationBuilder.add(ModItems.DIAMOND_GLASS_PICKAXE, "钻石玻璃稿");
        translationBuilder.add(ModItems.DIAMOND_GLASS_AXE, "钻石玻璃斧");
        translationBuilder.add(ModItems.ANCIENT_GLASS_PICKAXE, "远古玻璃稿");
        translationBuilder.add(ModItems.ANCIENT_GLASS_SWORD, "远古玻璃剑");
        translationBuilder.add(ModItems.ANCIENT_GLASS_AXE, "远古玻璃斧");
        translationBuilder.add(ModItems.ANCIENT_GLASS_SHOVEL, "远古玻璃铲");
        translationBuilder.add(ModItems.ANCIENT_GLASS_HOE, "远古玻璃锄");
        translationBuilder.add(ModItems.DIAMOND_GLASS_HELMET, "钻石玻璃头盔");
        translationBuilder.add(ModItems.DIAMOND_GLASS_CHESTPLATE, "钻石玻璃胸甲");
        translationBuilder.add(ModItems.DIAMOND_GLASS_BOOTS, "钻石玻璃靴子");
        translationBuilder.add(ModItems.DIAMOND_GLASS_LEGGINGS, "钻石玻璃护腿");
        translationBuilder.add(ModItems.ANCIENT_GLASS_HELMET, "远古玻璃头盔");
        translationBuilder.add(ModItems.ANCIENT_GLASS_CHESTPLATE, "远古玻璃胸甲");
        translationBuilder.add(ModItems.ANCIENT_GLASS_BOOTS, "远古玻璃靴子");
        translationBuilder.add(ModItems.ANCIENT_GLASS_LEGGINGS, "远古玻璃护腿");
        translationBuilder.add(ModItems.INSTANT_HEALTH_APPLE, "超级苹果");

        // 药水效果翻译
        translationBuilder.add(ModEffects.EXP, "经验加成");
        translationBuilder.add(ModEffects.DYING, "濒死");

        // 附魔翻译
        translationBuilder.add("enchantment.glassworld.super_kill", "秒杀");

        // 物品组翻译
        translationBuilder.add("itemGroup.glassworld.more_glass", "更多玻璃");
    }
}

package com.junhax.glassworld.datagen;

import com.junhax.glassworld.block.ModBlocks;
import com.junhax.glassworld.enchantment.ModEnchantments;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static final LootCondition.Builder WITH_GLASS_BREAKER = MatchToolLootCondition.builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(ModEnchantments.GLASS_BREAKER, NumberRange.IntRange.atLeast(1))));


    @Override
    public void generate() {
        // Add all sand blocks
        addDrop(ModBlocks.IRON_SAND);
        addDrop(ModBlocks.GOLDEN_SAND);
        addDrop(ModBlocks.EMERALD_SAND);
        addDrop(ModBlocks.DIAMOND_SAND);
        addDrop(ModBlocks.COPPER_SAND);
        addDrop(ModBlocks.REDSTONE_SAND);
        addDrop(ModBlocks.ANCIENT_SOUL_SAND);
        // Glasses
        addDrop(Blocks.GLASS, glassBlockDrops(Blocks.GLASS));
        addDrop(ModBlocks.PURIFIED_GLASS, glassBlockDrops(ModBlocks.PURIFIED_GLASS));
        addDrop(ModBlocks.COPPER_GLASS, glassBlockDrops(ModBlocks.COPPER_GLASS));
        addDrop(ModBlocks.IRON_GLASS, glassBlockDrops(ModBlocks.IRON_GLASS));
        addDrop(ModBlocks.GOLDEN_GLASS, glassBlockDrops(ModBlocks.GOLDEN_GLASS));
        addDrop(ModBlocks.EMERALD_GLASS, glassBlockDrops(ModBlocks.EMERALD_GLASS));
        addDrop(ModBlocks.DIAMOND_GLASS, glassBlockDrops(ModBlocks.DIAMOND_GLASS));
        addDrop(ModBlocks.COPPER_GLASS, glassBlockDrops(ModBlocks.COPPER_GLASS));
        addDrop(ModBlocks.REDSTONE_GLASS, glassBlockDrops(ModBlocks.REDSTONE_GLASS));
        addDrop(ModBlocks.ANCIENT_GLASS, glassBlockDrops(ModBlocks.ANCIENT_GLASS));
        // Soft Glasses
        addDrop(ModBlocks.SOFT_IRON_GLASS, glassBlockDrops(ModBlocks.SOFT_IRON_GLASS));
        addDrop(ModBlocks.SOFT_GOLDEN_GLASS, glassBlockDrops(ModBlocks.SOFT_GOLDEN_GLASS));
        addDrop(ModBlocks.SOFT_EMERALD_GLASS, glassBlockDrops(ModBlocks.SOFT_EMERALD_GLASS));
        addDrop(ModBlocks.SOFT_DIAMOND_GLASS, glassBlockDrops(ModBlocks.SOFT_DIAMOND_GLASS));
        addDrop(ModBlocks.SOFT_COPPER_GLASS, glassBlockDrops(ModBlocks.SOFT_COPPER_GLASS));
        addDrop(ModBlocks.SOFT_REDSTONE_GLASS, glassBlockDrops(ModBlocks.SOFT_REDSTONE_GLASS));
        addDrop(ModBlocks.SOFT_ANCIENT_GLASS, glassBlockDrops(ModBlocks.SOFT_ANCIENT_GLASS));

        addDrop(ModBlocks.IRON_GLASS_STAIRS);
        addDrop(ModBlocks.IRON_GLASS_SLAB, slabDrops(ModBlocks.IRON_GLASS_SLAB));
        addDrop(ModBlocks.IRON_GLASS_DOOR, doorDrops(ModBlocks.IRON_GLASS_DOOR));
    }

    public static LootTable.Builder glassBreakerDrops(ItemConvertible drop) {
        return LootTable.builder().pool(LootPool.builder().conditionally(WITH_GLASS_BREAKER).rolls(ConstantLootNumberProvider.create(1.0f)).with(ItemEntry.builder(drop)));
    }

    public static LootTable.Builder glassBreakerDrops(Block drop, LootPoolEntry.Builder<?> child) {
        return BlockLootTableGenerator.drops(drop, WITH_GLASS_BREAKER, child);
    }

    public LootTable.Builder glassBlockDrops(Block block) {
        return glassBreakerDrops(
                block,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        block,
                        ItemEntry.builder(block)
                                .apply(ApplyBonusLootFunction.oreDrops(ModEnchantments.GLASS_BREAKER))
                )
        );
    }
}
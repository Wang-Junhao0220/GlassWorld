package com.junhax.glassworld.datagen;

import com.junhax.glassworld.block.ModBlocks;
import com.junhax.glassworld.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Add all blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURIFIED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMOND_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOFT_DIAMOND_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOFT_ANCIENT_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLDEN_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOFT_GOLDEN_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REDSTONE_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOFT_REDSTONE_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOFT_IRON_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMERALD_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOFT_EMERALD_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COPPER_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOFT_COPPER_GLASS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COPPER_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLDEN_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REDSTONE_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMERALD_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMOND_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_SOUL_SAND);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // All items
        itemModelGenerator.register(ModItems.ANCIENT_GLASS_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_GLASS_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_GLASS_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_GLASS_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_GLASS_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_GLASS_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_GLASS_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_GLASS_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_GLASS_SWORD, Models.GENERATED);

        itemModelGenerator.register(ModItems.DIAMOND_GLASS_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GLASS_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GLASS_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GLASS_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GLASS_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GLASS_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GLASS_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GLASS_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GLASS_SWORD, Models.GENERATED);

        itemModelGenerator.register(ModItems.INSTANT_HEALTH_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_GLASS_AXE, Models.GENERATED);
    }
}
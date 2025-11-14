package com.junhax.glassworld.datagen;

import com.junhax.glassworld.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.IRON_SAND)
                .add(ModBlocks.COPPER_SAND)
                .add(ModBlocks.GOLDEN_SAND)
                .add(ModBlocks.REDSTONE_SAND)
                .add(ModBlocks.EMERALD_SAND)
                .add(ModBlocks.DIAMOND_SAND)
                .add(ModBlocks.ANCIENT_SOUL_SAND);

    }
}
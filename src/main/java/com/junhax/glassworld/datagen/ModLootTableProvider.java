package com.junhax.glassworld.datagen;

import com.junhax.glassworld.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // Add all sand blocks
        drops(ModBlocks.IRON_SAND);
        drops(ModBlocks.GOLDEN_SAND);
        drops(ModBlocks.EMERALD_SAND);
        drops(ModBlocks.DIAMOND_SAND);
        drops(ModBlocks.COPPER_SAND);
        drops(ModBlocks.REDSTONE_SAND);
        drops(ModBlocks.ANCIENT_SOUL_SAND);
    }
}
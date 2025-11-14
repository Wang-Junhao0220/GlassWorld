package com.junhax.glassworld;

import com.junhax.glassworld.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;


public class GlassWorldDataGeneration implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagsProvider::new);
        pack.addProvider(ModEnUsLangProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModModelsProvider::new);
        pack.addProvider(ModZhCnLangProvider::new);
        pack.addProvider(ModRecipesProvider::new);
    }
}

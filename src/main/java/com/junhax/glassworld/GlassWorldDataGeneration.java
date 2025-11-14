package com.junhax.glassworld;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import com.junhax.glassworld.datagen.ModEnUsLangProvider;
import com.junhax.glassworld.datagen.ModBlockTagsProvider;
import com.junhax.glassworld.datagen.ModLootTableProvider;
import com.junhax.glassworld.datagen.ModModelsProvider;
import com.junhax.glassworld.datagen.ModZhCnLangProvider;


public class GlassWorldDataGeneration implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagsProvider::new);
        pack.addProvider(ModEnUsLangProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModModelsProvider::new);
        pack.addProvider(ModZhCnLangProvider::new);

    }
}

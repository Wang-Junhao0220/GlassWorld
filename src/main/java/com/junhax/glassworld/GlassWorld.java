package com.junhax.glassworld;

import com.junhax.glassworld.block.ModBlocks;
import com.junhax.glassworld.effect.ModEffects;
import com.junhax.glassworld.enchantment.ModEnchantments;
import com.junhax.glassworld.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlassWorld implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("glassworld");
    public static final String MOD_ID = "glassworld";
    public static final RegistryKey<PlacedFeature> DIAMOND_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "diamond_ore"));
    public static final RegistryKey<PlacedFeature> GOLD_BLOCK_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "gold_block"));
    public static final RegistryKey<PlacedFeature> ANCIENT_DEBRIS_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "ancient_debris"));
    public static final RegistryKey<PlacedFeature> EMERALD_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "emerald_ore"));
    public static final RegistryKey<PlacedFeature> ORE_IRON_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "ore_iron"));

    @Override
    public void onInitialize() {
        LOGGER.warn("Initializing Enchantments");
        ModEnchantments.initialize();
        LOGGER.warn("Initializing Items");
        ModItems.initialize();
        LOGGER.warn("Initializing Blocks");
        ModBlocks.initialize();
        LOGGER.warn("Initializing Effects");
        ModEffects.initialize();
        LOGGER.warn("Initializing Ores");
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, DIAMOND_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, GOLD_BLOCK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ANCIENT_DEBRIS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, EMERALD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_IRON_PLACED_KEY);
    }
}
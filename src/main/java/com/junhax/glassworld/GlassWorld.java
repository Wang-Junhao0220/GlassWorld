package com.junhax.glassworld;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import com.junhax.glassworld.block.ModBlocks;
import com.junhax.glassworld.effect.ModEffect;
import com.junhax.glassworld.enchantment.SuperKillEnchantment;
import com.junhax.glassworld.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlassWorld implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("glassworld");
    public static Enchantment SUPER_KILL = new SuperKillEnchantment();
    public static final Item NETHERITE_SHIELD = new FabricShieldItem(new Item.Settings().maxDamage(2500), 10, 13, Items.NETHERITE_INGOT);
    public static final RegistryKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "ore_custom"));
    public static final RegistryKey<PlacedFeature> DIAMOND_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "diamond_ore"));
    public static final RegistryKey<PlacedFeature> GOLD_BLOCK_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "gold_block"));
    public static final RegistryKey<PlacedFeature> ANCIENT_DEBRIS_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "ancient_debris"));
    public static final RegistryKey<PlacedFeature> EMERALD_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "emerald_ore"));
    public static final RegistryKey<PlacedFeature> ORE_IRON_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("glassworld", "ore_iron"));
//    public static final Item NETHERITE_SHIELD = new FabricShieldItem(new Item.Settings().maxDamage(2500),10, 13, Items.NETHERITE_INGOT); // FabricShieldItem(settings.maxDamage(durability), cooldownTicks, enchantability, repairItems)

    @Override
    public void onInitialize() {

//        Registry.register(Registries.ITEM, new Identifier("glassworld", "netherite_shield"), NETHERITE_SHIELD);
        LOGGER.info("Hello Fabric world!");
        Registry.register(Registries.ENCHANTMENT, new Identifier("glassworld", "super_kill"), SUPER_KILL);
        try {
            ModItems.initialize();
            ModBlocks.initialize();
            ModEffect.initialize();
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            LOGGER.error("Failed when trying to load the blocks, items and effects!");
            System.out.println("Failed when trying to load the blocks, items and effects!");
        }
        try {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, DIAMOND_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, GOLD_BLOCK_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ANCIENT_DEBRIS_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, EMERALD_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_IRON_PLACED_KEY);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            LOGGER.error("Failed when trying to add a custom ore!");
            System.out.println("Failed when trying to add a custom ore!");
        }
        Registry.register(Registries.ITEM, new Identifier("glassworld", "netherite_shield"), NETHERITE_SHIELD);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(NETHERITE_SHIELD));
    }
}
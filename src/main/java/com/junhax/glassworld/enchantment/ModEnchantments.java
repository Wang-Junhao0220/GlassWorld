package com.junhax.glassworld.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModEnchantments {
    // TODO: Use GlassBreaker to break glass-ish blocks, However didn't work now for pickaxe without it can break glass. What's more, enchantment registrations' namespace is still "minecraft"
    public static final Enchantment GLASS_BREAKER = ModEnchantments.register("glass_breaker", new GlassBreakerEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND}));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, name, enchantment);
    }

    public static void initialize() {

    }
}

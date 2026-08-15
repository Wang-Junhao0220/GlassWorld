package com.junhax.glassworld.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    // TODO: Use GlassBreaker to break glass-ish blocks, However didn't work now for pickaxe without it can break glass. What's more, enchantment registrations' namespace is still "minecraft"
    public static final Enchantment GLASS_BREAKER = new GlassBreakerEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND});
    public static final Enchantment SUPER_KILL = new SuperKillEnchantment();

    public static void initialize() {
        Registry.register(Registries.ENCHANTMENT, new Identifier("glassworld", "glass_breaker"), GLASS_BREAKER);
        Registry.register(Registries.ENCHANTMENT, new Identifier("glassworld", "super_kill"), SUPER_KILL);
    }
}

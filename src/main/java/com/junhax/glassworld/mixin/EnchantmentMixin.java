package com.junhax.glassworld.mixin;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DamageEnchantment.class)
public abstract class EnchantmentMixin {
    /**
     * @author Junhax
     * @reason Make enchantments more powerful
     */
    @Overwrite
    public int getMaxLevel() {
        return 10;
    }
}

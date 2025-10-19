package com.junhax.glassworld.mixin;


import net.minecraft.enchantment.KnockbackEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(KnockbackEnchantment.class)
public abstract class KnockbackEnchantmentMixin {
    /**
     * @author Junhax
     * @reason Make enchantments more powerful
     */
    @Overwrite
    public int getMaxLevel() {
        return 5;
    }
}

package com.junhax.glassworld.mixin;

import net.minecraft.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ProtectionEnchantment.class)
public class ProtectionEnchantmentMixin {
    /**
     * @author Junhax
     * @reason Make PROTECTION enchantment more powerful
     */
    @Overwrite
    public int getMaxLevel() {
        return 10;
    }
}

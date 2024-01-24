package com.junhax.glassworld.mixin;

import net.minecraft.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Enchantment.class)
public abstract class EnchantmentMixin {
    /**
     * @author Junhax
     * @reason Make enchantments more powerful
     */
    @Overwrite
    public int getMaxLevel() {
        return 20;
    }
}

package com.junhax.glassworld.mixin;

import net.minecraft.enchantment.LuckEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(LuckEnchantment.class)
public abstract class LuckEnchantmentMixin {
    /**
     * @author Junhax
     * @reason Make more drops in mining
     */
    @Overwrite
    public int getMaxLevel() {
        return 5;
    }
}

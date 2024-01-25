package com.junhax.glassworld.mixin;


import net.minecraft.enchantment.FrostWalkerEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(FrostWalkerEnchantment.class)
public abstract class FrostWalkerEnchantmentMixin {
    /**
     * @author Junhax
     * @reason Make enchantments more powerful
     */
    @Overwrite
    public int getMaxLevel() {
        return 10;
    }
}

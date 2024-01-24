package com.junhax.glassworld.mixin;

import net.minecraft.enchantment.UnbreakingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(UnbreakingEnchantment.class)
public class UnbreakingEnchantmentMixin {
    /**
     * @author Junhax
     * @reason Unbreaking!
     */
    @Overwrite
    public int getMaxLevel() {
        return 10;
    }
}

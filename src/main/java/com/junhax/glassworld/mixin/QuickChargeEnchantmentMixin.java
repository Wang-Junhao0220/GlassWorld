package com.junhax.glassworld.mixin;

import net.minecraft.enchantment.QuickChargeEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(QuickChargeEnchantment.class)
public class QuickChargeEnchantmentMixin {
    /**
     * @author Junhax
     * @reason Shoot!
     */
    @Overwrite
    public int getMaxLevel() {
        return 10;
    }
}

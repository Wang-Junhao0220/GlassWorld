package com.junhax.glassworld.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.UnbreakingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(UnbreakingEnchantment.class)
public abstract class UnbreakingEnchantmentMixin extends Enchantment {
    protected UnbreakingEnchantmentMixin(Enchantment.Rarity weight, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.BREAKABLE, slotTypes);
    }
    /**
     * @author Junhax
     * @reason Unbreaking!
     */
    @Overwrite
    public int getMaxLevel() {
        return 6;
    }

    /**
     * @author Junhax
     * @reason Level 6 will allow the item to keep its durability
     */
    @Overwrite
    public static boolean shouldPreventDamage(ItemStack item, int level, Random random) {
        if(level == 6) {
            return true;
        }
        if (item.getItem() instanceof ArmorItem && random.nextFloat() < 0.6f) {
            return false;
        }
        return random.nextInt(level + 1) > 0;
    }
}

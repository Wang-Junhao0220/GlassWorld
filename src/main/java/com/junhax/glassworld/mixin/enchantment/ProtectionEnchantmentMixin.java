package com.junhax.glassworld.mixin.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.registry.tag.DamageTypeTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ProtectionEnchantment.class)
public abstract class ProtectionEnchantmentMixin extends Enchantment {

    @Unique
    public final ProtectionEnchantment.Type protectionType;

    public ProtectionEnchantmentMixin(Enchantment.Rarity weight, ProtectionEnchantment.Type protectionType, EquipmentSlot ... slotTypes) {
        super(weight, protectionType == ProtectionEnchantment.Type.FALL ? EnchantmentTarget.ARMOR_FEET : EnchantmentTarget.ARMOR, slotTypes);
        this.protectionType = protectionType;
    }


    /**
     * @author Junhax
     * @reason Make PROTECTION enchantment more powerful
     */
    @Overwrite
    public int getMaxLevel() {
        return 9;
    }

    /**
     * @author Junhax
     * @reason Add Magic Protection For Higher Levels
     */
    @Overwrite
    public int getProtectionAmount(int level, DamageSource source) {
        if (source.isIn(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
            if(level>=5) {
                return level - 5;
            }
        }
        if (this.protectionType == ProtectionEnchantment.Type.ALL) {
            return level;
        }
        if (this.protectionType == ProtectionEnchantment.Type.FIRE && source.isIn(DamageTypeTags.IS_FIRE)) {
            return level * 2;
        }
        if (this.protectionType == ProtectionEnchantment.Type.FALL && source.isIn(DamageTypeTags.IS_FALL)) {
            return level * 3;
        }
        if (this.protectionType == ProtectionEnchantment.Type.EXPLOSION && source.isIn(DamageTypeTags.IS_EXPLOSION)) {
            return level * 2;
        }
        if (this.protectionType == ProtectionEnchantment.Type.PROJECTILE && source.isIn(DamageTypeTags.IS_PROJECTILE)) {
            return level * 2;
        }
        return 0;
    }

}

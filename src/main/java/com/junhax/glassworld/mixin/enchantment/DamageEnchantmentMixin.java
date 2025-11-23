package com.junhax.glassworld.mixin.enchantment;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

@Mixin(DamageEnchantment.class)
public abstract class DamageEnchantmentMixin extends Enchantment{
    @Unique
    private static final int ALL_INDEX = 0;
    @Unique
    private static final int UNDEAD_INDEX = 1;
    @Unique
    private static final int ARTHROPODS_INDEX = 2;
    @Unique
    private static final String[] TYPE_NAMES = new String[]{"all", "undead", "arthropods"};
    @Unique
    private static final int[] BASE_POWERS = new int[]{1, 5, 5};
    @Unique
    private static final int[] POWERS_PER_LEVEL = new int[]{11, 8, 8};
    @Unique
    private static final int[] MIN_MAX_POWER_DIFFERENCES = new int[]{20, 20, 20};
    @Unique
    public final int typeIndex;

    public DamageEnchantmentMixin(Enchantment.Rarity weight, int typeIndex, EquipmentSlot... slots) {
        super(weight, EnchantmentTarget.WEAPON, slots);
        this.typeIndex = typeIndex;
    }
    /**
     * @author Junhax
     * @reason Make enchantments more powerful
     */
    @Overwrite
    public int getMaxLevel() {
        return 8;
    }

    /**
     * @author Junhax
     * @reason More Powerful!
     */
    @Overwrite
    public float getAttackDamage(int level, EntityGroup group) {
        if (this.typeIndex == 0) {
            return 1.0f + (float)Math.max(0, level - 1) * 0.8f;
        }
        if (this.typeIndex == 1 && group == EntityGroup.UNDEAD) {
            return (float)level * 2.5f;
        }
        if (this.typeIndex == 2 && group == EntityGroup.ARTHROPOD) {
            return (float)level * 2.5f;
        }
        return 0.0f;
    }

    /**
     * @author Junhax
     * @reason More Powerful!
     */
    @Overwrite
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity livingEntity) {
            if (this.typeIndex == 2 && level > 0 && livingEntity.getGroup() == EntityGroup.ARTHROPOD) {
                int i = 20 + user.getRandom().nextInt(20 * level);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, i, level));
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, i, level));
            }
        }
    }
}

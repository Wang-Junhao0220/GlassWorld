package com.junhax.glassworld.material;

import com.junhax.glassworld.block.ModBlocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SuperGlassArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{3, 6, 8, 3};

    public static final SuperGlassArmorMaterial INSTANCE = new SuperGlassArmorMaterial();
    @Override
    public int getEnchantability() {
        return 500;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        // This will get the protection value for the slot from
        // our array.
        return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
    }
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        // Replace X with a multiplier that you see fit!
        // For reference, diamond uses a multiplier of 33, whilst
        // leather uses 11.
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * 3350;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModBlocks.SUPER_GLASS,ModBlocks.SOFT_ANCIENT_GLASS);
    }

    @Override
    public String getName() {
        // Must be all lowercase
        return "super_glass";
    }
    @Override
    public float getToughness() {
        return 5F;
    }
    @Override
    public float getKnockbackResistance() {
        return 5F;
    }
}

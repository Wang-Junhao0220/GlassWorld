package com.junhax.glassworld.material;

import com.junhax.glassworld.block.ModBlocks;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class AncientGlassArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{23, 26, 28, 23};

    public static final AncientGlassArmorMaterial INSTANCE = new AncientGlassArmorMaterial();
    @Override
    public int getEnchantability() {
        return 1000;
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
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * 13350;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModBlocks.ANCIENT_GLASS,ModBlocks.SOFT_ANCIENT_GLASS);
    }

    @Override
    public String getName() {
        // Must be all lowercase
        return "ancient_glass";
    }
    @Override
    public float getToughness() {
        return 10F;
    }
    @Override
    public float getKnockbackResistance() {
        return 2F;
    }
}

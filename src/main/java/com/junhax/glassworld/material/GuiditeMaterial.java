package com.junhax.glassworld.material;

import com.junhax.glassworld.block.ModBlocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GuiditeMaterial implements ToolMaterial {
    // Your IDE should override the interface's methods for you.
    public static final GuiditeMaterial INSTANCE = new GuiditeMaterial();

    @Override
    public int getDurability() {
        return 1145140;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1000F;
    }

    @Override
    public float getAttackDamage() {
        return 72F;
    }

    @Override
    public int getMiningLevel() {
        return 10;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModBlocks.SUPER_GLASS, ModBlocks.SOFT_SUPER_GLASS);
    }
}
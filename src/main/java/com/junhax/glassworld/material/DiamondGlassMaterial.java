package com.junhax.glassworld.material;

import com.junhax.glassworld.block.ModBlocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DiamondGlassMaterial implements ToolMaterial {
    // Your IDE should override the interface's methods for you.
    public static final DiamondGlassMaterial INSTANCE = new DiamondGlassMaterial();

    @Override
    public int getDurability() {
        return 1250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10F;
    }

    @Override
    public float getAttackDamage() {
        return 1F;
    }

    @Override
    public int getMiningLevel() {
        return 10;
    }

    @Override
    public int getEnchantability() {
        return 80;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModBlocks.DIAMOND_GLASS);
    }
}
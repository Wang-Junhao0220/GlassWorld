package com.junhax.glassworld.material;

import com.junhax.glassworld.block.ModBlocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SuperGlassMaterial implements ToolMaterial {
    // Your IDE should override the interface's methods for you.
    public static final SuperGlassMaterial INSTANCE = new SuperGlassMaterial();

    @Override
    public int getDurability() {
        return 114514;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 25.0F;
    }

    @Override
    public float getAttackDamage() {
        return 18F;
    }

    @Override
    public int getMiningLevel() {
        return 10;
    }

    @Override
    public int getEnchantability() {
        return 500;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModBlocks.SUPER_GLASS, ModBlocks.SOFT_SUPER_GLASS);
    }
}
package com.junhax.glassworld.material;

import com.junhax.glassworld.block.ModBlocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OpMaterial implements ToolMaterial {
    // Your IDE should override the interface's methods for you.
    public static final OpMaterial INSTANCE = new OpMaterial();

    @Override
    public int getDurability() {
        return -1;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1000F;
    }

    @Override
    public float getAttackDamage() {
        return 10000F;
    }

    @Override
    public int getMiningLevel() {
        return 100;
    }

    @Override
    public int getEnchantability() {
        return 5000;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModBlocks.SUPER_GLASS, ModBlocks.SOFT_SUPER_GLASS);
    }
}

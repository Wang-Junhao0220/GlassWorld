package com.junhax.glassworld.material;

import com.junhax.glassworld.block.ModBlocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AncientGlassMaterial implements ToolMaterial {
    // Your IDE should override the interface's methods for you.
    public static final AncientGlassMaterial INSTANCE = new AncientGlassMaterial();

    @Override
    public int getDurability() {
        return 2350;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15F;
    }

    @Override
    public float getAttackDamage() {
        return 2F;
    }

    @Override
    public int getMiningLevel() {
        return 15;
    }

    @Override
    public int getEnchantability() {
        return 80;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModBlocks.ANCIENT_GLASS);
    }
}
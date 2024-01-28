package com.junhax.glassworld.material;

import com.junhax.glassworld.block.ModBlocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AncientGlassMaterial implements ToolMaterial {
    // Your IDE should override the interface's methods for you.
    public static final AncientGlassMaterial INSTANCE = new AncientGlassMaterial();

    @Override
    public int getDurability() {
        return 13350;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 40F;
    }

    @Override
    public float getAttackDamage() {
        return 25F;
    }

    @Override
    public int getMiningLevel() {
        return 15;
    }

    @Override
    public int getEnchantability() {
        return 800;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModBlocks.ANCIENT_GLASS, ModBlocks.SOFT_ANCIENT_GLASS);
    }
}
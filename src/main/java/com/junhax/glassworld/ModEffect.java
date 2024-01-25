package com.junhax.glassworld;

import com.junhax.glassworld.effect.ExpStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffect {
    public static final StatusEffect EXP = new ExpStatusEffect();

    public static void initialize() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("glassworld", "exp"), EXP);
    }
}

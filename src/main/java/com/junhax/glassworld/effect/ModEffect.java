package com.junhax.glassworld.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffect {
    public static final StatusEffect EXP = new ExpStatusEffect();
    public static final StatusEffect DYING = new DyingStatusEffect();

    public static void initialize() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("glassworld", "exp"), EXP);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("glassworld", "dying"), DYING);
    }
}

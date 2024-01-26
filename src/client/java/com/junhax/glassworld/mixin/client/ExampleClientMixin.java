package com.junhax.glassworld.mixin.client;

import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.gui.screen.TitleScreen;

@Mixin(MinecraftClient.class)
public class ExampleClientMixin {
    @Inject(at = @At("HEAD"), method = "run")
    private void run(CallbackInfo info) {
        // This code is injected into the start of MinecraftClient.run()V
        Logger LOGGER = LoggerFactory.getLogger("glassworld");
        LOGGER.info("----------------------------Hello from Fabric client Mixin!----------------------------");
    }
}
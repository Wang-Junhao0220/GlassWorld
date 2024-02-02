package com.junhax.glassworld.mixin.client;

import net.minecraft.client.gui.screen.TitleScreen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenClientMixin {

    @Inject(at = @At("HEAD"), method = "init")
    private void init(CallbackInfo info) {
        Logger LOGGER_MIXIN = LoggerFactory.getLogger("Client Init Mixin");
        LOGGER_MIXIN.info("Welcome to Minecraft! Enjoy!");

    }
}
package com.junhax.glassworld;

import com.junhax.glassworld.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlassWorldClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("glassworld");
    public void onInitializeClient() {
        LOGGER.info("GlassWorld Client Initializing");
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SUPER_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ANCIENT_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SOFT_ANCIENT_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SOFT_SUPER_GLASS, RenderLayer.getCutout());
    }
}
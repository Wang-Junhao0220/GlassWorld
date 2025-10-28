package com.junhax.glassworld;

import com.junhax.glassworld.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlassWorldClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("glassworld");
    public void onInitializeClient() {
        LOGGER.info("GlassWorld Client Initializing");
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIAMOND_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ANCIENT_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOLDEN_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REDSTONE_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SOFT_ANCIENT_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SOFT_DIAMOND_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SOFT_GOLDEN_GLASS, RenderLayer.getCutout());
    }
}
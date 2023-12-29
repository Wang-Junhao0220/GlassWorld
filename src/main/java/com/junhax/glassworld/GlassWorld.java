package com.junhax.glassworld;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlassWorld implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("glassworld");
	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
		ModItems.initialize();
		ModBlocks.initialize();
	}
}
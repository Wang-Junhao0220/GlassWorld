package com.junhax.glassworld.block.lamp;

import com.junhax.glassworld.block.abstractblock.AbstractGlassLampBlock;

public class GlassLampBlock extends AbstractGlassLampBlock {
    public GlassLampBlock(Settings settings) {
        super(settings.luminance(state -> 15));
    }
}

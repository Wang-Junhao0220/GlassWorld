package com.junhax.glassworld;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final TagKey<Block> GLASS_BLOCK_TAG = createTag("glass_block_tag");
    public static final TagKey<Block> GLASS_STAIRS_TAG = createTag("glass_stairs_tag");
    public static final TagKey<Block> GLASS_SLAB_TAG = createTag("glass_slab_tag");

    private static TagKey<Block> createTag(String idPath)
    {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(GlassWorld.MOD_ID, idPath));
    }
}

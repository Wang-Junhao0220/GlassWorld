package com.junhax.glassworld.datagen;

import com.junhax.glassworld.GlassWorld;
import com.junhax.glassworld.block.ModBlocks;
import com.junhax.glassworld.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> ANCIENT_GLASS = List.of(ModBlocks.ANCIENT_SOUL_SAND);
    public static final List<ItemConvertible> IRON_GLASS = List.of(ModBlocks.IRON_SAND);
    public static final List<ItemConvertible> GOLDEN_GLASS = List.of(ModBlocks.GOLDEN_SAND);
    public static final List<ItemConvertible> COPPER_GLASS = List.of(ModBlocks.COPPER_SAND);
    public static final List<ItemConvertible> DIAMOND_GLASS = List.of(ModBlocks.DIAMOND_SAND);
    public static final List<ItemConvertible> EMERALD_GLASS = List.of(ModBlocks.EMERALD_SAND);
    public static final List<ItemConvertible> REDSTONE_GLASS = List.of(ModBlocks.REDSTONE_SAND);
    public static final List<ItemConvertible> PURIFIED_GLASS = List.of(Blocks.GLASS);

    public static final List<ItemConvertible> SOFT_ANCIENT_GLASS = List.of(ModBlocks.ANCIENT_GLASS);
    public static final List<ItemConvertible> SOFT_IRON_GLASS = List.of(ModBlocks.IRON_GLASS);
    public static final List<ItemConvertible> SOFT_GOLDEN_GLASS = List.of(ModBlocks.GOLDEN_GLASS);
    public static final List<ItemConvertible> SOFT_DIAMOND_GLASS = List.of(ModBlocks.DIAMOND_GLASS);
    public static final List<ItemConvertible> SOFT_EMERALD_GLASS = List.of(ModBlocks.EMERALD_GLASS);
    public static final List<ItemConvertible> SOFT_REDSTONE_GLASS = List.of(ModBlocks.REDSTONE_GLASS);
    public static final List<ItemConvertible> SOFT_COPPER_GLASS = List.of(ModBlocks.COPPER_GLASS);



    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, ANCIENT_GLASS, RecipeCategory.MISC, ModBlocks.ANCIENT_GLASS, 0.7F, 200, "ancient_glass");
        offerSmelting(exporter, IRON_GLASS, RecipeCategory.MISC, ModBlocks.IRON_GLASS, 0.7F, 100, "iron_glass");
        offerSmelting(exporter, GOLDEN_GLASS, RecipeCategory.MISC, ModBlocks.GOLDEN_GLASS, 0.7F, 50, "golden_glass");
        offerSmelting(exporter, COPPER_GLASS, RecipeCategory.MISC, ModBlocks.COPPER_GLASS, 0.7F, 100, "copper_glass");
        offerSmelting(exporter, DIAMOND_GLASS, RecipeCategory.MISC, ModBlocks.DIAMOND_GLASS, 0.7F, 150, "diamond_glass");
        offerSmelting(exporter, EMERALD_GLASS, RecipeCategory.MISC, ModBlocks.EMERALD_GLASS, 0.7F, 120, "emerald_glass");
        offerSmelting(exporter, REDSTONE_GLASS, RecipeCategory.MISC, ModBlocks.REDSTONE_GLASS, 0.7F, 80, "redstone_glass");
        offerSmelting(exporter, PURIFIED_GLASS, RecipeCategory.MISC, ModBlocks.PURIFIED_GLASS, 0.7F, 100, "purified_glass");

        offerSmelting(exporter, SOFT_ANCIENT_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_ANCIENT_GLASS, 0.5F, 100, "soft_ancient_glass");
        offerSmelting(exporter, SOFT_IRON_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_IRON_GLASS, 0.5F, 50, "soft_iron_glass");
        offerSmelting(exporter, SOFT_GOLDEN_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_GOLDEN_GLASS, 0.5F, 25, "soft_golden_glass");
        offerSmelting(exporter, SOFT_DIAMOND_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_DIAMOND_GLASS, 0.5F, 75, "soft_diamond_glass");
        offerSmelting(exporter, SOFT_EMERALD_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_EMERALD_GLASS, 0.5F, 60, "soft_emerald_glass");
        offerSmelting(exporter, SOFT_REDSTONE_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_REDSTONE_GLASS, 0.5F, 40, "soft_redstone_glass");
        offerSmelting(exporter, SOFT_COPPER_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_COPPER_GLASS, 0.5F, 50, "soft_copper_glass");

        offerBlasting(exporter, ANCIENT_GLASS, RecipeCategory.MISC, ModBlocks.ANCIENT_GLASS, 0.8F, 100, "ancient_glass");
        offerBlasting(exporter, IRON_GLASS, RecipeCategory.MISC, ModBlocks.IRON_GLASS, 0.8F, 50, "iron_glass");
        offerBlasting(exporter, GOLDEN_GLASS, RecipeCategory.MISC, ModBlocks.GOLDEN_GLASS, 0.8F, 25, "golden_glass");
        offerBlasting(exporter, COPPER_GLASS, RecipeCategory.MISC, ModBlocks.COPPER_GLASS, 0.8F, 50, "copper_glass");
        offerBlasting(exporter, DIAMOND_GLASS, RecipeCategory.MISC, ModBlocks.DIAMOND_GLASS, 0.8F, 75, "diamond_glass");
        offerBlasting(exporter, EMERALD_GLASS, RecipeCategory.MISC, ModBlocks.EMERALD_GLASS, 0.8F, 60, "emerald_glass");
        offerBlasting(exporter, REDSTONE_GLASS, RecipeCategory.MISC, ModBlocks.REDSTONE_GLASS, 0.8F, 40, "redstone_glass");
        offerBlasting(exporter, PURIFIED_GLASS, RecipeCategory.MISC, ModBlocks.PURIFIED_GLASS, 0.8F, 50, "purified_glass");

        offerBlasting(exporter, SOFT_ANCIENT_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_ANCIENT_GLASS, 0.7F, 50, "soft_ancient_glass");
        offerBlasting(exporter, SOFT_IRON_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_IRON_GLASS, 0.7F, 25, "soft_iron_glass");
        offerBlasting(exporter, SOFT_GOLDEN_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_GOLDEN_GLASS, 0.7F, 15, "soft_golden_glass");
        offerBlasting(exporter, SOFT_DIAMOND_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_DIAMOND_GLASS, 0.7F, 50, "soft_diamond_glass");
        offerBlasting(exporter, SOFT_EMERALD_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_EMERALD_GLASS, 0.7F, 40, "soft_emerald_glass");
        offerBlasting(exporter, SOFT_REDSTONE_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_REDSTONE_GLASS, 0.7F, 30, "soft_redstone_glass");
        offerBlasting(exporter, SOFT_COPPER_GLASS, RecipeCategory.MISC, ModBlocks.SOFT_COPPER_GLASS, 0.7F, 25, "soft_copper_glass");

        /*
        ###
        #@#
        ###

        #=Blocks.SAND
        @=Blocks.IRON_BLOCK

        Result:Iron Sand*8

        Json Recipe Shaped
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IRON_SAND, 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', Blocks.SAND)
                .input('@', Items.IRON_INGOT)
                .criterion(hasItem(Blocks.SAND), conditionsFromItem(Blocks.SAND))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "iron_sand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GOLDEN_SAND, 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', Blocks.SAND)
                .input('@', Items.GOLD_INGOT)
                .criterion(hasItem(Blocks.SAND), conditionsFromItem(Blocks.SAND))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "golden_sand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EMERALD_SAND, 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', Blocks.SAND)
                .input('@', Items.EMERALD)
                .criterion(hasItem(Blocks.SAND), conditionsFromItem(Blocks.SAND))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "emerald_sand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DIAMOND_SAND, 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', Blocks.SAND)
                .input('@', Items.DIAMOND)
                .criterion(hasItem(Blocks.SAND), conditionsFromItem(Blocks.SAND))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_sand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COPPER_SAND, 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', Blocks.SAND)
                .input('@', Items.COPPER_INGOT)
                .criterion(hasItem(Blocks.SAND), conditionsFromItem(Blocks.SAND))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "copper_sand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REDSTONE_SAND, 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', Blocks.SAND)
                .input('@', Items.REDSTONE)
                .criterion(hasItem(Blocks.SAND), conditionsFromItem(Blocks.SAND))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "redstone_sand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_SOUL_SAND, 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', Blocks.SOUL_SAND)
                .input('@', Items.NETHERITE_SCRAP)
                .criterion(hasItem(Blocks.SAND), conditionsFromItem(Blocks.SAND))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_soul_sand"));

        /*
        Recipes for armors and tools
        Diamond Glass Pickaxe:
        ###
         @
         @
        # diamond_glass
        @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_GLASS_PICKAXE,1)
                .pattern("###")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', ModBlocks.DIAMOND_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.DIAMOND_GLASS), conditionsFromItem(ModBlocks.DIAMOND_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_glass_pickaxe"));

        /*
        Recipes for armors and tools
        Diamond Glass Axe:
        ##
        @#
         @
        # diamond_glass
        @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_GLASS_AXE,1)
                .pattern("##")
                .pattern("@#")
                .pattern(" @")
                .input('#', ModBlocks.DIAMOND_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.DIAMOND_GLASS), conditionsFromItem(ModBlocks.DIAMOND_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_glass_axe"));

        /*
        Recipes for armors and tools
        Diamond Glass Shovel:
        #
        @
        @
        # diamond_glass
        @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_GLASS_SHOVEL,1)
                .pattern("#")
                .pattern("@")
                .pattern("@")
                .input('#', ModBlocks.DIAMOND_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.DIAMOND_GLASS), conditionsFromItem(ModBlocks.DIAMOND_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_glass_shovel"));

        /*
        Recipes for armors and tools
        Diamond Glass Hoe:
         ##
          @
          @
          # diamond_glass
          @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_GLASS_HOE,1)
                .pattern("## ")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', ModBlocks.DIAMOND_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.DIAMOND_GLASS), conditionsFromItem(ModBlocks.DIAMOND_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_glass_hoe"));

        /*
        Recipes for armors and tools
        Diamond Glass Sword:
        #
        #
        @
        # diamond_glass
        @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_GLASS_SWORD,1)
                .pattern("#")
                .pattern("#")
                .pattern("@")
                .input('#', ModBlocks.DIAMOND_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.DIAMOND_GLASS), conditionsFromItem(ModBlocks.DIAMOND_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_glass_sword"));

        /*
        Recipes for armors and tools
        Diamond Glass Helmet:
        ###
        # #
        # diamond_glass
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_GLASS_HELMET,1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModBlocks.DIAMOND_GLASS)
                .criterion(hasItem(ModBlocks.DIAMOND_GLASS), conditionsFromItem(ModBlocks.DIAMOND_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_glass_helmet"));

        /*
        Recipes for armors and tools
        Diamond Glass Chestplate:
        # #
        ###
        ###
        # diamond_glass
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_GLASS_CHESTPLATE,1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.DIAMOND_GLASS)
                .criterion(hasItem(ModBlocks.DIAMOND_GLASS), conditionsFromItem(ModBlocks.DIAMOND_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_glass_chestplate"));

        /*
        Recipes for armors and tools
        Diamond Glass Leggings:
        ###
        # #
        # #
        # diamond_glass
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_GLASS_LEGGINGS,1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModBlocks.DIAMOND_GLASS)
                .criterion(hasItem(ModBlocks.DIAMOND_GLASS), conditionsFromItem(ModBlocks.DIAMOND_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_glass_leggings"));

        /*
        Recipes for armors and tools
        Diamond Glass Boots:
        # #
        # #
        # diamond_glass
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_GLASS_BOOTS,1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModBlocks.DIAMOND_GLASS)
                .criterion(hasItem(ModBlocks.DIAMOND_GLASS), conditionsFromItem(ModBlocks.DIAMOND_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "diamond_glass_boots"));

        /*
        Recipes for armors and tools
        Ancient Glass Pickaxe:
        ###
         @
         @
        # ancient_glass
        @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANCIENT_GLASS_PICKAXE,1)
                .pattern("###")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', ModBlocks.ANCIENT_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.ANCIENT_GLASS), conditionsFromItem(ModBlocks.ANCIENT_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_glass_pickaxe"));

        /*
        Recipes for armors and tools
        Ancient Glass Axe:
        ##
        @#
         @
        # ancient_glass
        @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANCIENT_GLASS_AXE,1)
                .pattern("##")
                .pattern("@#")
                .pattern(" @")
                .input('#', ModBlocks.ANCIENT_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.ANCIENT_GLASS), conditionsFromItem(ModBlocks.ANCIENT_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_glass_axe"));

        /*
        Recipes for armors and tools
        Ancient Glass Shovel:
        #
        @
        @
        # ancient_glass
        @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANCIENT_GLASS_SHOVEL,1)
                .pattern("#")
                .pattern("@")
                .pattern("@")
                .input('#', ModBlocks.ANCIENT_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.ANCIENT_GLASS), conditionsFromItem(ModBlocks.ANCIENT_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_glass_shovel"));

        /*
        Recipes for armors and tools
        Ancient Glass How:
        ##
        @
        @
        # ancient_glass
        @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANCIENT_GLASS_HOE,1)
                .pattern("## ")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', ModBlocks.ANCIENT_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.ANCIENT_GLASS), conditionsFromItem(ModBlocks.ANCIENT_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_glass_hoe"));

        /*
        Recipes for armors and tools
        Ancient Glass Sword:
        #
        #
        @
        # ancient_glass
        @ stick
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANCIENT_GLASS_SWORD,1)
                .pattern("#")
                .pattern("#")
                .pattern("@")
                .input('#', ModBlocks.ANCIENT_GLASS)
                .input('@', Items.STICK)
                .criterion(hasItem(ModBlocks.ANCIENT_GLASS), conditionsFromItem(ModBlocks.ANCIENT_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_glass_sword"));

        /*
        Recipes for armors and tools
        Ancient Glass Helmet:
        ###
        # #
        # ancient_glass
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANCIENT_GLASS_HELMET,1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModBlocks.ANCIENT_GLASS)
                .criterion(hasItem(ModBlocks.ANCIENT_GLASS), conditionsFromItem(ModBlocks.ANCIENT_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_glass_helmet"));

        /*
        Recipes for armors and tools
        Ancient Glass Chestplate:
        # #
        ###
        ###
        # ancient_glass
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANCIENT_GLASS_CHESTPLATE,1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.ANCIENT_GLASS)
                .criterion(hasItem(ModBlocks.ANCIENT_GLASS), conditionsFromItem(ModBlocks.ANCIENT_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_glass_chestplate"));

        /*
        Recipes for armors and tools
        Ancient Glass Leggings:
        ###
        # #
        # #
        # ancient_glass
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANCIENT_GLASS_LEGGINGS,1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModBlocks.ANCIENT_GLASS)
                .criterion(hasItem(ModBlocks.ANCIENT_GLASS), conditionsFromItem(ModBlocks.ANCIENT_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_glass_leggings"));

        /*
        Recipes for armors and tools
        Ancient Glass Boots:
        # #
        # #
        # ancient_glass
         */

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANCIENT_GLASS_BOOTS,1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModBlocks.ANCIENT_GLASS)
                .criterion(hasItem(ModBlocks.ANCIENT_GLASS), conditionsFromItem(ModBlocks.ANCIENT_GLASS))
                .offerTo(exporter, new Identifier(GlassWorld.MOD_ID, "ancient_glass_boots"));

    }
}
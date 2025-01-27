package net.rutracrafter.oresenhanced.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.rutracrafter.oresenhanced.Item.ModItems;
import net.rutracrafter.oresenhanced.OresEnhanced;
import net.rutracrafter.oresenhanced.block.ModBlocks;

import java.awt.*;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> JAZERITH_SMELTABLES = List.of(
            ModItems.RAW_JAZERITH.get(),
            ModBlocks.JAZERITH_ORE.get()
    );

    private static final List<ItemLike> SKADIUM_SMELTABLES = List.of(
            ModItems.RAW_SKADIUM.get(),
            ModBlocks.SKADIUM_ORE.get()
    );

    private static final List<ItemLike> KELGAMITE_SMELTABLES = List.of(

            ModItems.RAW_KELGAMITE.get(),
            ModBlocks.KELGAMITE_ORE.get()
    );

    private static final List<ItemLike> RAZION_SMELTABLES = List.of(
            ModItems.RAW_RAZION.get(),
            ModBlocks.RAZION_ORE.get()
    );

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, JAZERITH_SMELTABLES, RecipeCategory.MISC, ModItems.JAZERITH.get(),
                0.25f, 200, "jazerith");
        oreBlasting(pWriter, JAZERITH_SMELTABLES, RecipeCategory.MISC, ModItems.JAZERITH.get(),
                0.25f, 100, "jazerith");

        oreSmelting(pWriter, SKADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.SKADIUM.get(),
                0.25f, 200, "skadium");
        oreBlasting(pWriter, SKADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.SKADIUM.get(),
                0.25f, 100, "skadium");

        oreSmelting(pWriter, KELGAMITE_SMELTABLES, RecipeCategory.MISC, ModItems.KELGAMITE.get(),
                0.25f, 200, "kelgamite");
        oreBlasting(pWriter, KELGAMITE_SMELTABLES, RecipeCategory.MISC, ModItems.KELGAMITE.get(),
                0.25f, 100, "kelgamite");

        oreSmelting(pWriter, RAZION_SMELTABLES, RecipeCategory.MISC, ModItems.RAZION.get(),
                0.25f, 200, "jazerith");
        oreBlasting(pWriter, RAZION_SMELTABLES, RecipeCategory.MISC, ModItems.RAZION.get(),
                0.25f, 100, "jazerith");



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JAZERITH_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.JAZERITH.get())
                .unlockedBy(getHasName(ModItems.JAZERITH.get()), has(ModItems.JAZERITH.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JAZERITH.get(), 9)
                .requires(ModBlocks.JAZERITH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.JAZERITH_BLOCK.get()), has(ModBlocks.JAZERITH_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_JAZERITH_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RAW_JAZERITH.get())
                .unlockedBy(getHasName(ModItems.RAW_JAZERITH.get()), has(ModItems.RAW_JAZERITH.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_JAZERITH.get(), 9)
                .requires(ModBlocks.RAW_JAZERITH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_JAZERITH_BLOCK.get()), has(ModBlocks.RAW_JAZERITH_BLOCK.get()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SKADIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SKADIUM.get())
                .unlockedBy(getHasName(ModItems.SKADIUM.get()), has(ModItems.SKADIUM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SKADIUM.get(), 9)
                .requires(ModBlocks.SKADIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SKADIUM_BLOCK.get()), has(ModBlocks.SKADIUM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SKADIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_SKADIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_SKADIUM.get()), has(ModItems.RAW_SKADIUM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SKADIUM.get(), 9)
                .requires(ModBlocks.RAW_SKADIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SKADIUM_BLOCK.get()), has(ModBlocks.RAW_SKADIUM_BLOCK.get()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.KELGAMITE_BLOCK.get())
                .pattern("KKK")
                .pattern("KKK")
                .pattern("KKK")
                .define('K', ModItems.KELGAMITE.get())
                .unlockedBy(getHasName(ModItems.KELGAMITE.get()), has(ModItems.KELGAMITE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.KELGAMITE.get(), 9)
                .requires(ModBlocks.KELGAMITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.KELGAMITE_BLOCK.get()), has(ModBlocks.KELGAMITE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_KELGAMITE_BLOCK.get())
                .pattern("KKK")
                .pattern("KKK")
                .pattern("KKK")
                .define('K', ModItems.RAW_KELGAMITE.get())
                .unlockedBy(getHasName(ModItems.RAW_KELGAMITE.get()), has(ModItems.RAW_KELGAMITE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_KELGAMITE.get(), 9)
                .requires(ModBlocks.RAW_KELGAMITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_KELGAMITE_BLOCK.get()), has(ModBlocks.RAW_KELGAMITE_BLOCK.get()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAZION_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RAZION.get())
                .unlockedBy(getHasName(ModItems.RAZION.get()), has(ModItems.RAZION.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAZION.get(), 9)
                .requires(ModBlocks.RAZION_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAZION_BLOCK.get()), has(ModBlocks.RAZION_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RAZION_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RAW_RAZION.get())
                .unlockedBy(getHasName(ModItems.RAW_RAZION.get()), has(ModItems.RAW_RAZION.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RAZION.get(), 9)
                .requires(ModBlocks.RAW_RAZION_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_RAZION_BLOCK.get()), has(ModBlocks.RAW_RAZION_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, OresEnhanced.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
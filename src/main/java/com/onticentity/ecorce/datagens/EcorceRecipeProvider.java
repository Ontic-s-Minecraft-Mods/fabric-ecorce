package com.onticentity.ecorce.datagens;

import com.onticentity.ecorce.items.EcorceItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

import static com.onticentity.ecorce.tags.EcorceTags.OUTER_BARKS;

public class EcorceRecipeProvider extends FabricRecipeProvider {
    public EcorceRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                shapeless(
                                RecipeCategory.TOOLS,
                                EcorceItems.BARK_LIGHTER
                        )
                        .requires(OUTER_BARKS)
                        .requires(Items.STICK)
                        .unlockedBy(
                                "has_outer_bark",
                                has(OUTER_BARKS)
                        )
                        .save(output);

                shaped(
                        RecipeCategory.TOOLS,
                        Items.BOWL
                )
                        .pattern("B B")
                        .pattern(" B ")
                        .define('B', OUTER_BARKS)
                        .unlockedBy(
                                "has_outer_bark",
                                has(OUTER_BARKS)
                        )
                        .save(output);

                // OAK
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(EcorceItems.OAK_INNER_BARK),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                EcorceItems.CHARRED_OAK_INNER_BARK,
                                0.1f,
                                200
                        )
                        .unlockedBy(
                                "has_oak_inner_bark",
                                has(EcorceItems.OAK_INNER_BARK)
                        )
                        .save(output);

                // SPRUCE
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(EcorceItems.SPRUCE_INNER_BARK),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                EcorceItems.CHARRED_SPRUCE_INNER_BARK,
                                0.1f,
                                200
                        )
                        .unlockedBy(
                                "has_spruce_inner_bark",
                                has(EcorceItems.SPRUCE_INNER_BARK)
                        )
                        .save(output);

                // BIRCH
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(EcorceItems.BIRCH_INNER_BARK),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                EcorceItems.CHARRED_BIRCH_INNER_BARK,
                                0.1f,
                                200
                        )
                        .unlockedBy(
                                "has_birch_inner_bark",
                                has(EcorceItems.BIRCH_INNER_BARK)
                        )
                        .save(output);

                // JUNGLE
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(EcorceItems.JUNGLE_INNER_BARK),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                EcorceItems.CHARRED_JUNGLE_INNER_BARK,
                                0.2f,
                                200
                        )
                        .unlockedBy(
                                "has_jungle_inner_bark",
                                has(EcorceItems.JUNGLE_INNER_BARK)
                        )
                        .save(output);

                // ACACIA
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(EcorceItems.ACACIA_INNER_BARK),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                EcorceItems.CHARRED_ACACIA_INNER_BARK,
                                0.2f,
                                200
                        )
                        .unlockedBy(
                                "has_acacia_inner_bark",
                                has(EcorceItems.ACACIA_INNER_BARK)
                        )
                        .save(output);

                // DARK OAK
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(EcorceItems.DARK_OAK_INNER_BARK),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                EcorceItems.CHARRED_DARK_OAK_INNER_BARK,
                                0.2f,
                                200
                        )
                        .unlockedBy(
                                "has_dark_oak_inner_bark",
                                has(EcorceItems.DARK_OAK_INNER_BARK)
                        )
                        .save(output);

                // MANGROVE
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(EcorceItems.MANGROVE_INNER_BARK),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                EcorceItems.CHARRED_MANGROVE_INNER_BARK,
                                0.4f,
                                200
                        )
                        .unlockedBy(
                                "has_mangrove_inner_bark",
                                has(EcorceItems.MANGROVE_INNER_BARK)
                        )
                        .save(output);

                // CHERRY
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(EcorceItems.CHERRY_INNER_BARK),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                EcorceItems.CHARRED_CHERRY_INNER_BARK,
                                0.3f,
                                200
                        )
                        .unlockedBy(
                                "has_cherry_inner_bark",
                                has(EcorceItems.CHERRY_INNER_BARK)
                        )
                        .save(output);

                // PALE OAK
                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(EcorceItems.PALE_OAK_INNER_BARK),
                                RecipeCategory.FOOD,
                                CookingBookCategory.FOOD,
                                EcorceItems.CHARRED_PALE_OAK_INNER_BARK,
                                0.3f,
                                200
                        )
                        .unlockedBy(
                                "has_pale_oak_inner_bark",
                                has(EcorceItems.PALE_OAK_INNER_BARK)
                        )
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "RubisRecipeProvider";
    }
}

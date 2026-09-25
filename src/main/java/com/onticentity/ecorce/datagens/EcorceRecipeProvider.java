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
            }
        };
    }

    @Override
    public String getName() {
        return "RubisRecipeProvider";
    }
}

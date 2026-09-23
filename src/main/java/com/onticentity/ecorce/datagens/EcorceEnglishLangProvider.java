package com.onticentity.ecorce.datagens;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class EcorceEnglishLangProvider extends FabricLanguageProvider {
    public EcorceEnglishLangProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.ecorce.oak_inner_bark", "Oak Inner Bark");
        translationBuilder.add("item.ecorce.oak_outer_bark", "Oak Outer Bark");

        translationBuilder.add("item.ecorce.spruce_inner_bark", "Spruce Inner Bark");
        translationBuilder.add("item.ecorce.spruce_outer_bark", "Spruce Outer Bark");

        translationBuilder.add("item.ecorce.birch_inner_bark", "Birch Inner Bark");
        translationBuilder.add("item.ecorce.birch_outer_bark", "Birch Outer Bark");

        translationBuilder.add("item.ecorce.jungle_inner_bark", "Jungle Inner Bark");
        translationBuilder.add("item.ecorce.jungle_outer_bark", "Jungle Outer Bark");

        translationBuilder.add("item.ecorce.acacia_inner_bark", "Acacia Inner Bark");
        translationBuilder.add("item.ecorce.acacia_outer_bark", "Acacia Outer Bark");

        translationBuilder.add("item.ecorce.dark_oak_inner_bark", "Dark Oak Inner Bark");
        translationBuilder.add("item.ecorce.dark_oak_outer_bark", "Dark Oak Outer Bark");

        translationBuilder.add("item.ecorce.mangrove_inner_bark", "Mangrove Inner Bark");
        translationBuilder.add("item.ecorce.mangrove_outer_bark", "Mangrove Outer Bark");

        translationBuilder.add("item.ecorce.cherry_inner_bark", "Cherry Inner Bark");
        translationBuilder.add("item.ecorce.cherry_outer_bark", "Cherry Outer Bark");

        translationBuilder.add("item.ecorce.pale_oak_inner_bark", "Pale Oak Inner Bark");
        translationBuilder.add("item.ecorce.pale_oak_outer_bark", "Pale Oak Outer Bark");
    }
}

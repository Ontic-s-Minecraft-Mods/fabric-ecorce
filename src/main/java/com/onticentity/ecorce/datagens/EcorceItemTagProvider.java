package com.onticentity.ecorce.datagens;

import com.onticentity.ecorce.items.EcorceItems;
import com.onticentity.ecorce.tags.EcorceTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class EcorceItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public EcorceItemTagProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        builder(EcorceTags.OUTER_BARKS).add(EcorceItems.OAK_OUTER_BARK_KEY);
        builder(EcorceTags.OUTER_BARKS).add(EcorceItems.SPRUCE_OUTER_BARK_KEY);
        builder(EcorceTags.OUTER_BARKS).add(EcorceItems.BIRCH_OUTER_BARK_KEY);
        builder(EcorceTags.OUTER_BARKS).add(EcorceItems.JUNGLE_OUTER_BARK_KEY);
        builder(EcorceTags.OUTER_BARKS).add(EcorceItems.ACACIA_OUTER_BARK_KEY);
        builder(EcorceTags.OUTER_BARKS).add(EcorceItems.DARK_OAK_OUTER_BARK_KEY);
        builder(EcorceTags.OUTER_BARKS).add(EcorceItems.MANGROVE_OUTER_BARK_KEY);
        builder(EcorceTags.OUTER_BARKS).add(EcorceItems.CHERRY_OUTER_BARK_KEY);
        builder(EcorceTags.OUTER_BARKS).add(EcorceItems.PALE_OAK_OUTER_BARK_KEY);
    }
}



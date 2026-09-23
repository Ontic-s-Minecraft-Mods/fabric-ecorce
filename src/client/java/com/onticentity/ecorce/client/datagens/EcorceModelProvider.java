package com.onticentity.ecorce.client.datagens;

import com.onticentity.ecorce.items.EcorceItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class EcorceModelProvider extends FabricModelProvider {
    public EcorceModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(
                EcorceItems.OAK_INNER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.OAK_OUTER_BARK,
                ModelTemplates.FLAT_ITEM
        );

        itemModelGenerator.generateFlatItem(
                EcorceItems.SPRUCE_INNER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.SPRUCE_OUTER_BARK,
                ModelTemplates.FLAT_ITEM
        );

        itemModelGenerator.generateFlatItem(
                EcorceItems.BIRCH_INNER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.BIRCH_OUTER_BARK,
                ModelTemplates.FLAT_ITEM
        );

        itemModelGenerator.generateFlatItem(
                EcorceItems.JUNGLE_INNER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.JUNGLE_OUTER_BARK,
                ModelTemplates.FLAT_ITEM
        );

        itemModelGenerator.generateFlatItem(
                EcorceItems.ACACIA_INNER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.ACACIA_OUTER_BARK,
                ModelTemplates.FLAT_ITEM
        );

        itemModelGenerator.generateFlatItem(
                EcorceItems.DARK_OAK_INNER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.DARK_OAK_OUTER_BARK,
                ModelTemplates.FLAT_ITEM
        );

        itemModelGenerator.generateFlatItem(
                EcorceItems.MANGROVE_INNER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.MANGROVE_OUTER_BARK,
                ModelTemplates.FLAT_ITEM
        );

        itemModelGenerator.generateFlatItem(
                EcorceItems.CHERRY_INNER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.CHERRY_OUTER_BARK,
                ModelTemplates.FLAT_ITEM
        );

        itemModelGenerator.generateFlatItem(
                EcorceItems.PALE_OAK_INNER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.PALE_OAK_OUTER_BARK,
                ModelTemplates.FLAT_ITEM
        );
        itemModelGenerator.generateFlatItem(
                EcorceItems.BARK_LIGHTER,
                ModelTemplates.FLAT_ITEM
        );
    }

    @Override
    public String getName() {
        return "";
    }

}

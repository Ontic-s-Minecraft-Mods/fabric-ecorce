package com.onticentity.ecorce.items;

import com.onticentity.ecorce.Ecorce;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class EcorceItems {

    public static final ResourceKey<Item> OAK_OUTER_BARK_KEY =
            keyOfItem("oak_outer_bark");

    public static final ResourceKey<Item> OAK_INNER_BARK_KEY =
            keyOfItem("oak_inner_bark");

    public static final Item OAK_OUTER_BARK = register(
            OAK_OUTER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static final Item OAK_INNER_BARK = register(
            OAK_INNER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static <T extends Item> T register(
            ResourceKey<Item> itemKey,
            Function<Item.Properties, T> itemFactory,
            Item.Properties properties
    ) {
        T item = itemFactory.apply(
                properties.setId(itemKey)
        );

        return Registry.register(
                BuiltInRegistries.ITEM,
                itemKey,
                item
        );
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(
                Registries.ITEM,
                Identifier.fromNamespaceAndPath(
                        Ecorce.MOD_ID,
                        name
                )
        );
    }

    public static void initialize() {
    }
}
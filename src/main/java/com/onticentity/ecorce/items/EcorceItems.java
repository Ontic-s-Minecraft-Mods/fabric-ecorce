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

    // OAK
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


    // SPRUCE
    public static final ResourceKey<Item> SPRUCE_OUTER_BARK_KEY =
            keyOfItem("spruce_outer_bark");

    public static final ResourceKey<Item> SPRUCE_INNER_BARK_KEY =
            keyOfItem("spruce_inner_bark");

    public static final Item SPRUCE_OUTER_BARK = register(
            SPRUCE_OUTER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static final Item SPRUCE_INNER_BARK = register(
            SPRUCE_INNER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );


    // BIRCH
    public static final ResourceKey<Item> BIRCH_OUTER_BARK_KEY =
            keyOfItem("birch_outer_bark");

    public static final ResourceKey<Item> BIRCH_INNER_BARK_KEY =
            keyOfItem("birch_inner_bark");

    public static final Item BIRCH_OUTER_BARK = register(
            BIRCH_OUTER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static final Item BIRCH_INNER_BARK = register(
            BIRCH_INNER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );


    // JUNGLE
    public static final ResourceKey<Item> JUNGLE_OUTER_BARK_KEY =
            keyOfItem("jungle_outer_bark");

    public static final ResourceKey<Item> JUNGLE_INNER_BARK_KEY =
            keyOfItem("jungle_inner_bark");

    public static final Item JUNGLE_OUTER_BARK = register(
            JUNGLE_OUTER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static final Item JUNGLE_INNER_BARK = register(
            JUNGLE_INNER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );


    // ACACIA
    public static final ResourceKey<Item> ACACIA_OUTER_BARK_KEY =
            keyOfItem("acacia_outer_bark");

    public static final ResourceKey<Item> ACACIA_INNER_BARK_KEY =
            keyOfItem("acacia_inner_bark");

    public static final Item ACACIA_OUTER_BARK = register(
            ACACIA_OUTER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static final Item ACACIA_INNER_BARK = register(
            ACACIA_INNER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );


    // DARK OAK
    public static final ResourceKey<Item> DARK_OAK_OUTER_BARK_KEY =
            keyOfItem("dark_oak_outer_bark");

    public static final ResourceKey<Item> DARK_OAK_INNER_BARK_KEY =
            keyOfItem("dark_oak_inner_bark");

    public static final Item DARK_OAK_OUTER_BARK = register(
            DARK_OAK_OUTER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static final Item DARK_OAK_INNER_BARK = register(
            DARK_OAK_INNER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );


    // MANGROVE
    public static final ResourceKey<Item> MANGROVE_OUTER_BARK_KEY =
            keyOfItem("mangrove_outer_bark");

    public static final ResourceKey<Item> MANGROVE_INNER_BARK_KEY =
            keyOfItem("mangrove_inner_bark");

    public static final Item MANGROVE_OUTER_BARK = register(
            MANGROVE_OUTER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static final Item MANGROVE_INNER_BARK = register(
            MANGROVE_INNER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );


    // CHERRY
    public static final ResourceKey<Item> CHERRY_OUTER_BARK_KEY =
            keyOfItem("cherry_outer_bark");

    public static final ResourceKey<Item> CHERRY_INNER_BARK_KEY =
            keyOfItem("cherry_inner_bark");

    public static final Item CHERRY_OUTER_BARK = register(
            CHERRY_OUTER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static final Item CHERRY_INNER_BARK = register(
            CHERRY_INNER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );


    // PALE OAK
    public static final ResourceKey<Item> PALE_OAK_OUTER_BARK_KEY =
            keyOfItem("pale_oak_outer_bark");

    public static final ResourceKey<Item> PALE_OAK_INNER_BARK_KEY =
            keyOfItem("pale_oak_inner_bark");

    public static final Item PALE_OAK_OUTER_BARK = register(
            PALE_OAK_OUTER_BARK_KEY,
            Item::new,
            new Item.Properties()
    );

    public static final Item PALE_OAK_INNER_BARK = register(
            PALE_OAK_INNER_BARK_KEY,
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
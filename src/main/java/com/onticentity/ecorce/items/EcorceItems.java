package com.onticentity.ecorce.items;

import com.onticentity.ecorce.Ecorce;
import net.fabricmc.fabric.api.registry.CompostableRegistry;
import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.FlintAndSteelItem;
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
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.2f)
                                    .build()
                    )
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
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.1f)
                                    .build()
                    )
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
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.3f)
                                    .build()
                    )
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
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .build()
                    )
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
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.3f)
                                    .build()
                    )
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
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.4f)
                                    .build()
                    )
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
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.3f)
                                    .build()
                    )
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
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .build()
                    )
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
                    .food(
                            new FoodProperties.Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.5f)
                                    .build()
                    )
    );

    public static final ResourceKey<Item> BARK_LIGHTER_KEY =
            keyOfItem("bark_lighter");

    public static final Item BARK_LIGHTER = register(
            BARK_LIGHTER_KEY,
            FlintAndSteelItem::new,
            new Item.Properties().durability(8)
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

        FuelValueEvents.BUILD.register((builder, context) -> {

            // OAK
            builder.add(OAK_OUTER_BARK, 125);
            builder.add(OAK_INNER_BARK, 100);

            // SPRUCE
            builder.add(SPRUCE_OUTER_BARK, 150);
            builder.add(SPRUCE_INNER_BARK, 125);

            // BIRCH
            builder.add(BIRCH_OUTER_BARK, 125);
            builder.add(BIRCH_INNER_BARK, 100);

            // JUNGLE
            builder.add(JUNGLE_OUTER_BARK, 175);
            builder.add(JUNGLE_INNER_BARK, 150);

            // ACACIA
            builder.add(ACACIA_OUTER_BARK, 150);
            builder.add(ACACIA_INNER_BARK, 125);

            // DARK OAK
            builder.add(DARK_OAK_OUTER_BARK, 150);
            builder.add(DARK_OAK_INNER_BARK, 125);

            // MANGROVE
            builder.add(MANGROVE_OUTER_BARK, 225);
            builder.add(MANGROVE_INNER_BARK, 200);

            // CHERRY
            builder.add(CHERRY_OUTER_BARK, 200);
            builder.add(CHERRY_INNER_BARK, 175);

            // PALE OAK
            builder.add(PALE_OAK_OUTER_BARK, 200);
            builder.add(PALE_OAK_INNER_BARK, 175);
        });


        // OAK
        CompostableRegistry.INSTANCE.add(OAK_OUTER_BARK, 0.35f);
        CompostableRegistry.INSTANCE.add(OAK_INNER_BARK, 0.30f);

        // SPRUCE
        CompostableRegistry.INSTANCE.add(SPRUCE_OUTER_BARK, 0.35f);
        CompostableRegistry.INSTANCE.add(SPRUCE_INNER_BARK, 0.30f);

        // BIRCH
        CompostableRegistry.INSTANCE.add(BIRCH_OUTER_BARK, 0.35f);
        CompostableRegistry.INSTANCE.add(BIRCH_INNER_BARK, 0.30f);

        // JUNGLE
        CompostableRegistry.INSTANCE.add(JUNGLE_OUTER_BARK, 0.35f);
        CompostableRegistry.INSTANCE.add(JUNGLE_INNER_BARK, 0.30f);

        // ACACIA
        CompostableRegistry.INSTANCE.add(ACACIA_OUTER_BARK, 0.35f);
        CompostableRegistry.INSTANCE.add(ACACIA_INNER_BARK, 0.30f);

        // DARK OAK
        CompostableRegistry.INSTANCE.add(DARK_OAK_OUTER_BARK, 0.35f);
        CompostableRegistry.INSTANCE.add(DARK_OAK_INNER_BARK, 0.30f);

        // MANGROVE
        CompostableRegistry.INSTANCE.add(MANGROVE_OUTER_BARK, 0.35f);
        CompostableRegistry.INSTANCE.add(MANGROVE_INNER_BARK, 0.30f);

        // CHERRY
        CompostableRegistry.INSTANCE.add(CHERRY_OUTER_BARK, 0.35f);
        CompostableRegistry.INSTANCE.add(CHERRY_INNER_BARK, 0.30f);

        // PALE OAK
        CompostableRegistry.INSTANCE.add(PALE_OAK_OUTER_BARK, 0.35f);
        CompostableRegistry.INSTANCE.add(PALE_OAK_INNER_BARK, 0.30f);
    }
}
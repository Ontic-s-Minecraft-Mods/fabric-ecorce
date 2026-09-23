package com.onticentity.ecorce.tags;

import com.onticentity.ecorce.Ecorce;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EcorceTags {
    public static final TagKey<Item> OUTER_BARKS = TagKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(Ecorce.MOD_ID, "outer_barks")
    );
}

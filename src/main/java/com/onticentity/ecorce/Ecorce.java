package com.onticentity.ecorce;

import com.onticentity.ecorce.handlers.EcorceBarkTree;
import com.onticentity.ecorce.items.EcorceItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ecorce implements ModInitializer {
	public static final String MOD_ID = "ecorce";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EcorceItems.initialize();
		EcorceBarkTree.register();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}

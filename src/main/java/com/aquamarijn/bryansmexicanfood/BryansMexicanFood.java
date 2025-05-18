package com.aquamarijn.bryansmexicanfood;

import com.aquamarijn.bryansmexicanfood.item.ModFoodComponents;
import com.aquamarijn.bryansmexicanfood.item.ModItemGroups;
import com.aquamarijn.bryansmexicanfood.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BryansMexicanFood implements ModInitializer {
	public static final String MOD_ID = "bryansmexicanfood";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

	}
}
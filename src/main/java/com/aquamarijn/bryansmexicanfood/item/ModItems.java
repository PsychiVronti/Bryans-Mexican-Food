package com.aquamarijn.bryansmexicanfood.item;

import com.aquamarijn.bryansmexicanfood.BryansMexicanFood;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

//Adding mod items
public class ModItems {

    public static final Item CALIFORNIA_BURRITO = registerItem("california_burrito",
            new Item(new Item.Settings().food(ModFoodComponents.CALIFORNIA_BURRITO)));
    public static final Item SAUCED_CALIFORNIA_BURRITO = registerItem("sauced_california_burrito",
            new Item(new Item.Settings().food(ModFoodComponents.SAUCED_CALIFORNIA_BURRITO)));
    public static final Item FLOUR = registerItem("flour", new Item(new Item.Settings()));
    public static final Item TORTILLA = registerItem("tortilla",
            new Item(new Item.Settings().food(ModFoodComponents.TORTILLA)));
    public static final Item CUT_POTATOES = registerItem("cut_potatoes",
            new Item(new Item.Settings().food(ModFoodComponents.CUT_POTATOES)));
    public static final Item FRENCH_FRIES = registerItem("french_fries",
            new Item(new Item.Settings().food(ModFoodComponents.FRENCH_FRIES)));





    //Helper methods for registering items
    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BryansMexicanFood.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BryansMexicanFood.LOGGER.info("Registering Mod Items for " + BryansMexicanFood.MOD_ID);
    }
}

package com.aquamarijn.bryansmexicanfood.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


//Defining food values
public class ModFoodComponents {
    public static final FoodComponent CALIFORNIA_BURRITO = new FoodComponent.Builder()
            .nutrition(12).saturationModifier(0.8f).build();
    public static final FoodComponent SAUCED_CALIFORNIA_BURRITO = new FoodComponent.Builder()
            .nutrition(12).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, Integer.MAX_VALUE, 0), 0.1f).build();
    public static final FoodComponent TORTILLA = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.6f).build();
    public static final FoodComponent CUT_POTATOES = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.3f).build();
    public static final FoodComponent FRENCH_FRIES = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.6f).build();
}

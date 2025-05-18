package com.aquamarijn.bryansmexicanfood.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


//Defining food values
public class ModFoodComponents {
    public static final FoodComponent CALIFORNIA_BURRITO = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.8f).build();
    public static final FoodComponent SAUCED_CALIFORNIA_BURRITO = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 0.5f).build();
}

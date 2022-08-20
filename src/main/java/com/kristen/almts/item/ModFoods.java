package com.kristen.almts.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    @SuppressWarnings("deprecation")
	public static final FoodProperties RAW_ATLANTIC_LOBSTER = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.HUNGER, 300, 1), 0.25F).meat().build();
}

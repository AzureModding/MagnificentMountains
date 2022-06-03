package net.hadron_studios.magnificentmountains.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties IBEXBEEF = (new FoodProperties.Builder()).nutrition(8).saturationMod(15.4F).effect(new MobEffectInstance(MobEffects.JUMP, 600, 5), 0.3F).meat().build();
    public static final FoodProperties SALTED_IBEXBEEF = (new FoodProperties.Builder()).nutrition(9).saturationMod(16.4F).effect(new MobEffectInstance(MobEffects.JUMP, 600, 5), 1.0F).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 5), 1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION,  600, 2), 1.0f).meat().build();
    public static final FoodProperties IBEXMEAT = (new FoodProperties.Builder()).nutrition(4).saturationMod(7.7F).meat().build();
    public static final FoodProperties YAK_CHEESE = (new FoodProperties.Builder()).nutrition(6).saturationMod(10.1f).alwaysEat().fast().effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 1), 1.0f).build();
}

package net.hadron_studios.magnificentmountains.entity.client;

import net.hadron_studios.magnificentmountains.MagnificentMountainsMod;
import net.hadron_studios.magnificentmountains.entity.modlivingentity.SnowLeopard;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SnowLeopardModel extends AnimatedGeoModel<SnowLeopard>{
    @Override
    public ResourceLocation getModelLocation(SnowLeopard object) {
        return new ResourceLocation(MagnificentMountainsMod.MOD_ID, "geo/snow_leopard.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SnowLeopard object) {
        return new ResourceLocation(MagnificentMountainsMod.MOD_ID, "textures/entity/snow_leopard/snow_leopard.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SnowLeopard animatable) {
        return new ResourceLocation(MagnificentMountainsMod.MOD_ID, "animations/snow_leopard.animations.json");
    }
}

package net.hadron_studios.magnificentmountains.world.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> DOGWOOD_PLACED = PlacementUtils.m_206509_("dogwood_placed",
            ModConfiguredFeatures.DOGWOOD_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.1f, 1)));
}

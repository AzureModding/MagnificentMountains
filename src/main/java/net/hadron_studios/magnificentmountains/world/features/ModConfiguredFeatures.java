package net.hadron_studios.magnificentmountains.world.features;

import net.hadron_studios.magnificentmountains.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;


import java.util.List;
import java.util.OptionalInt;


public class ModConfiguredFeatures {
   public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DOGWOOD_TREE = FeatureUtils.m_206488_("dogwood_tree", Feature.TREE, createDogwood().build());

   private static TreeConfiguration.TreeConfigurationBuilder createDogwood() {
      return (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()),
              new FancyTrunkPlacer(3, 11, 0), BlockStateProvider.simple(ModBlocks.DOGWOOD_LEAV.get()),
              new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
              new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).dirt(BlockStateProvider.simple(Blocks.DIRT))).ignoreVines();
   }

   public static final Holder<PlacedFeature> DOGWOOD_CHECKED =
           PlacementUtils.m_206513_("dogwood_checked", DOGWOOD_TREE,
                   PlacementUtils.m_206493_(ModBlocks.DOGWOOD_SAPLING.get()));

   public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DOGWOOD_SPAWN =
           FeatureUtils.m_206488_ ("dogwood_spawn", Feature.RANDOM_SELECTOR,
                   new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(DOGWOOD_CHECKED,
                           0.1F)), DOGWOOD_CHECKED));
}

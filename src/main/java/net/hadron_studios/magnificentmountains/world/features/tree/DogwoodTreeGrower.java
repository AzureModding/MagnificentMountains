package net.hadron_studios.magnificentmountains.world.features.tree;

import net.hadron_studios.magnificentmountains.world.features.ModConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class DogwoodTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> m_203525_(Random p_204307_, boolean p_204308_) {
        return ModConfiguredFeatures.DOGWOOD_TREE;
    }
}

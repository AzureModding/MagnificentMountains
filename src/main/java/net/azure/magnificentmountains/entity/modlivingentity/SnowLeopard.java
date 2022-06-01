package net.azure.magnificentmountains.entity.modlivingentity;

import net.azure.magnificentmountains.entity.ai.goal.SnowLeopardLieOnBedGoal;
import net.azure.magnificentmountains.entity.ai.goal.SnowLeopardSitOnBlockGoal;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class SnowLeopard extends TamableAnimal implements IAnimatable {
    private static final EntityDataAccessor<Boolean> IS_LYING = SynchedEntityData.defineId(SnowLeopard.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> RELAX_STATE_ONE = SynchedEntityData.defineId(SnowLeopard.class, EntityDataSerializers.BOOLEAN);
    private AnimationFactory factory = new AnimationFactory(this);

    public SnowLeopard(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 50.00f)
                .add(Attributes.ATTACK_DAMAGE, 5.0f)
                .add(Attributes.ATTACK_SPEED, 4.0f)
                .add(Attributes.MOVEMENT_SPEED, 1.0f)
                .add(Attributes.JUMP_STRENGTH, 4.0f)
                .add(Attributes.ATTACK_KNOCKBACK, 2.0f)
                .add(Attributes.FLYING_SPEED, 3.0f).build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(1, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 4.0f));
        this.goalSelector.addGoal(8, new FollowOwnerGoal(this, 1.0D, 10.0F, 5.0F, false));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 0.8D, 1.0000001E-5F));
        this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.3F));
        this.goalSelector.addGoal(5, new SnowLeopardSitOnBlockGoal(this, 0.8D));
        this.goalSelector.addGoal(6, new SnowLeopardLieOnBedGoal(this, 1.1D, 8));
        this.goalSelector.addGoal(7, new FollowParentGoal(this, 1.25D));
    }


    public boolean isLying() {
        return this.entityData.get(IS_LYING);
    }
    public void setLying(boolean p_28182_) {
        this.entityData.set(IS_LYING, p_28182_);
    }

        @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return null;
    }

    private <E extends IAnimatable>PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.snowleopard.walk", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.snowleopard.idle", true));
        return  PlayState.CONTINUE;

    }





    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }



    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.SNOW_STEP, 0.15f, 1.0f);
    }

    protected SoundEvent getAmbientSound() {return SoundEvents.CAT_PURREOW;}

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) { return SoundEvents.CAT_HURT;}

    protected SoundEvent getDeathSound() { return SoundEvents.CAT_DEATH;}

    protected float getSoundVolume() { return 0.2f;}
}

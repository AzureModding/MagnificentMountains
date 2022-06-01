package net.azure.magnificentmountains.entity.ai.goal;
import java.util.EnumSet;

import net.azure.magnificentmountains.entity.modlivingentity.SnowLeopard;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.MoveToBlockGoal;

import net.minecraft.world.level.LevelReader;

public class SnowLeopardLieOnBedGoal extends MoveToBlockGoal {
    private final SnowLeopard snowLeopard;

    public SnowLeopardLieOnBedGoal(SnowLeopard p_25135_, double p_25136_, int p_25137_) {
        super(p_25135_, p_25136_, p_25137_, 6);
        this.snowLeopard = p_25135_;
        this.verticalSearchStart = -2;
        this.setFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
    }

    public boolean canUse() {
        return this.snowLeopard.isTame() && !this.snowLeopard.isOrderedToSit() && !this.snowLeopard.isLying() && super.canUse();
    }

    public void start() {
        super.start();
        this.snowLeopard.setInSittingPose(false);
    }

    protected int nextStartTick(PathfinderMob p_25140_) {
        return 40;
    }

    public void stop() {
        super.stop();
        this.snowLeopard.setLying(false);
    }

    public void tick() {
        super.tick();
        this.snowLeopard.setInSittingPose(false);
        if (!this.isReachedTarget()) {
            this.snowLeopard.setLying(false);
        } else if (!this.snowLeopard.isLying()) {
            this.snowLeopard.setLying(true);
        }

    }

    protected boolean isValidTarget(LevelReader p_25142_, BlockPos p_25143_) {
        return p_25142_.isEmptyBlock(p_25143_.above()) && p_25142_.getBlockState(p_25143_).m_204336_(BlockTags.BEDS);
    }
}

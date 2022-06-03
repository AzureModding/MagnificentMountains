package net.hadron_studios.magnificentmountains.world;

import net.hadron_studios.magnificentmountains.MagnificentMountainsMod;
import net.hadron_studios.magnificentmountains.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MagnificentMountainsMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent (final BiomeLoadingEvent event) {
        ModTreeGeneration.generateTrees(event);
    }

}

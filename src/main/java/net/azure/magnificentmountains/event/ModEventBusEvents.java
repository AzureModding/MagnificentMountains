package net.azure.magnificentmountains.event;


import net.azure.magnificentmountains.MagnificentMountainsMod;
import net.azure.magnificentmountains.entity.ModEntityTypes;
import net.azure.magnificentmountains.entity.modlivingentity.SnowLeopard;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MagnificentMountainsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {


    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SNOW_LEOPARD.get(), SnowLeopard.setAttributes());
    }
}

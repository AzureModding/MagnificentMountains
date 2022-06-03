package net.hadron_studios.magnificentmountains.event;


import net.hadron_studios.magnificentmountains.MagnificentMountains;
import net.hadron_studios.magnificentmountains.entity.ModEntityTypes;
import net.hadron_studios.magnificentmountains.entity.modlivingentity.SnowLeopard;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MagnificentMountains.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {


    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SNOW_LEOPARD.get(), SnowLeopard.setAttributes());
    }
}

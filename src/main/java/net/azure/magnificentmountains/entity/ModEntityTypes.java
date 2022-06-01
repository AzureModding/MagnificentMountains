package net.azure.magnificentmountains.entity;

import net.azure.magnificentmountains.MagnificentMountainsMod;
import net.azure.magnificentmountains.entity.modlivingentity.SnowLeopard;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, MagnificentMountainsMod.MOD_ID);
   public static final RegistryObject<EntityType<SnowLeopard>> SNOW_LEOPARD =
           ENTITY_TYPES.register("snow_leopard",
                   () -> EntityType.Builder.of(SnowLeopard::new, MobCategory.CREATURE)
                           .sized(1.3F, 1.25F)
                           .build(new ResourceLocation(MagnificentMountainsMod.MOD_ID,
                                   "snow_leopard").toString()));



    public static void register(IEventBus eventBus) {
            ENTITY_TYPES.register(eventBus);
        }

}

package net.azure.magnificentmountains.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab MAGNIFICENT_MOUNTAINS = new CreativeModeTab("magnificent_mountains") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SNOW_LEOPARD_SPAWN_EGG.get());
        }
    };
}

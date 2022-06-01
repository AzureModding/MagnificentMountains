package net.azure.magnificentmountains.item;

import net.azure.magnificentmountains.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab HIMALAYAN_TAB = new CreativeModeTab("himalayantab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IBEXMEAT.get());
        }
    };
    public static final CreativeModeTab ROCKIES_TAB = new CreativeModeTab("rockiestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MAPlE_PLANKS.get());
        }
    };
}

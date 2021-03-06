package net.hadron_studios.magnificentmountains.event;


import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.hadron_studios.magnificentmountains.MagnificentMountains;
import net.hadron_studios.magnificentmountains.block.ModBlocks;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = MagnificentMountains.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
       if(event.getType() == VillagerProfession.CARTOGRAPHER) {
           Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
           ItemStack stack = new ItemStack(ModBlocks.DOGWOOD_SAPLING.get(), 1);
           int villagerLevel = 5;

           trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                   new ItemStack(Items.EMERALD, 5),
                   stack, 2, 8, 0.50f));
       }
    }
}

package net.azure.magnificentmountains.item;

import net.azure.magnificentmountains.MagnificentMountainsMod;
import net.azure.magnificentmountains.entity.ModEntityTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagnificentMountainsMod.MOD_ID);

   public static final RegistryObject<Item> IBEXMEAT = ITEMS.register("ibexmeat",
           () -> new Item(new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS).food(ModFoods.IBEXMEAT)));

    public static final RegistryObject<Item> IBEXBEEF = ITEMS.register("ibexbeef",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS).food(ModFoods.IBEXBEEF)));

    public static final RegistryObject<Item> SALTED_IBEXBEEF = ITEMS.register("salted_ibexbeef",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS).food(ModFoods.SALTED_IBEXBEEF)));


    public static final RegistryObject<Item> PINK_SALT_SHARDS = ITEMS.register("pink_salt_shards",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS)));

    public static final RegistryObject<Item> YAKMILK = ITEMS.register("yakmilk",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS)));

    public static final RegistryObject<Item> YAKWOOL_BOOTS = ITEMS.register("yakwool_boots",
            () -> new ArmorItem(ModArmorMaterial.YAKWOOL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS)));
    public static final RegistryObject<Item> YAKWOOL_LEGGINGS= ITEMS.register("yakwool_leggings",
            () -> new ArmorItem(ModArmorMaterial.YAKWOOL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS)));
    public static final RegistryObject<Item> YAKWOOL_CHESTPLATE = ITEMS.register("yakwool_chestplate",
            () -> new ArmorItem(ModArmorMaterial.YAKWOOL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS)));
    public static final RegistryObject<Item> YAKWOOL_HELMET = ITEMS.register("yakwool_helmet",
            () -> new ArmorItem(ModArmorMaterial.YAKWOOL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS)));

    public static final RegistryObject<Item> YAK_CHEESE = ITEMS.register("yak_cheese",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS).food(ModFoods.YAK_CHEESE)));

    public static final RegistryObject<Item> MOUNTAIN_STAFF = ITEMS.register("mountain_staff",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS).stacksTo(1).durability(1000)));

    public static final RegistryObject<Item> HEART_OF_THE_MOUNTAIN = ITEMS.register("the_heart_of_the_mountain",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS)));

    public static final RegistryObject<ForgeSpawnEggItem> SNOW_LEOPARD_SPAWN_EGG = ITEMS.register("snow_leopard_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SNOW_LEOPARD, 0xb0a8a7, 0x363636,
                    new Item.Properties().tab(ModCreativeModTab.MAGNIFICENT_MOUNTAINS)));

   public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

   }
}

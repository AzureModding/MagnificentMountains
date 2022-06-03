package net.hadron_studios.magnificentmountains.block;

import net.hadron_studios.magnificentmountains.MagnificentMountainsMod;
import net.hadron_studios.magnificentmountains.block.custom.ModFlammableRotatedPillarBlock;
import net.hadron_studios.magnificentmountains.item.ModCreativeModTab;
import net.hadron_studios.magnificentmountains.item.ModItems;
//import net.antarctic.magnificentmountains.worldgen.features.tree.DogwoodTreeGrower;
import net.hadron_studios.magnificentmountains.world.features.tree.DogwoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MagnificentMountainsMod.MOD_ID );

    public static final RegistryObject<Block> YAK_WOOL = registerBlock("yak_wool",
             () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                     .strength(9f).requiresCorrectToolForDrops()), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> PINK_SALT = registerBlock("pink_salt",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(9f).requiresCorrectToolForDrops().lightLevel((p_50886_) -> {
                        return 13;
                    })), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> DOGWOOD_PLANKS = registerBlock("dogwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(2f))  {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }
            , ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> MAPlE_PLANKS = registerBlock("maple_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f))   {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            },
            ModCreativeModTab.MAGNIFICENT_MOUNTAINS);
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);
    public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs",
            () -> new StairBlock(() -> MAPlE_PLANKS.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.WOOD).strength(2f))) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);


    public static final RegistryObject<Block> DOGWOOD_STAIRS = registerBlock("dogwood_stairs",
            () -> new StairBlock(() -> DOGWOOD_PLANKS.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.WOOD).strength(2f))) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> DOGWOOD_FENCE = registerBlock("dogwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> DOGWOOD_LOG_WALL = registerBlock("dogwood_log_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> STRIPPED_DOGWOOD_LOG_WAll = registerBlock("stripped_dogwood_log_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);


    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(() -> DOGWOOD_PLANKS.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2f))), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> DOGWOOD_FENCE_GATE = registerBlock("dogwood_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> DOGWOOD_SLAB = registerBlock("dogwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> DOGWOOD_LOG = registerBlock("dogwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);
    public static final RegistryObject<Block> DOGWOOD_WOOD = registerBlock("dogwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> STRIPPED_DOGWOOD_LOG = registerBlock("stripped_dogwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);
    public static final RegistryObject<Block> STRIPPED_DOGWOOD_WOOD = registerBlock("stripped_dogwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> DOGWOOD_LEAV = registerBlock("dogwood_leav",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)
                    .strength(0.5f))  {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }
            , ModCreativeModTab.MAGNIFICENT_MOUNTAINS);


    public static final RegistryObject<Block> DOGWOOD_SAPLING = registerBlock("dogwood_sapling",
            () -> new SaplingBlock(new DogwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING))  {
                @Override
                protected boolean mayPlaceOn(BlockState p_51042_, BlockGetter p_51043_, BlockPos p_51044_) {
                    return p_51042_.m_204336_(BlockTags.SNOW) || p_51042_.is(Blocks.POWDER_SNOW);
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> DOGWOOD_BUTTON = registerBlock("dogwood_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);
    public static final RegistryObject<Block> DOGWOOD_PRESSURE_PLATE = registerBlock("dogwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD).strength(2f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> DOGWOOD_DOOR = registerBlock("dogwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).noOcclusion()), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);
    public static final RegistryObject<Block> DOGWOOD_TRAPDOOR = registerBlock("dogwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).noOcclusion()), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> RHODODENDRON = registerBlock("rhododendron",
            () -> new FlowerBlock(MobEffects.DIG_SPEED, 10,
                    BlockBehaviour.Properties.copy(Blocks.CORNFLOWER).noOcclusion().dynamicShape()), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> POTTED_RHODODENDRON = registerBlockWithoutItem("potted_rhododendron",
            () -> new FlowerPotBlock(null,ModBlocks.RHODODENDRON,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER).noOcclusion()));

    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG)), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG)), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD)), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);

    public static final RegistryObject<Block> MAPLE_DOOR = registerBlock("maple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).noOcclusion()), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).noOcclusion()), ModCreativeModTab.MAGNIFICENT_MOUNTAINS);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }



    private static <T extends Block>RegistryObject<Item> registerBlockItem (String name, RegistryObject<T>block, CreativeModeTab tab) {
        
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus)   {
        BLOCKS.register(eventBus);
    }
}

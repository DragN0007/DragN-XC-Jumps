package com.dragn0007.xcjumps.block;

import com.dragn0007.xcjumps.XCJumps;
import com.dragn0007.xcjumps.block.vox.decor.HorseHeadStatue;
import com.dragn0007.xcjumps.block.vox.decor.Sign;
import com.dragn0007.xcjumps.block.vox.decor.WallMedal;
import com.dragn0007.xcjumps.block.vox.jumps.*;
import com.dragn0007.xcjumps.block.vox.jumps.Short;
import com.dragn0007.xcjumps.item.XCItemGroup;
import com.dragn0007.xcjumps.item.XCItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class XCBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, XCJumps.MODID);

    //TODO; 1.4
    public static final RegistryObject<Block> STABLEDOOR_1 = registerDecoBlock("stabledoor_1",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_2 = registerDecoBlock("stabledoor_2",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_3 = registerDecoBlock("stabledoor_3",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_4 = registerDecoBlock("stabledoor_4",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_5 = registerDecoBlock("stabledoor_5",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_6 = registerDecoBlock("stabledoor_6",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_7 = registerDecoBlock("stabledoor_7",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_8 = registerDecoBlock("stabledoor_8",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_9 = registerDecoBlock("stabledoor_9",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_10 = registerDecoBlock("stabledoor_10",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_11 = registerDecoBlock("stabledoor_11",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> STABLEDOOR_12 = registerDecoBlock("stabledoor_12",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<Block> LANT_BLACK = registerDecoBlock("lant_black",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANT_BLUE = registerDecoBlock("lant_blue",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANT_CYAN = registerDecoBlock("lant_cyan",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANT_GREEN = registerDecoBlock("lant_green",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANT_PINK = registerDecoBlock("lant_pink",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANT_PURPLE = registerDecoBlock("lant_purple",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANT_RED = registerDecoBlock("lant_red",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANT_WHITE = registerDecoBlock("lant_white",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));

    public static final RegistryObject<Block> LANTG_BLACK = registerDecoBlock("lantg_black",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANTG_BLUE = registerDecoBlock("lantg_blue",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANTG_CYAN = registerDecoBlock("lantg_cyan",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANTG_GREEN = registerDecoBlock("lantg_green",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANTG_PINK = registerDecoBlock("lantg_pink",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANTG_PURPLE = registerDecoBlock("lantg_purple",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANTG_RED = registerDecoBlock("lantg_red",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));
    public static final RegistryObject<Block> LANTG_WHITE = registerDecoBlock("lantg_white",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)
                    .sound(SoundType.LANTERN).lightLevel((p_187433_) -> 15).noOcclusion()));

    public static final RegistryObject<Block> FBL_DLN = registerDecoBlock("fbl_dln",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_PPY = registerDecoBlock("fbl_ppy",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_BOD = registerDecoBlock("fbl_bod",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_ALM = registerDecoBlock("fbl_alm",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_AZB = registerDecoBlock("fbl_azb",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_RTLP = registerDecoBlock("fbl_rtlp",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_OTLP = registerDecoBlock("fbl_otlp",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_WTLP = registerDecoBlock("fbl_wtlp",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_PTLP = registerDecoBlock("fbl_ptlp",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_ODY = registerDecoBlock("fbl_ody",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_CFL = registerDecoBlock("fbl_cfl",
            () -> new FlowerBedLarge());
    public static final RegistryObject<Block> FBL_LVY = registerDecoBlock("fbl_lvy",
            () -> new FlowerBedLarge());

    public static final RegistryObject<Block> FBS_DLN = registerDecoBlock("fbs_dln",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_PPY = registerDecoBlock("fbs_ppy",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_BOD = registerDecoBlock("fbs_bod",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_ALM = registerDecoBlock("fbs_alm",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_AZB = registerDecoBlock("fbs_azb",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_RTLP = registerDecoBlock("fbs_rtlp",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_OTLP = registerDecoBlock("fbs_otlp",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_WTLP = registerDecoBlock("fbs_wtlp",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_PTLP = registerDecoBlock("fbs_ptlp",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_ODY = registerDecoBlock("fbs_ody",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_CFL = registerDecoBlock("fbs_cfl",
            () -> new FlowerBedSmall());
    public static final RegistryObject<Block> FBS_LVY = registerDecoBlock("fbs_lvy",
            () -> new FlowerBedSmall());

    public static final RegistryObject<Block> WMD = registerDecoBlockWithoutItem("wmd",
            () -> new WallMedal());
    public static final RegistryObject<Block> WMG = registerDecoBlockWithoutItem("wmg",
            () -> new WallMedal());
    public static final RegistryObject<Block> WMS = registerDecoBlockWithoutItem("wms",
            () -> new WallMedal());
    public static final RegistryObject<Block> WMB = registerDecoBlockWithoutItem("wmb",
            () -> new WallMedal());




    //TODO; 1.3
    public static final RegistryObject<Block> WALL_LINER = registerDecoBlock("wall_liner",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    //Castle
    public static final RegistryObject<Block> CR = registerBlock("cr",
            () -> new CastleRight());
    public static final RegistryObject<Block> CM = registerBlock("cm",
            () -> new CastleMiddle());
    public static final RegistryObject<Block> CL = registerBlock("cl",
            () -> new CastleLeft());

    //Large, Misc
    public static final RegistryObject<Block> BARN = registerBlock("barn",
            () -> new Barn());
    public static final RegistryObject<Block> BASK = registerBlock("bask",
            () -> new Basket());
    public static final RegistryObject<Block> FBASK = registerBlock("fbask",
            () -> new Basket());
    public static final RegistryObject<Block> CLIFF = registerBlock("cliff",
            () -> new Cliff());
    public static final RegistryObject<Block> GL = registerBlock("gl",
            () -> new GroundLog());
    public static final RegistryObject<Block> CARROT = registerBlock("carrot",
            () -> new Carrot());

    //Knight
    public static final RegistryObject<Block> KR = registerBlock("kr",
            () -> new KnightRight());
    public static final RegistryObject<Block> KM = registerBlock("km",
            () -> new KnightMiddle());
    public static final RegistryObject<Block> KL = registerBlock("kl",
            () -> new KnightLeft());

    public static final RegistryObject<Block> SHORT = registerBlock("short",
            () -> new Short());

    public static final RegistryObject<Block> HEDGE = registerBlock("hedge",
            () -> new Hedge());
    public static final RegistryObject<Block> FH = registerBlock("fh",
            () -> new Hedge());



    //TODO; 1.0-1.2

    //Wooden
    public static final RegistryObject<Block> WR_1 = registerBlock("wr_1",
            () -> new WoodenRound());
    public static final RegistryObject<Block> WR_2 = registerBlock("wr_2",
            () -> new WoodenRound());
    public static final RegistryObject<Block> WR_3 = registerBlock("wr_3",
            () -> new WoodenRound());
    public static final RegistryObject<Block> WR_4 = registerBlock("wr_4",
            () -> new WoodenRound());
    public static final RegistryObject<Block> WRD_1 = registerBlock("wrd_1",
            () -> new WoodenRoundDouble());
    public static final RegistryObject<Block> WRD_2 = registerBlock("wrd_2",
            () -> new WoodenRoundDouble());
    public static final RegistryObject<Block> WRD_3 = registerBlock("wrd_3",
            () -> new WoodenRoundDouble());
    public static final RegistryObject<Block> WRD_4 = registerBlock("wrd_4",
            () -> new WoodenRoundDouble());

    public static final RegistryObject<Block> WS_1 = registerBlock("ws_1",
            () -> new WoodenSquare());
    public static final RegistryObject<Block> WS_2 = registerBlock("ws_2",
            () -> new WoodenSquare());
    public static final RegistryObject<Block> WS_3 = registerBlock("ws_3",
            () -> new WoodenSquare());
    public static final RegistryObject<Block> WSD_1 = registerBlock("wsd_1",
            () -> new WoodenSquareDouble());
    public static final RegistryObject<Block> WSD_2 = registerBlock("wsd_2",
            () -> new WoodenSquareDouble());
    public static final RegistryObject<Block> WSD_3 = registerBlock("wsd_3",
            () -> new WoodenSquareDouble());

    //Brush & Hedge
    public static final RegistryObject<Block> BHR = registerBlock("bhr",
            () -> new BrushHalfRight());
    public static final RegistryObject<Block> BHM = registerBlock("bhm",
            () -> new BrushHalfMiddle());
    public static final RegistryObject<Block> BHL = registerBlock("bhl",
            () -> new BrushHalfLeft());
    public static final RegistryObject<Block> BFR = registerBlock("bfr",
            () -> new BrushFullRight());
    public static final RegistryObject<Block> BFM = registerBlock("bfm",
            () -> new BrushFullMiddle());
    public static final RegistryObject<Block> BFL = registerBlock("bfl",
            () -> new BrushFullLeft());

    //Log
    public static final RegistryObject<Block> LOG = registerBlock("log",
            () -> new Log());
    public static final RegistryObject<Block> TRAKE = registerBlock("trake",
            () -> new Trakehner());
    public static final RegistryObject<Block> DITCH = registerBlock("ditch",
            () -> new Ditch());
    public static final RegistryObject<Block> TABLE = registerBlock("table",
            () -> new Table());
    public static final RegistryObject<Block> OXER = registerBlock("oxer",
            () -> new Oxer());
    public static final RegistryObject<Block> LOG_2 = registerBlock("log_2",
            () -> new Log());
    public static final RegistryObject<Block> TRAKE_2 = registerBlock("trake_2",
            () -> new Trakehner());
    public static final RegistryObject<Block> DITCH_2 = registerBlock("ditch_2",
            () -> new Ditch());
    public static final RegistryObject<Block> TABLE_2 = registerBlock("table_2",
            () -> new Table());
    public static final RegistryObject<Block> OXER_2 = registerBlock("oxer_2",
            () -> new Oxer());
    public static final RegistryObject<Block> LOG_3 = registerBlock("log_3",
            () -> new Log());
    public static final RegistryObject<Block> TRAKE_3 = registerBlock("trake_3",
            () -> new Trakehner());
    public static final RegistryObject<Block> DITCH_3 = registerBlock("ditch_3",
            () -> new Ditch());
    public static final RegistryObject<Block> TABLE_3 = registerBlock("table_3",
            () -> new Table());
    public static final RegistryObject<Block> OXER_3 = registerBlock("oxer_3",
            () -> new Oxer());

    //Step
    public static final RegistryObject<Block> STEP_1 = registerBlock("step_1",
            () -> new Step());
    public static final RegistryObject<Block> STEP_2 = registerBlock("step_2",
            () -> new Step());
    public static final RegistryObject<Block> STEP_3 = registerBlock("step_3",
            () -> new Step());

    //Slant
    public static final RegistryObject<Block> SL_1 = registerBlock("sl_1",
            () -> new Slant());
    public static final RegistryObject<Block> SL_2 = registerBlock("sl_2",
            () -> new Slant());
    public static final RegistryObject<Block> SB = registerBlock("sb",
            () -> new SlantBush());

    //Decor
    public static final RegistryObject<Block> HORSESTATUE_1 = registerDecoBlock("horsestatue_1",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> HORSESTATUE_2 = registerDecoBlock("horsestatue_2",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> HORSESTATUE_3 = registerDecoBlock("horsestatue_3",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> HORSESTATUE_4 = registerDecoBlock("horsestatue_4",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> HORSESTATUE_5 = registerDecoBlock("horsestatue_5",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> SIGN_0 = registerDecoBlock("sign_0",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_1 = registerDecoBlock("sign_1",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_2 = registerDecoBlock("sign_2",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_3 = registerDecoBlock("sign_3",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_4 = registerDecoBlock("sign_4",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_5 = registerDecoBlock("sign_5",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_6 = registerDecoBlock("sign_6",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_7 = registerDecoBlock("sign_7",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_8 = registerDecoBlock("sign_8",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_9 = registerDecoBlock("sign_9",
            () -> new Sign());
    public static final RegistryObject<Block> RED_FLAG = registerDecoBlock("red_flag",
            () -> new Sign());
    public static final RegistryObject<Block> WHITE_FLAG = registerDecoBlock("white_flag",
            () -> new Sign());



    private static ToIntFunction<BlockState> litBlockEmission(int p_50760_) {
        return (blockState) -> {
            return blockState.getValue(BlockStateProperties.LIT) ? p_50760_ : 0;
        };
    }

    private static <T extends Block>RegistryObject<T> registerDecoBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        XCItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(XCItemGroup.JUMPS)));
    }

    private static <T extends Block>RegistryObject<T> registerDecoBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerDecoBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerDecoBlockItem(String name, RegistryObject<T> block) {
        XCItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(XCItemGroup.DECO)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

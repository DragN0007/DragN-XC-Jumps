package com.dragn0007.xcjumps.block;

import com.dragn0007.xcjumps.XCJumps;
import com.dragn0007.xcjumps.block.vox.decor.HorseHeadStatue;
import com.dragn0007.xcjumps.block.vox.decor.Sign;
import com.dragn0007.xcjumps.block.vox.jumps.*;
import com.dragn0007.xcjumps.item.XCItemGroup;
import com.dragn0007.xcjumps.item.XCItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class XCBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, XCJumps.MODID);


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

    //Half Brush
    public static final RegistryObject<Block> BHR = registerBlock("bhr",
            () -> new BrushHalfRight());
    public static final RegistryObject<Block> BHM = registerBlock("bhm",
            () -> new BrushHalfMiddle());
    public static final RegistryObject<Block> BHL = registerBlock("bhl",
            () -> new BrushHalfLeft());

    //Full Brush
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
    public static final RegistryObject<Block> HORSESTATUE_1 = registerBlock("horsestatue_1",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> HORSESTATUE_2 = registerBlock("horsestatue_2",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> HORSESTATUE_3 = registerBlock("horsestatue_3",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> HORSESTATUE_4 = registerBlock("horsestatue_4",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> HORSESTATUE_5 = registerBlock("horsestatue_5",
            () -> new HorseHeadStatue());
    public static final RegistryObject<Block> SIGN_0 = registerBlock("sign_0",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_1 = registerBlock("sign_1",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_2 = registerBlock("sign_2",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_3 = registerBlock("sign_3",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_4 = registerBlock("sign_4",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_5 = registerBlock("sign_5",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_6 = registerBlock("sign_6",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_7 = registerBlock("sign_7",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_8 = registerBlock("sign_8",
            () -> new Sign());
    public static final RegistryObject<Block> SIGN_9 = registerBlock("sign_9",
            () -> new Sign());



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        XCItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(XCItemGroup.XC_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

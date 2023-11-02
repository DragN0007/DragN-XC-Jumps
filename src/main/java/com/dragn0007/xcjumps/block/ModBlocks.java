package com.dragn0007.xcjumps.block;

import com.dragn0007.xcjumps.XCJumps;
import com.dragn0007.xcjumps.block.vox.WoodenRound;
import com.dragn0007.xcjumps.block.vox.WoodenRoundDouble;
import com.dragn0007.xcjumps.item.ModItemGroup;
import com.dragn0007.xcjumps.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, XCJumps.MODID);


    //Wooden Round
    public static final RegistryObject<Block> WR_1 = registerBlock("wr_1",
            () -> new WoodenRound());
    public static final RegistryObject<Block> WR_2 = registerBlock("wr_2",
            () -> new WoodenRound());
    public static final RegistryObject<Block> WR_3 = registerBlock("wr_3",
            () -> new WoodenRound());
    public static final RegistryObject<Block> WR_4 = registerBlock("wr_4",
            () -> new WoodenRound());

    //Double Wooden Round
    public static final RegistryObject<Block> WRD_1 = registerBlock("wrd_1",
            () -> new WoodenRoundDouble());
    public static final RegistryObject<Block> WRD_2 = registerBlock("wrd_2",
            () -> new WoodenRoundDouble());
    public static final RegistryObject<Block> WRD_3 = registerBlock("wrd_3",
            () -> new WoodenRoundDouble());
    public static final RegistryObject<Block> WRD_4 = registerBlock("wrd_4",
            () -> new WoodenRoundDouble());



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.XC_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

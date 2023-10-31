package com.dragn0007.xcjumps.block;

import com.dragn0007.xcjumps.XCJumps;
import com.dragn0007.xcjumps.block.vox.WoodenRound;
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


    public static final RegistryObject<WoodenRound> WR_1 = registerBlock("wr_1",
            () -> new WoodenRound());
    public static final RegistryObject<WoodenRound> WR_2 = registerBlock("wr_2",
            () -> new WoodenRound());



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.DECOR_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

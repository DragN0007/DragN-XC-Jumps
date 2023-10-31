package com.dragn0007.xcjumps.item;


import com.dragn0007.xcjumps.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {

    public static final CreativeModeTab DECOR_GROUP = new CreativeModeTab("XCModTab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.WR_1.get());
        }
    };

}

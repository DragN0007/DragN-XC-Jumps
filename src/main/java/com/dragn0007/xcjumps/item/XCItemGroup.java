package com.dragn0007.xcjumps.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class XCItemGroup {

    public static final CreativeModeTab JUMPS = new CreativeModeTab("XCJumps")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(XCItems.JUMPMODTAB.get());
        }
    };

    public static final CreativeModeTab DECO = new CreativeModeTab("XCDeco")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(XCItems.DECOMODTAB.get());
        }
    };

}

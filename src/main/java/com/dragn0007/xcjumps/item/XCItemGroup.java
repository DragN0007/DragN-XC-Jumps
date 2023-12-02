package com.dragn0007.xcjumps.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class XCItemGroup {

    public static final CreativeModeTab XC_GROUP = new CreativeModeTab("XCModTab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(XCItems.MODGROUP.get());
        }
    };

}

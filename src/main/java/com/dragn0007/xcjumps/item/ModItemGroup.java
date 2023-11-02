package com.dragn0007.xcjumps.item;


import com.dragn0007.xcjumps.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {

    public static final CreativeModeTab XC_GROUP = new CreativeModeTab("XCModTab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MODGROUP.get());
        }
    };

}

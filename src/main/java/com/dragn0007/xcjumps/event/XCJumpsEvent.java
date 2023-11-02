package com.dragn0007.xcjumps.event;

import com.dragn0007.xcjumps.XCJumps;
import com.dragn0007.xcjumps.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = XCJumps.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class XCJumpsEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BHM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BHL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BHR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BFM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BFL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BFR.get(), RenderType.translucent());
    }
}





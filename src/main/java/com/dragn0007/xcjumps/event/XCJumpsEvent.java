package com.dragn0007.xcjumps.event;

import com.dragn0007.xcjumps.XCJumps;
import com.dragn0007.xcjumps.block.XCBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = XCJumps.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class XCJumpsEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.RED_FLAG.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.WHITE_FLAG.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BHM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BHL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BHR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BFM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BFL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BFR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.SB.get(), RenderType.translucent());
    }
}





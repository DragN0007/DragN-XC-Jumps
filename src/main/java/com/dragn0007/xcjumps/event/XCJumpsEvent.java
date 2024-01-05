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

        ItemBlockRenderTypes.setRenderLayer(XCBlocks.CLIFF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BASK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBASK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.CR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.CM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.CL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.WALL_LINER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.RED_FLAG.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.WHITE_FLAG.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BHM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BHL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BHR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BFM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BFL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.BFR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.SB.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(XCBlocks.STABLEDOOR_1.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.STABLEDOOR_3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.STABLEDOOR_5.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.STABLEDOOR_7.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.STABLEDOOR_9.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.STABLEDOOR_11.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANT_BLACK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANT_BLUE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANT_CYAN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANT_GREEN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANT_PINK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANT_PURPLE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANT_RED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANT_WHITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANTG_BLACK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANTG_BLUE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANTG_CYAN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANTG_GREEN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANTG_PINK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANTG_PURPLE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANTG_RED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.LANTG_WHITE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_ALM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_AZB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_BOD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_CFL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_DLN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_LVY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_PPY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_PTLP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_OTLP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_RTLP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_WTLP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBL_ODY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_ALM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_AZB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_BOD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_CFL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_DLN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_LVY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_PPY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_PTLP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_OTLP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_RTLP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_WTLP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(XCBlocks.FBS_ODY.get(), RenderType.cutout());
    }
}





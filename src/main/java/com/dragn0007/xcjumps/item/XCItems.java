package com.dragn0007.xcjumps.item;


import com.dragn0007.xcjumps.XCJumps;
import com.dragn0007.xcjumps.block.XCBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class XCItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, XCJumps.MODID);

    public static final RegistryObject<Item> DECOMODTAB = ITEMS.register("decomodtab",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUMPMODTAB = ITEMS.register("jumpmodtab",
            () -> new Item(new Item.Properties()));


    //Medals
    public static final RegistryObject<EpicAwardItem> DIAMOND_MEDAL = ITEMS.register("diamond_medal",
            () -> new EpicAwardItem(
                    XCBlocks.WMD.get(),
                    new Item.Properties().rarity(Rarity.EPIC).durability(10).tab(XCItemGroup.DECO),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 3,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 3,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 3,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 6000, 3,true, false)
            ));
    public static final RegistryObject<RareAwardItem> GOLD_MEDAL = ITEMS.register("gold_medal",
            () -> new RareAwardItem(
                    XCBlocks.WMG.get(),
                    new Item.Properties().rarity(Rarity.RARE).durability(10).tab(XCItemGroup.DECO),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 2,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 4800, 2,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 4800, 2,true, false)
            ));
    public static final RegistryObject<UncommonAwardItem> SILVER_MEDAL = ITEMS.register("silver_medal",
            () -> new UncommonAwardItem(
                    XCBlocks.WMS.get(),
                    new Item.Properties().rarity(Rarity.UNCOMMON).durability(10).tab(XCItemGroup.DECO),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1,true, false)
            ));
    public static final RegistryObject<CommonAwardItem> BRONZE_MEDAL = ITEMS.register("bronze_medal",
            () -> new CommonAwardItem(
                    XCBlocks.WMB.get(),
                    new Item.Properties().rarity(Rarity.COMMON).durability(10).tab(XCItemGroup.DECO),
                    new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1,true, false)
            ));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
package com.dragn0007.xcjumps.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class RareAwardItem extends Item {

    public MobEffectInstance[] effectInstances;

    public RareAwardItem(MobEffectInstance... effectInstances) {
        super(new Properties().rarity(Rarity.RARE).durability(10).tab(XCItemGroup.XC_GROUP));
        this.effectInstances = effectInstances;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player playerEntity, InteractionHand hand) {
        if(!level.isClientSide) {
            for(int i = 0; i < effectInstances.length; i++) {
                playerEntity.addEffect(effectInstances[i]);
            }
            ItemStack itemStack = playerEntity.getItemInHand(hand);
            itemStack.hurtAndBreak(2, playerEntity, deez -> deez.broadcastBreakEvent(hand));
        }
        return super.use(level, playerEntity, hand);
    }
}


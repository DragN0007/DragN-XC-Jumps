package com.dragn0007.xcjumps.item;

import com.dragn0007.xcjumps.block.XCBlocks;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class CommonAwardItem extends ItemNameBlockItem {
        public MobEffectInstance[] effectInstances;

        public CommonAwardItem(Block block, Properties properties, MobEffectInstance... effectInstances) {
            super(block, properties);
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



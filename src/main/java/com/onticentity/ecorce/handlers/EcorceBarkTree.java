package com.onticentity.ecorce.handlers;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class EcorceBarkTree {
    public static void register() {
        UseBlockCallback.EVENT.register(((player, level, hand, hitResult) -> {
            ItemStack stack = player.getItemInHand(hand);

            if (!(stack.getItem() instanceof AxeItem)) {
                return InteractionResult.PASS;
            }

            BlockPos pos = hitResult.getBlockPos();
            BlockState state = level.getBlockState(pos);

            BlockState stripped =
                    StrippableBlockRegistry.getStrippedBlockState(state);

            if (stripped == null) {
                return InteractionResult.PASS;
            }

            if (!level.isClientSide()) {

                /*Block.popResource(
                        level,
                        pos,
                        new ItemStack()
                );

                level.setBlockAndUpdate(pos, stripped);

                stack.hurtAndBreak(
                        1,
                        player,
                        hand
                );*/
            }

            return InteractionResult.SUCCESS;
        }));
    }
}

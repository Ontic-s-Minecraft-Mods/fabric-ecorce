package com.onticentity.ecorce.handlers;

import com.onticentity.ecorce.items.EcorceItems;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;
import java.util.Map;

public class EcorceBarkTree {

    private static final Map<Block, List<Item>> LOG = Map.ofEntries(
            Map.entry(Blocks.OAK_LOG, List.of(EcorceItems.OAK_INNER_BARK, EcorceItems.OAK_OUTER_BARK))
    );

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

                List<Item> items = LOG.get(state.getBlock());

                for (Item item : items) {
                    Block.popResource(
                            level,
                            pos,
                            new ItemStack(item)
                    );
                }

                level.setBlockAndUpdate(pos, stripped);

                stack.hurtAndBreak(
                        1,
                        player,
                        hand
                );
            }

            return InteractionResult.SUCCESS;
        }));
    }
}

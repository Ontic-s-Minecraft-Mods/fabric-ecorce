package com.onticentity.ecorce.items.effects;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EcorceCharredBirchInnerBarkEffect extends Item {
    public EcorceCharredBirchInnerBarkEffect(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(
            ItemStack stack,
            Level level,
            LivingEntity entity
    ) {
        ItemStack result = super.finishUsingItem(stack, level, entity);

        if (!level.isClientSide()) {
            MobEffectInstance poison = entity.getEffect(MobEffects.WEAKNESS);

            if (poison != null) {
                int newDuration = (int) (poison.getDuration() * 0.75f);

                int amplifier = poison.getAmplifier();
                boolean ambient = poison.isAmbient();
                boolean visible = poison.isVisible();
                boolean showIcon = poison.showIcon();

                entity.removeEffect(MobEffects.WEAKNESS);

                entity.addEffect(
                        new MobEffectInstance(
                                MobEffects.WEAKNESS,
                                newDuration,
                                amplifier,
                                ambient,
                                visible,
                                showIcon
                        )
                );
            }
        }

        return result;
    }
}

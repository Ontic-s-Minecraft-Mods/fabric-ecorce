package com.onticentity.ecorce.items.effects;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;

public class EcorceCharredSpruceInnerBarkEffect extends Item {

    public EcorceCharredSpruceInnerBarkEffect(Properties properties) {
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

            List<MobEffectInstance> harmfulEffects = new ArrayList<>();

            for (MobEffectInstance effect : entity.getActiveEffects()) {
                if (effect.getEffect().value().getCategory()
                        == MobEffectCategory.HARMFUL) {
                    harmfulEffects.add(effect);
                }
            }

            for (MobEffectInstance effect : harmfulEffects) {
                int newDuration =
                        Math.max(1, (int) (effect.getDuration() * 0.85f));

                var effectType = effect.getEffect();

                MobEffectInstance reducedEffect =
                        new MobEffectInstance(
                                effectType,
                                newDuration,
                                effect.getAmplifier(),
                                effect.isAmbient(),
                                effect.isVisible(),
                                effect.showIcon()
                        );

                entity.removeEffect(effectType);
                entity.addEffect(reducedEffect);
            }
        }

        return result;
    }
}
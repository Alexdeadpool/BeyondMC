
package net.mcreator.beyondmc.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.beyondmc.procedures.LeaningOnEffectActiveTickProcedure;
import net.mcreator.beyondmc.procedures.LeaningEffectStartedappliedProcedure;
import net.mcreator.beyondmc.procedures.LeaningEffectExpiresProcedure;

public class LeaningMobEffect extends MobEffect {
	public LeaningMobEffect() {
		super(MobEffectCategory.HARMFUL, -65281);
	}

	@Override
	public String getDescriptionId() {
		return "effect.beyondmc.leaning";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		LeaningEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		LeaningOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		LeaningEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

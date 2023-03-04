
package net.mcreator.beyondmc.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.beyondmc.procedures.RelaxationOnEffectActiveTickProcedure;
import net.mcreator.beyondmc.procedures.RelaxationEffectStartedappliedProcedure;
import net.mcreator.beyondmc.procedures.RelaxationEffectExpiresProcedure;

public class RelaxationMobEffect extends MobEffect {
	public RelaxationMobEffect() {
		super(MobEffectCategory.HARMFUL, -10027162);
	}

	@Override
	public String getDescriptionId() {
		return "effect.beyondmc.relaxation";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		RelaxationEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RelaxationOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		RelaxationEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

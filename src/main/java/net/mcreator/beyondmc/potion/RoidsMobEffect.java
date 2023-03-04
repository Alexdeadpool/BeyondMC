
package net.mcreator.beyondmc.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.beyondmc.procedures.RoidsOnEffectActiveTickProcedure;
import net.mcreator.beyondmc.procedures.RoidsEffectStartedappliedProcedure;
import net.mcreator.beyondmc.procedures.RoidsEffectExpiresProcedure;

public class RoidsMobEffect extends MobEffect {
	public RoidsMobEffect() {
		super(MobEffectCategory.HARMFUL, -65332);
	}

	@Override
	public String getDescriptionId() {
		return "effect.beyondmc.roids";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		RoidsEffectStartedappliedProcedure.execute(entity.level, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RoidsOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		RoidsEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

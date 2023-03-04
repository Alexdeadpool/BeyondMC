
package net.mcreator.beyondmc.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.beyondmc.procedures.HarrowingOnEffectActiveTickProcedure;
import net.mcreator.beyondmc.procedures.HarrowingEffectStartedappliedProcedure;
import net.mcreator.beyondmc.procedures.HarrowingEffectExpiresProcedure;

public class HarrowingMobEffect extends MobEffect {
	public HarrowingMobEffect() {
		super(MobEffectCategory.HARMFUL, -6750208);
	}

	@Override
	public String getDescriptionId() {
		return "effect.beyondmc.harrowing";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		HarrowingEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HarrowingOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		HarrowingEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

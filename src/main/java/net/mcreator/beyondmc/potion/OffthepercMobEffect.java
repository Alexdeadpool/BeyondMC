
package net.mcreator.beyondmc.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.beyondmc.procedures.OffthepercEffectStartedappliedProcedure;
import net.mcreator.beyondmc.procedures.OffthepercEffectExpiresProcedure;

public class OffthepercMobEffect extends MobEffect {
	public OffthepercMobEffect() {
		super(MobEffectCategory.HARMFUL, -3355444);
	}

	@Override
	public String getDescriptionId() {
		return "effect.beyondmc.offtheperc";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		OffthepercEffectStartedappliedProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		OffthepercEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

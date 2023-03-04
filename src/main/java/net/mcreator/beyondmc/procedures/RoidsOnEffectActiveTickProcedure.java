package net.mcreator.beyondmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.beyondmc.init.BeyondmcModParticleTypes;

public class RoidsOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (BeyondmcModParticleTypes.ROIDPARTICLE.get()), x, y, z, 5, 3, 3, 3, 1);
	}
}

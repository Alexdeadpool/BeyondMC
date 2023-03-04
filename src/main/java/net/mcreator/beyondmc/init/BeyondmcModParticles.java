
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondmc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.beyondmc.client.particle.RoidparticleParticle;
import net.mcreator.beyondmc.client.particle.MethparticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BeyondmcModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(BeyondmcModParticleTypes.METHPARTICLE.get(), MethparticleParticle::provider);
		event.register(BeyondmcModParticleTypes.ROIDPARTICLE.get(), RoidparticleParticle::provider);
	}
}

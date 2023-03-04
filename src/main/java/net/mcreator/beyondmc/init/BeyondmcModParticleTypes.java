
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.beyondmc.BeyondmcMod;

public class BeyondmcModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BeyondmcMod.MODID);
	public static final RegistryObject<SimpleParticleType> METHPARTICLE = REGISTRY.register("methparticle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ROIDPARTICLE = REGISTRY.register("roidparticle", () -> new SimpleParticleType(false));
}

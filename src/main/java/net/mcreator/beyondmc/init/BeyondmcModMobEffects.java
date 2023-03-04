
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.beyondmc.potion.RoidsMobEffect;
import net.mcreator.beyondmc.potion.RelaxationMobEffect;
import net.mcreator.beyondmc.potion.RageMobEffect;
import net.mcreator.beyondmc.potion.OffthepercMobEffect;
import net.mcreator.beyondmc.potion.LeaningMobEffect;
import net.mcreator.beyondmc.potion.HarrowingMobEffect;
import net.mcreator.beyondmc.BeyondmcMod;

public class BeyondmcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BeyondmcMod.MODID);
	public static final RegistryObject<MobEffect> RELAXATION = REGISTRY.register("relaxation", () -> new RelaxationMobEffect());
	public static final RegistryObject<MobEffect> RAGE = REGISTRY.register("rage", () -> new RageMobEffect());
	public static final RegistryObject<MobEffect> OFFTHEPERC = REGISTRY.register("offtheperc", () -> new OffthepercMobEffect());
	public static final RegistryObject<MobEffect> HARROWING = REGISTRY.register("harrowing", () -> new HarrowingMobEffect());
	public static final RegistryObject<MobEffect> ROIDS = REGISTRY.register("roids", () -> new RoidsMobEffect());
	public static final RegistryObject<MobEffect> LEANING = REGISTRY.register("leaning", () -> new LeaningMobEffect());
}

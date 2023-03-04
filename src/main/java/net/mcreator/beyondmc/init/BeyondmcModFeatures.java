
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.beyondmc.world.features.ores.SuspiciousleavesFeature;
import net.mcreator.beyondmc.world.features.ores.SilveroreFeature;
import net.mcreator.beyondmc.world.features.ores.MethylamineoreFeature;
import net.mcreator.beyondmc.world.features.SuspicioustreeFeature;
import net.mcreator.beyondmc.BeyondmcMod;

@Mod.EventBusSubscriber
public class BeyondmcModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BeyondmcMod.MODID);
	public static final RegistryObject<Feature<?>> SUSPICIOUSLEAVES = REGISTRY.register("suspiciousleaves", SuspiciousleavesFeature::feature);
	public static final RegistryObject<Feature<?>> SUSPICIOUSTREE = REGISTRY.register("suspicioustree", SuspicioustreeFeature::feature);
	public static final RegistryObject<Feature<?>> METHYLAMINEORE = REGISTRY.register("methylamineore", MethylamineoreFeature::feature);
	public static final RegistryObject<Feature<?>> SILVERORE = REGISTRY.register("silverore", SilveroreFeature::feature);
}

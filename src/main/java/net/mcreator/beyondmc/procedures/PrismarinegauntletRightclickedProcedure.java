package net.mcreator.beyondmc.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.beyondmc.init.BeyondmcModItems;
import net.mcreator.beyondmc.BeyondmcMod;

public class PrismarinegauntletRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof Level _lvl0 && _lvl0.isDay()) {
			(itemstack).setDamageValue(9);
			entity.hurt(DamageSource.LIGHTNING_BOLT, 9);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("beyondmc:gauntletsound")), SoundSource.MASTER, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("beyondmc:gauntletsound")), SoundSource.MASTER, 1, 1, false);
				}
			}
			BeyondmcMod.queueServerWork(255, () -> {
				if (world instanceof ServerLevel _level)
					_level.setDayTime(6000);
			});
			if (world instanceof ServerLevel _level)
				_level.setDayTime(18000);
			(new ItemStack(BeyondmcModItems.PRISMARINEGAUNTLET.get())).setDamageValue((int) 2.1);
		} else if (!(world instanceof Level _lvl9 && _lvl9.isDay())) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(6000);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("beyondmc:gauntletsound")), SoundSource.MASTER, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("beyondmc:gauntletsound")), SoundSource.MASTER, 1, 1, false);
				}
			}
		}
	}
}

package net.mcreator.beyondmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.beyondmc.init.BeyondmcModItems;
import net.mcreator.beyondmc.init.BeyondmcModBlocks;
import net.mcreator.beyondmc.BeyondmcMod;

public class SuspiciousseedsRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 0.5, z)) >= 8 && (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("crops:farmland")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(new BlockPos(x, y + 1, z), BeyondmcModBlocks.WEED_0.get().defaultBlockState(), 3);
			if (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
					}
					return false;
				}
			}.checkGamemode(entity)) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(BeyondmcModItems.SUSPICIOUSSEEDS.get());
					_setstack.setCount((int) ((itemstack).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			BeyondmcMod.queueServerWork(4000, () -> {
				if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 0.5, z)) >= 8 && (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("crops:farmland")))) {
					world.setBlock(new BlockPos(x, y + 1, z), BeyondmcModBlocks.WEED_1.get().defaultBlockState(), 3);
					BeyondmcMod.queueServerWork(4000, () -> {
						if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 0.5, z)) >= 8 && (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("crops:farmland")))) {
							world.setBlock(new BlockPos(x, y + 1, z), BeyondmcModBlocks.WEED_2.get().defaultBlockState(), 3);
							BeyondmcMod.queueServerWork(4000, () -> {
								if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 0.5, z)) >= 8 && (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("crops:farmland")))) {
									world.setBlock(new BlockPos(x, y + 1, z), BeyondmcModBlocks.WEED_3.get().defaultBlockState(), 3);
								}
							});
						}
					});
				}
			});
		}
	}
}

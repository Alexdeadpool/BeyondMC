
package net.mcreator.beyondmc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.beyondmc.procedures.LeaningEffectStartedappliedProcedure;
import net.mcreator.beyondmc.init.BeyondmcModTabs;

import java.util.List;

public class LeanItem extends Item {
	public LeanItem() {
		super(new Item.Properties().tab(BeyondmcModTabs.TAB_BEYOND).stacksTo(16).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("I LOVE LEAN"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LeaningEffectStartedappliedProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}

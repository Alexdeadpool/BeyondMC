
package net.mcreator.beyondmc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.beyondmc.procedures.RelaxationEffectStartedappliedProcedure;
import net.mcreator.beyondmc.init.BeyondmcModTabs;

public class WeedItem extends Item {
	public WeedItem() {
		super(new Item.Properties().tab(BeyondmcModTabs.TAB_BEYOND).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RelaxationEffectStartedappliedProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}

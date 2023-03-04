
package net.mcreator.beyondmc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.beyondmc.init.BeyondmcModTabs;

public class Perc30Item extends Item {
	public Perc30Item() {
		super(new Item.Properties().tab(BeyondmcModTabs.TAB_BEYOND).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f).alwaysEat()

				.build()));
	}
}


package net.mcreator.beyondmc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.beyondmc.init.BeyondmcModTabs;

public class SilveringotItem extends Item {
	public SilveringotItem() {
		super(new Item.Properties().tab(BeyondmcModTabs.TAB_BEYOND).stacksTo(64).rarity(Rarity.COMMON));
	}
}

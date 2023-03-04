
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondmc.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BeyondmcModTabs {
	public static CreativeModeTab TAB_BEYOND;

	public static void load() {
		TAB_BEYOND = new CreativeModeTab("tabbeyond") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BeyondmcModItems.ESSENCE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}

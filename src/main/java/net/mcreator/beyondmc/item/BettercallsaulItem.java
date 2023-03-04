
package net.mcreator.beyondmc.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.beyondmc.init.BeyondmcModTabs;

public class BettercallsaulItem extends RecordItem {
	public BettercallsaulItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("beyondmc:bettercallsaul")), new Item.Properties().tab(BeyondmcModTabs.TAB_BEYOND).stacksTo(1).rarity(Rarity.RARE), 1000);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}

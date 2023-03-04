
package net.mcreator.beyondmc.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.beyondmc.init.BeyondmcModTabs;

public class PrismarinesoldiersItem extends RecordItem {
	public PrismarinesoldiersItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("beyondmc:peismarinesoldiers")), new Item.Properties().tab(BeyondmcModTabs.TAB_BEYOND).stacksTo(1).rarity(Rarity.RARE), 1000);
	}
}

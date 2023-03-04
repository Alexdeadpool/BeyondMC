
package net.mcreator.beyondmc.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.beyondmc.init.BeyondmcModTabs;

import java.util.List;

public class Islandheisttheme2Item extends RecordItem {
	public Islandheisttheme2Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("beyondmc:islandheist2")), new Item.Properties().tab(BeyondmcModTabs.TAB_BEYOND).stacksTo(1).rarity(Rarity.RARE), 1000);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("By SORA"));
	}
}

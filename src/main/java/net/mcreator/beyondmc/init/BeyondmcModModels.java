
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondmc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.beyondmc.client.model.Modelmob_template;
import net.mcreator.beyondmc.client.model.Modelamongus;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BeyondmcModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelamongus.LAYER_LOCATION, Modelamongus::createBodyLayer);
		event.registerLayerDefinition(Modelmob_template.LAYER_LOCATION, Modelmob_template::createBodyLayer);
	}
}

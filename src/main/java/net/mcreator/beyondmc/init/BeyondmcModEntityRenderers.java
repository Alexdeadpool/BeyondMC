
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondmc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.beyondmc.client.renderer.GremlinRenderer;
import net.mcreator.beyondmc.client.renderer.AmongusRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BeyondmcModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BeyondmcModEntities.AMONGUS.get(), AmongusRenderer::new);
		event.registerEntityRenderer(BeyondmcModEntities.GREMLIN.get(), GremlinRenderer::new);
		event.registerEntityRenderer(BeyondmcModEntities.PISTOL.get(), ThrownItemRenderer::new);
	}
}

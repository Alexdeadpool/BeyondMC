
package net.mcreator.beyondmc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.beyondmc.entity.AmongusEntity;
import net.mcreator.beyondmc.client.model.Modelamongus;

public class AmongusRenderer extends MobRenderer<AmongusEntity, Modelamongus<AmongusEntity>> {
	public AmongusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelamongus(context.bakeLayer(Modelamongus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AmongusEntity entity) {
		return new ResourceLocation("beyondmc:textures/entities/amongus.png");
	}
}

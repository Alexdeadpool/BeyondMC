
package net.mcreator.beyondmc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.beyondmc.entity.GremlinEntity;
import net.mcreator.beyondmc.client.model.Modelcustom_model;

public class GremlinRenderer extends MobRenderer<GremlinEntity, Modelcustom_model<GremlinEntity>> {
	public GremlinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GremlinEntity entity) {
		return new ResourceLocation("beyondmc:textures/entities/gremlin_texture.png");
	}
}

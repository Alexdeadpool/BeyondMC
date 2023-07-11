
package net.mcreator.beyondmc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.beyondmc.entity.RedcoatEntity;
import net.mcreator.beyondmc.client.model.Modelmob_template;

public class RedcoatRenderer extends MobRenderer<RedcoatEntity, Modelmob_template<RedcoatEntity>> {
	public RedcoatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmob_template(context.bakeLayer(Modelmob_template.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedcoatEntity entity) {
		return new ResourceLocation("beyondmc:textures/entities/redcoat.png");
	}
}

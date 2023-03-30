package net.mcreator.beyondmc.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.beyondmc.entity.GremlinEntity;

public class GremlinModel extends AnimatedGeoModel<GremlinEntity> {
	@Override
	public ResourceLocation getAnimationResource(GremlinEntity entity) {
		return new ResourceLocation("beyondmc", "animations/gremlin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GremlinEntity entity) {
		return new ResourceLocation("beyondmc", "geo/gremlin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GremlinEntity entity) {
		return new ResourceLocation("beyondmc", "textures/entities/" + entity.getTexture() + ".png");
	}

}

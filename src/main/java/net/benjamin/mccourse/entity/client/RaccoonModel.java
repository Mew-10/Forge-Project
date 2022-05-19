package net.benjamin.mccourse.entity.client;

import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.entity.custom.RaccoonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class RaccoonModel extends AnimatedGeoModel<RaccoonEntity> {
    @Override
    public ResourceLocation getModelLocation(RaccoonEntity object) {
        return new ResourceLocation(MCCourseMod.MOD_ID, "geo/raccoon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RaccoonEntity object) {
        return RaccoonRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RaccoonEntity animatable) {
        return new ResourceLocation(MCCourseMod.MOD_ID, "animations/raccoon.animation.json");
    }
}
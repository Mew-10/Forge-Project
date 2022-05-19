package net.benjamin.mccourse.entity.client;

import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.entity.custom.TigerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TigerModel extends AnimatedGeoModel<TigerEntity> {
    @Override
    public ResourceLocation getModelLocation(TigerEntity entity)	{
        return new ResourceLocation(MCCourseMod.MOD_ID, "geo/tiger.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TigerEntity entity) {
        return new ResourceLocation(MCCourseMod.MOD_ID, "textures/entity/tiger/tiger.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TigerEntity entity)	{
        return new ResourceLocation(MCCourseMod.MOD_ID, "animations/tiger.animation.json");
    }
}

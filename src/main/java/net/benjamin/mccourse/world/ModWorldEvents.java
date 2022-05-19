package net.benjamin.mccourse.world;
import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.world.gen.ModFlowerGeneration;
import net.benjamin.mccourse.world.gen.ModOreGeneration;
import net.benjamin.mccourse.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MCCourseMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);}
}
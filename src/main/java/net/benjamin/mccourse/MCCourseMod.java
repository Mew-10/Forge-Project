package net.benjamin.mccourse;

import net.benjamin.mccourse.block.ModBlocks;
import net.benjamin.mccourse.effect.ModEffects;
import net.benjamin.mccourse.enchantment.ModEnchantments;
import net.benjamin.mccourse.fluid.ModFluids;
import net.benjamin.mccourse.item.Moditems;
import net.benjamin.mccourse.painting.ModPaintings;
import net.benjamin.mccourse.potion.ModPotions;
import net.benjamin.mccourse.sound.ModSounds;
import net.benjamin.mccourse.util.ModItemProperties;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MCCourseMod.MOD_ID)
public class MCCourseMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mccourse";

    public MCCourseMod() {
        // Register the setup method for modloading
        IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();

        Moditems.register(eventbus);
        ModBlocks.register(eventbus);
        ModFluids.register(eventbus);
        ModEnchantments.register(eventbus);
        ModEffects.register(eventbus);
        ModPotions.register(eventbus);
        ModPaintings.register(eventbus);
        ModSounds.register(eventbus);



        eventbus.addListener(this::setup);
        // Register the enqueueIMC method for modloading


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HONEY_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HONEY_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HONEY_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BLOSSOM_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TURNIP_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GEM_CUTTING_STATION.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WINTER_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BLOSSOM_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BLOSSOM_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_ROSE.get(), RenderType.cutout());

        ModItemProperties.addCustomItemProperties();


    }
    private void setup(final FMLCommonSetupEvent event)

    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}

package net.benjamin.mccourse.event;

import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.event.loot.DataTabletAdditionModifier;
import net.benjamin.mccourse.event.loot.DowsingRodInIglooAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = MCCourseMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new DataTabletAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(MCCourseMod.MOD_ID,"data_tablet")),
                new DowsingRodInIglooAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(MCCourseMod.MOD_ID,"dowsing_rod_in_igloo"))


        );
    }



}
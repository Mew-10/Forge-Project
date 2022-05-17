package net.benjamin.mccourse.item;

import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.item.custom.CoalSilverItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> COAL_SILVER = ITEMS.register("coal_silver",
            () -> new CoalSilverItem(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CHIPPED_CITRINE = ITEMS.register("chipped_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

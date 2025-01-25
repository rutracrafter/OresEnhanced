package net.rutracrafter.oresenhanced.Item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rutracrafter.oresenhanced.OresEnhanced;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OresEnhanced.MOD_ID);

    public static final RegistryObject<Item> RAW_JAZERITH = ITEMS.register("raw_jazerith",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SKADIUM = ITEMS.register("raw_skadium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_KELGAMITE = ITEMS.register("raw_kelgamite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RAZION = ITEMS.register("raw_razion",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JAZERITH = ITEMS.register("jazerith",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

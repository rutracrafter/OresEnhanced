package net.rutracrafter.oresenhanced.Item;

import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> SKADIUM = ITEMS.register("skadium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KELGAMITE = ITEMS.register("kelgamite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAZION = ITEMS.register("razion",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JAZERITH_SWORD = ITEMS.register("jazerith_sword",
            () -> new SwordItem(ModToolTiers.JAZERITH, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> JAZERITH_PICKAXE = ITEMS.register("jazerith_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JAZERITH, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> JAZERITH_AXE = ITEMS.register("jazerith_axe",
            () -> new AxeItem(ModToolTiers.JAZERITH, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> JAZERITH_SHOVEL = ITEMS.register("jazerith_shovel",
            () -> new ShovelItem(ModToolTiers.JAZERITH, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> JAZERITH_HOE = ITEMS.register("jazerith_hoe",
            () -> new HoeItem(ModToolTiers.JAZERITH, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> SKADIUM_SWORD = ITEMS.register("skadium_sword",
            () -> new SwordItem(ModToolTiers.SKADIUM, 5, 3, new Item.Properties()));
    public static final RegistryObject<Item> SKADIUM_PICKAXE = ITEMS.register("skadium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SKADIUM, 2, 2, new Item.Properties()));
    public static final RegistryObject<Item> SKADIUM_AXE = ITEMS.register("skadium_axe",
            () -> new AxeItem(ModToolTiers.SKADIUM, 8, 2, new Item.Properties()));
    public static final RegistryObject<Item> SKADIUM_SHOVEL = ITEMS.register("skadium_shovel",
            () -> new ShovelItem(ModToolTiers.SKADIUM, 2, 2, new Item.Properties()));
    public static final RegistryObject<Item> SKADIUM_HOE = ITEMS.register("skadium_hoe",
            () -> new HoeItem(ModToolTiers.SKADIUM, 2, 2, new Item.Properties()));

    public static final RegistryObject<Item> KELGAMITE_SWORD = ITEMS.register("kelgamite_sword",
            () -> new SwordItem(ModToolTiers.KELGAMITE, 6, 4, new Item.Properties()));
    public static final RegistryObject<Item> KELGAMITE_PICKAXE = ITEMS.register("kelgamite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KELGAMITE, 3, 3, new Item.Properties()));
    public static final RegistryObject<Item> KELGAMITE_AXE = ITEMS.register("kelgamite_axe",
            () -> new AxeItem(ModToolTiers.KELGAMITE, 9, 3, new Item.Properties()));
    public static final RegistryObject<Item> KELGAMITE_SHOVEL = ITEMS.register("kelgamite_shovel",
            () -> new ShovelItem(ModToolTiers.KELGAMITE, 3, 3, new Item.Properties()));
    public static final RegistryObject<Item> KELGAMITE_HOE = ITEMS.register("kelgamite_hoe",
            () -> new HoeItem(ModToolTiers.KELGAMITE, 3, 3, new Item.Properties()));

    public static final RegistryObject<Item> RAZION_SWORD = ITEMS.register("razion_sword",
            () -> new SwordItem(ModToolTiers.RAZION, 7, 5, new Item.Properties()));
    public static final RegistryObject<Item> RAZION_PICKAXE = ITEMS.register("razion_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RAZION, 4, 4, new Item.Properties()));
    public static final RegistryObject<Item> RAZION_AXE = ITEMS.register("razion_axe",
            () -> new AxeItem(ModToolTiers.RAZION, 10, 4, new Item.Properties()));
    public static final RegistryObject<Item> RAZION_SHOVEL = ITEMS.register("razion_shovel",
            () -> new ShovelItem(ModToolTiers.RAZION, 4, 4, new Item.Properties()));
    public static final RegistryObject<Item> RAZION_HOE = ITEMS.register("razion_hoe",
            () -> new HoeItem(ModToolTiers.RAZION, 4, 4, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

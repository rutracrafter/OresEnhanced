package net.rutracrafter.oresenhanced.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rutracrafter.oresenhanced.OresEnhanced;
import net.rutracrafter.oresenhanced.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OresEnhanced.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ORESENHANCED_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("oresenhanced_item_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.RAW_JAZERITH.get()))
                    .title(Component.translatable("creativetab.oresenhanced.oresenhanced_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_JAZERITH.get());
                        output.accept(ModItems.RAW_SKADIUM.get());
                        output.accept(ModItems.RAW_KELGAMITE.get());
                        output.accept(ModItems.RAW_RAZION.get());

                        output.accept(ModItems.JAZERITH.get());
                        output.accept(ModItems.SKADIUM.get());
                        output.accept(ModItems.KELGAMITE.get());
                        output.accept(ModItems.RAZION.get());

                        output.accept(ModItems.JAZERITH_SWORD.get());
                        output.accept(ModItems.JAZERITH_PICKAXE.get());
                        output.accept(ModItems.JAZERITH_AXE.get());
                        output.accept(ModItems.JAZERITH_SHOVEL.get());
                        output.accept(ModItems.JAZERITH_HOE.get());

                        output.accept(ModItems.SKADIUM_SWORD.get());
                        output.accept(ModItems.SKADIUM_PICKAXE.get());
                        output.accept(ModItems.SKADIUM_AXE.get());
                        output.accept(ModItems.SKADIUM_SHOVEL.get());
                        output.accept(ModItems.SKADIUM_HOE.get());

                        output.accept(ModItems.KELGAMITE_SWORD.get());
                        output.accept(ModItems.KELGAMITE_PICKAXE.get());
                        output.accept(ModItems.KELGAMITE_AXE.get());
                        output.accept(ModItems.KELGAMITE_SHOVEL.get());
                        output.accept(ModItems.KELGAMITE_HOE.get());

                        output.accept(ModItems.RAZION_SWORD.get());
                        output.accept(ModItems.RAZION_PICKAXE.get());
                        output.accept(ModItems.RAZION_AXE.get());
                        output.accept(ModItems.RAZION_SHOVEL.get());
                        output.accept(ModItems.RAZION_HOE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ORESENHANCED_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("oresenhanced_blocks_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.JAZERITH_BLOCK.get()))
                    .withTabsBefore(ORESENHANCED_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.oresenhanced.oresenhanced_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RAW_JAZERITH_BLOCK.get());
                        output.accept(ModBlocks.RAW_SKADIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_KELGAMITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_RAZION_BLOCK.get());

                        output.accept(ModBlocks.JAZERITH_BLOCK.get());
                        output.accept(ModBlocks.SKADIUM_BLOCK.get());
                        output.accept(ModBlocks.KELGAMITE_BLOCK.get());
                        output.accept(ModBlocks.RAZION_BLOCK.get());

                        output.accept(ModBlocks.JAZERITH_ORE.get());
                        output.accept(ModBlocks.SKADIUM_ORE.get());
                        output.accept(ModBlocks.KELGAMITE_ORE.get());
                        output.accept(ModBlocks.RAZION_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

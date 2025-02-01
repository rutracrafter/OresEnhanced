package net.rutracrafter.oresenhanced.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rutracrafter.oresenhanced.Item.ModItems;
import net.rutracrafter.oresenhanced.OresEnhanced;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OresEnhanced.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_JAZERITH);
        simpleItem(ModItems.RAW_SKADIUM);
        simpleItem(ModItems.RAW_KELGAMITE);
        simpleItem(ModItems.RAW_RAZION);

        simpleItem(ModItems.JAZERITH);
        simpleItem(ModItems.SKADIUM);
        simpleItem(ModItems.KELGAMITE);
        simpleItem(ModItems.RAZION);

        handheldItem(ModItems.JAZERITH_SWORD);
        handheldItem(ModItems.JAZERITH_PICKAXE);
        handheldItem(ModItems.JAZERITH_AXE);
        handheldItem(ModItems.JAZERITH_SHOVEL);
        handheldItem(ModItems.JAZERITH_HOE);

        handheldItem(ModItems.SKADIUM_SWORD);
        handheldItem(ModItems.SKADIUM_PICKAXE);
        handheldItem(ModItems.SKADIUM_AXE);
        handheldItem(ModItems.SKADIUM_SHOVEL);
        handheldItem(ModItems.SKADIUM_HOE);

        handheldItem(ModItems.KELGAMITE_SWORD);
        handheldItem(ModItems.KELGAMITE_PICKAXE);
        handheldItem(ModItems.KELGAMITE_AXE);
        handheldItem(ModItems.KELGAMITE_SHOVEL);
        handheldItem(ModItems.KELGAMITE_HOE);

        handheldItem(ModItems.RAZION_SWORD);
        handheldItem(ModItems.RAZION_PICKAXE);
        handheldItem(ModItems.RAZION_AXE);
        handheldItem(ModItems.RAZION_SHOVEL);
        handheldItem(ModItems.RAZION_HOE);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(OresEnhanced.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(OresEnhanced.MOD_ID, "item/" + item.getId().getPath()));
    }
}

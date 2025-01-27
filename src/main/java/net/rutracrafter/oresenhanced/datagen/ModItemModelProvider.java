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
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(OresEnhanced.MOD_ID, "item/" + item.getId().getPath()));
    }
}

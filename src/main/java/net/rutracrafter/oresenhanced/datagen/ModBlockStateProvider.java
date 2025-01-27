package net.rutracrafter.oresenhanced.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rutracrafter.oresenhanced.OresEnhanced;
import net.rutracrafter.oresenhanced.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, OresEnhanced.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RAW_JAZERITH_BLOCK);
        blockWithItem(ModBlocks.RAW_SKADIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_KELGAMITE_BLOCK);
        blockWithItem(ModBlocks.RAW_RAZION_BLOCK);

        blockWithItem(ModBlocks.JAZERITH_BLOCK);
        blockWithItem(ModBlocks.SKADIUM_BLOCK);
        blockWithItem(ModBlocks.KELGAMITE_BLOCK);
        blockWithItem(ModBlocks.RAZION_BLOCK);

        blockWithItem(ModBlocks.JAZERITH_ORE);
        blockWithItem(ModBlocks.SKADIUM_ORE);
        blockWithItem(ModBlocks.KELGAMITE_ORE);
        blockWithItem(ModBlocks.RAZION_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

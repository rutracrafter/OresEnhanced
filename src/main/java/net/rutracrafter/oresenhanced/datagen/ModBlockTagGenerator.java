package net.rutracrafter.oresenhanced.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rutracrafter.oresenhanced.OresEnhanced;
import net.rutracrafter.oresenhanced.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, OresEnhanced.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.JAZERITH_BLOCK.get(),
                        ModBlocks.SKADIUM_BLOCK.get(),
                        ModBlocks.KELGAMITE_BLOCK.get(),
                        ModBlocks.RAZION_BLOCK.get(),

                        ModBlocks.RAW_JAZERITH_BLOCK.get(),
                        ModBlocks.RAW_SKADIUM_BLOCK.get(),
                        ModBlocks.RAW_KELGAMITE_BLOCK.get(),
                        ModBlocks.RAW_RAZION_BLOCK.get(),


                        ModBlocks.JAZERITH_ORE.get(),
                        ModBlocks.SKADIUM_ORE.get(),
                        ModBlocks.KELGAMITE_ORE.get(),
                        ModBlocks.RAZION_ORE.get()

                );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        ModBlocks.JAZERITH_BLOCK.get(),
                        ModBlocks.SKADIUM_BLOCK.get(),
                        ModBlocks.KELGAMITE_BLOCK.get(),
                        ModBlocks.RAZION_BLOCK.get(),

                        ModBlocks.RAW_JAZERITH_BLOCK.get(),
                        ModBlocks.RAW_SKADIUM_BLOCK.get(),
                        ModBlocks.RAW_KELGAMITE_BLOCK.get(),
                        ModBlocks.RAW_RAZION_BLOCK.get()


                );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(
                        ModBlocks.JAZERITH_ORE.get(),
                        ModBlocks.SKADIUM_ORE.get(),
                        ModBlocks.KELGAMITE_ORE.get(),
                        ModBlocks.RAZION_ORE.get()
                );
    }
}
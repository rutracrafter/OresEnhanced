package net.rutracrafter.oresenhanced.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.rutracrafter.oresenhanced.Item.ModItems;
import net.rutracrafter.oresenhanced.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RAW_JAZERITH_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SKADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_KELGAMITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_RAZION_BLOCK.get());

        this.dropSelf(ModBlocks.JAZERITH_BLOCK.get());
        this.dropSelf(ModBlocks.SKADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.KELGAMITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAZION_BLOCK.get());

        this.add(ModBlocks.JAZERITH_ORE.get(),
                block -> createOreDrop(ModBlocks.JAZERITH_ORE.get(), ModItems.RAW_JAZERITH.get()));
        this.add(ModBlocks.SKADIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.SKADIUM_ORE.get(), ModItems.RAW_SKADIUM.get()));
        this.add(ModBlocks.KELGAMITE_ORE.get(),
                block -> createOreDrop(ModBlocks.KELGAMITE_ORE.get(), ModItems.RAW_KELGAMITE.get()));
        this.add(ModBlocks.RAZION_ORE.get(),
                block -> createOreDrop(ModBlocks.RAZION_ORE.get(), ModItems.RAW_RAZION.get()));
    }

    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

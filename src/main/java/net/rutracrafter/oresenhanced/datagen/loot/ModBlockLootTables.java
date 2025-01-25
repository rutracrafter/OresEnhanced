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
        this.dropSelf(ModBlocks.JAZERITH_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_JAZERITH_BLOCK.get());

        this.add(ModBlocks.JAZERITH_ORE.get(),
                block -> createOreDrop(ModBlocks.JAZERITH_ORE.get(), ModItems.RAW_JAZERITH.get()));
    }

    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

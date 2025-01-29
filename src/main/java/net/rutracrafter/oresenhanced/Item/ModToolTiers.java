package net.rutracrafter.oresenhanced.Item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.rutracrafter.oresenhanced.OresEnhanced;
import net.rutracrafter.oresenhanced.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier JAZERITH = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1800, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_JAZERITH_TOOL, () -> Ingredient.of(ModItems.JAZERITH.get())),
            new ResourceLocation(OresEnhanced.MOD_ID, "jazerith"), List.of(Tiers.NETHERITE), List.of());
}

package net.rutracrafter.oresenhanced.Item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.rutracrafter.oresenhanced.OresEnhanced;
import net.rutracrafter.oresenhanced.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier NETHERITE = TierSortingRegistry.registerTier(
            new ForgeTier(4, 2031, 9f, 4f, 15,
                    ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(OresEnhanced.MOD_ID, "netherite_ingot"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier JAZERITH = TierSortingRegistry.registerTier(
            new ForgeTier(5, 4062, 14f, 6f, 25,
                    ModTags.Blocks.NEEDS_JAZERITH_TOOL, () -> Ingredient.of(ModItems.JAZERITH.get())),
            new ResourceLocation(OresEnhanced.MOD_ID, "jazerith"), List.of(ModToolTiers.NETHERITE), List.of());

    public static final Tier SKADIUM = TierSortingRegistry.registerTier(
            new ForgeTier(6, 8121, 18f, 8f, 27,
                    ModTags.Blocks.NEEDS_SKADIUM_TOOL, () -> Ingredient.of(ModItems.SKADIUM.get())),
            new ResourceLocation(OresEnhanced.MOD_ID, "skadium"), List.of(ModToolTiers.JAZERITH), List.of());

    public static final Tier KELGAMITE = TierSortingRegistry.registerTier(
            new ForgeTier(7, 16242, 22f, 10f, 29,
                    ModTags.Blocks.NEEDS_KELGAMITE_TOOL, () -> Ingredient.of(ModItems.KELGAMITE.get())),
            new ResourceLocation(OresEnhanced.MOD_ID, "kelgamite"), List.of(ModToolTiers.SKADIUM), List.of());

    public static final Tier RAZION = TierSortingRegistry.registerTier(
            new ForgeTier(8, 32484, 256f, 12f, 31,
                    ModTags.Blocks.NEEDS_RAZION_TOOL, () -> Ingredient.of(ModItems.RAZION.get())),
            new ResourceLocation(OresEnhanced.MOD_ID, "razion"), List.of(ModToolTiers.KELGAMITE), List.of());
}

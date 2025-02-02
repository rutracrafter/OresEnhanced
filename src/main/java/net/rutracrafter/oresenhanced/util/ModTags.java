package net.rutracrafter.oresenhanced.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.rutracrafter.oresenhanced.OresEnhanced;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");
        public static final TagKey<Block> NEEDS_JAZERITH_TOOL = createTag("needs_jazerith_tool");
        public static final TagKey<Block> NEEDS_SKADIUM_TOOL = createTag("needs_skadium_tool");
        public static final TagKey<Block> NEEDS_KELGAMITE_TOOL = createTag("needs_kelgamite_tool");
        public static final TagKey<Block> NEEDS_RAZION_TOOL = createTag("needs_razion_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(OresEnhanced.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(OresEnhanced.MOD_ID, name));
        }
    }
}

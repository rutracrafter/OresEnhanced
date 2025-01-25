package net.rutracrafter.oresenhanced.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rutracrafter.oresenhanced.Item.ModItems;
import net.rutracrafter.oresenhanced.OresEnhanced;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OresEnhanced.MOD_ID);

    public static final RegistryObject<Block> JAZERITH_BLOCK = registerBLock("jazerith_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RAW_JAZERITH_BLOCK = registerBLock("raw_jazerith_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> JAZERITH_ORE = registerBLock("jazerith_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(4f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2, 4)));

    private static <T extends Block> RegistryObject<T> registerBLock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

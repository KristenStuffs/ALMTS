package com.kristen.almts.block;

import com.kristen.almts.ALMTS;
import com.kristen.almts.block.custom.BarnaclesBlock;
import com.kristen.almts.block.custom.ClamShellBlock;
import com.kristen.almts.block.custom.GiantClamShellBlock;
import com.kristen.almts.block.custom.SandDollarBlock;
import com.kristen.almts.item.ModItems;
import com.kristen.almts.misc.ModCreativeModeTab;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, ALMTS.MOD_ID);
	

	// Register Blocks
    public static final RegistryObject<Block> PEARL_BLOCK = registerBlock("pearl_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 4F).requiresCorrectToolForDrops()), ModCreativeModeTab.ALMTS_TAB);
    
    public static final RegistryObject<Block> SAND_DOLLAR = registerBlock("sand_dollar",
            () -> new SandDollarBlock(BlockBehaviour.Properties.of(Material.DECORATION).noOcclusion()
                    .strength(0f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALMTS_TAB);
    
    public static final RegistryObject<Block> CLAM_SHELL = registerBlock("clam_shell",
            () -> new ClamShellBlock(BlockBehaviour.Properties.of(Material.DECORATION).noOcclusion()
                    .strength(0.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALMTS_TAB);
    
    public static final RegistryObject<Block> GIANT_CLAM_SHELL = registerBlock("giant_clam_shell",
            () -> new GiantClamShellBlock(BlockBehaviour.Properties.of(Material.DECORATION).noOcclusion()
                    .strength(0.8f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALMTS_TAB);    

    public static final RegistryObject<Block> BARNACLES = registerBlock("barnacles",
            () -> new BarnaclesBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()
                    .strength(25.0f, 128F).requiresCorrectToolForDrops()), ModCreativeModeTab.ALMTS_TAB);  
    
    // Boring Junk
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
	}
	

}

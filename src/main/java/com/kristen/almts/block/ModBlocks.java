package com.kristen.almts.block;

import com.kristen.almts.ALMTS;
import com.kristen.almts.block.custom.CustomCarpetWaterlogged;
import com.kristen.almts.block.custom.BarnaclesBlock;
import com.kristen.almts.block.custom.ClamShellBlock;
import com.kristen.almts.block.custom.GiantClamShellBlock;
import com.kristen.almts.block.custom.LivingSpongeBlock;
import com.kristen.almts.block.custom.LivingSpongePlantBlock;
import com.kristen.almts.block.custom.RedLivingSpongeBlock;
import com.kristen.almts.block.custom.RedLivingSpongePlantBlock;
import com.kristen.almts.block.custom.RedSpongeBlock;
import com.kristen.almts.block.custom.SandDollarBlock;
import com.kristen.almts.block.custom.SpongeCake;
import com.kristen.almts.item.ModItems;
import com.kristen.almts.misc.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
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

    public static final RegistryObject<Block> BARNACLE_PASTE = registerBlock("barnacle_paste",
            () -> new CustomCarpetWaterlogged(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()
                    .strength(25.0f, 128F).requiresCorrectToolForDrops().speedFactor(0.0F).jumpFactor(0.0F)), ModCreativeModeTab.ALMTS_TAB); 
    
    public static final RegistryObject<Block> LIVING_SPONGE = registerBlock("living_sponge",
            () -> new LivingSpongeBlock(BlockBehaviour.Properties.copy(Blocks.KELP).noCollission()
                    .instabreak().requiresCorrectToolForDrops().sound(SoundType.WET_GRASS)), ModCreativeModeTab.ALMTS_TAB); 
   
    public static final RegistryObject<Block> LIVING_SPONGE_PLANT = registerBlock("living_sponge_plant",
            () -> new LivingSpongePlantBlock(BlockBehaviour.Properties.copy(Blocks.KELP).noCollission()
                    .instabreak().requiresCorrectToolForDrops().sound(SoundType.WET_GRASS)), null); 
    
    public static final RegistryObject<Block> SPONGE_CAKE = registerBlock("sponge_cake",
            () -> new SpongeCake(BlockBehaviour.Properties.of(Material.CAKE)
                    .strength(0.3f).requiresCorrectToolForDrops().sound(SoundType.GRASS)), ModCreativeModeTab.ALMTS_TAB); 
    
    public static final RegistryObject<Block> RED_SPONGE = registerBlock("red_sponge",
            () -> new RedSpongeBlock(BlockBehaviour.Properties.of(Material.SPONGE)
            		.strength(0.6f).requiresCorrectToolForDrops().sound(SoundType.GRASS)), ModCreativeModeTab.ALMTS_TAB);
    
    public static final RegistryObject<Block> RED_LIVING_SPONGE = registerBlock("red_living_sponge",
            () -> new RedLivingSpongeBlock(BlockBehaviour.Properties.copy(Blocks.KELP).noCollission()
                    .instabreak().requiresCorrectToolForDrops().sound(SoundType.WET_GRASS)), ModCreativeModeTab.ALMTS_TAB); 
   
    public static final RegistryObject<Block> RED_LIVING_SPONGE_PLANT = registerBlock("red_living_sponge_plant",
            () -> new RedLivingSpongePlantBlock(BlockBehaviour.Properties.copy(Blocks.KELP).noCollission()
                    .instabreak().requiresCorrectToolForDrops().sound(SoundType.WET_GRASS)), null);

    
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

package com.kristen.almts.item;

import com.kristen.almts.ALMTS;
import com.kristen.almts.misc.ModCreativeModeTab;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, ALMTS.MOD_ID);

// Register Items
    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALMTS_TAB)));
    
    public static final RegistryObject<Item> SHELL = ITEMS.register("shell",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALMTS_TAB)));
    
    public static final RegistryObject<Item> RAW_ATLANTIC_LOBSTER = ITEMS.register("raw_atlantic_lobster",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALMTS_TAB).food(ModFoods.RAW_ATLANTIC_LOBSTER)));

// Boring Crap
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
	}
	
}

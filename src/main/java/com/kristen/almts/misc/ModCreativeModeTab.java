package com.kristen.almts.misc;

import com.kristen.almts.block.ModBlocks;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

	public class ModCreativeModeTab {
	    public static final CreativeModeTab ALMTS_TAB = new CreativeModeTab("almtstab") {
	        @Override
	        public ItemStack makeIcon() {
	            return new ItemStack(ModBlocks.SAND_DOLLAR.get());
	        }
	    };
	}
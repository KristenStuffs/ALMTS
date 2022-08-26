package com.kristen.almts.util;

import com.kristen.almts.ALMTS;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
	public static class Blocks {
	
        public static final TagKey<Block> CANDLE_SPONGE_CAKES
        = tag("candle_sponge_cakes");

        private static TagKey<Block> tag(String name) {
        	return BlockTags.create(new ResourceLocation(ALMTS.MOD_ID, name));
}

	@SuppressWarnings("unused")
	private static TagKey<Block> forgeTag(String name) {
		return BlockTags.create(new ResourceLocation("forge", name));
}
	}

	
	public static class Items {
		

        @SuppressWarnings("unused")
		private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ALMTS.MOD_ID, name));
        }

        @SuppressWarnings("unused")
		private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
		
	}

}
}

package com.kristen.almts.world.feature;

import com.kristen.almts.block.ModBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class ModConfiguredFeatures {


	   public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_SAND_DOLLAR = FeatureUtils.register("patch_sand_dollar", Feature.RANDOM_PATCH, new RandomPatchConfiguration(12, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SAND_DOLLAR.get())), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesBlock(Blocks.SAND, new BlockPos(0, -1, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(-1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, -1)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, 1))))));
	   public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_CLAM_SHELL_BEACH = FeatureUtils.register("patch_clam_shell_beach", Feature.RANDOM_PATCH, new RandomPatchConfiguration(42, 5, 5, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLAM_SHELL.get())), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesBlock(Blocks.SAND, new BlockPos(0, -1, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(-1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, -1)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, 1))))));
	   public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_CLAM_SHELL_STONY_SHORE = FeatureUtils.register("patch_clam_shell_stony_shore", Feature.RANDOM_PATCH, new RandomPatchConfiguration(46, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLAM_SHELL.get())), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesBlock(Blocks.STONE, new BlockPos(0, -1, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(-1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, -1)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, 1))))));
	   public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_GIANT_CLAM_SHELL = FeatureUtils.register("patch_giant_clam_shell", Feature.RANDOM_PATCH, new RandomPatchConfiguration(4, 16, 16, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GIANT_CLAM_SHELL.get())), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesBlock(Blocks.STONE, new BlockPos(0, -1, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(-1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, -1)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, 1))))));
	   public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_BARNACLES_LAND = FeatureUtils.register("patch_barnacles_land", Feature.RANDOM_PATCH, new RandomPatchConfiguration(12, 5, 5, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BARNACLES.get())), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesBlock(Blocks.STONE, new BlockPos(0, -1, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(-1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(1, 0, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, -1)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 0, 1))))));
	   public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_BARNACLES_SEA = FeatureUtils.register("patch_barnacles_sea", Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BARNACLES.get())), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesBlock(Blocks.STONE, new BlockPos(0, -1, 0)), BlockPredicate.matchesBlock(Blocks.WATER, new BlockPos(0, 1, 0)), BlockPredicate.matchesBlock(Blocks.AIR, new BlockPos(0, 7, 0))))));

}
package com.kristen.almts.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> SAND_DOLLAR_PLACED = PlacementUtils.register("sand_dollar_placed",
            ModConfiguredFeatures.PATCH_SAND_DOLLAR, RarityFilter.onAverageOnceEvery(8),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> CLAM_SHELL_BEACH_PLACED = PlacementUtils.register("clam_shell_beach_placed",
            ModConfiguredFeatures.PATCH_CLAM_SHELL_BEACH, RarityFilter.onAverageOnceEvery(4),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    
    public static final Holder<PlacedFeature> CLAM_SHELL_STONY_SHORE_PLACED = PlacementUtils.register("clam_shell_stony_shore_placed",
            ModConfiguredFeatures.PATCH_CLAM_SHELL_STONY_SHORE, RarityFilter.onAverageOnceEvery(2),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());    
    
    
    public static final Holder<PlacedFeature> GIANT_CLAM_SHELL_PLACED = PlacementUtils.register("giant_clam_shell_placed",
            ModConfiguredFeatures.PATCH_GIANT_CLAM_SHELL, RarityFilter.onAverageOnceEvery(12),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());    
    
    public static final Holder<PlacedFeature> BARNACLES_LAND_PLACED = PlacementUtils.register("barnacles_land_placed",
            ModConfiguredFeatures.PATCH_BARNACLES_LAND, RarityFilter.onAverageOnceEvery(10),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());   
    
    public static final Holder<PlacedFeature> BARNACLES_SEA_PLACED = PlacementUtils.register("barnacles_sea_placed",
            ModConfiguredFeatures.PATCH_BARNACLES_SEA, RarityFilter.onAverageOnceEvery(2),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());     


}
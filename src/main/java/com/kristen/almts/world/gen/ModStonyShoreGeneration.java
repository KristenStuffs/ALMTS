package com.kristen.almts.world.gen;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;

import com.kristen.almts.world.feature.ModPlacedFeatures;

public class ModStonyShoreGeneration {
    public static void generatePatch(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.BEACH)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.CLAM_SHELL_STONY_SHORE_PLACED);     
            base.add(ModPlacedFeatures.GIANT_CLAM_SHELL_PLACED);      
            base.add(ModPlacedFeatures.BARNACLES_LAND_PLACED);      
            base.add(ModPlacedFeatures.BARNACLES_SEA_PLACED);      
        }
        
    }
}
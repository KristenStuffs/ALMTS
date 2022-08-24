package com.kristen.almts.world;

import java.util.List;

import com.kristen.almts.ALMTS;
import com.kristen.almts.world.gen.plants.LivingSpongeGeneration;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.AquaticFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.NoiseBasedCountPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModWorldEventsAlt {
    private static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ALMTS.MOD_ID);
    private static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ALMTS.MOD_ID);
    private static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registry.FEATURE_REGISTRY, ALMTS.MOD_ID);

    
    // Feature
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MY_KELP = FEATURES.register("my_kelp",
            () -> new LivingSpongeGeneration(NoneFeatureConfiguration.CODEC));

    // Configuration
    public static final RegistryObject<ConfiguredFeature<?, ?>> MY_KELP_CONFIGURED = CONFIGURED_FEATURES.register("my_kelp",
            () -> new ConfiguredFeature<>(MY_KELP.get(), NoneFeatureConfiguration.INSTANCE));
  

    // Placement    		 
    public static final RegistryObject<PlacedFeature> MY_KELP_PLACED = PLACED_FEATURES.register("my_kelp",
            () -> new PlacedFeature(MY_KELP_CONFIGURED.getHolder().get(), null)))); 
                       
            
    	    public static void register(IEventBus bus) {
    	        CONFIGURED_FEATURES.register(bus);
    	        PLACED_FEATURES.register(bus);
    	        FEATURES.register(bus);
    	        
    	    }
    	    

	@SubscribeEvent
	public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
		if (event.getCategory() == Biome.BiomeCategory.OCEAN) {
			event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, MY_KELP_PLACED.get());
		}
	}
	}
    
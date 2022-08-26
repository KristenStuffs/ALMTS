package com.kristen.almts.world;

import java.util.List;

import com.kristen.almts.ALMTS;
import com.kristen.almts.world.gen.plants.LivingSpongeGeneration;
import com.kristen.almts.world.gen.plants.RedLivingSpongeGeneration;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ALMTS.MOD_ID)
public class ModWorldEventsAlt {
    private static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registry.FEATURE_REGISTRY, ALMTS.MOD_ID);
    private static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ALMTS.MOD_ID);
    private static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ALMTS.MOD_ID);
    
    	// Feature
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> LIVING_SPONGE_GENERATION = FEATURES.register("living_sponge_generation",
            () -> new LivingSpongeGeneration(NoneFeatureConfiguration.CODEC));
    
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> RED_LIVING_SPONGE_GENERATION = FEATURES.register("red_living_sponge_generation",
            () -> new RedLivingSpongeGeneration(NoneFeatureConfiguration.CODEC));

    
    	// Configured
    public static final RegistryObject<ConfiguredFeature<?, ?>> LIVING_SPONGE_CONFIGURED = CONFIGURED_FEATURES.register("living_sponge_generation",
            () -> new ConfiguredFeature<>(LIVING_SPONGE_GENERATION.get(), NoneFeatureConfiguration.INSTANCE));
    
    public static final RegistryObject<ConfiguredFeature<?, ?>> RED_LIVING_SPONGE_CONFIGURED = CONFIGURED_FEATURES.register("red_living_sponge_generation",
            () -> new ConfiguredFeature<>(RED_LIVING_SPONGE_GENERATION.get(), NoneFeatureConfiguration.INSTANCE));

    	// Placement
    public static final RegistryObject<PlacedFeature> LIVING_SPONGE_PLACED = PLACED_FEATURES.register("living_sponge_generation",
            () -> new PlacedFeature(LIVING_SPONGE_CONFIGURED.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(196), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())))));
 
     public static final RegistryObject<PlacedFeature> RED_LIVING_SPONGE_PLACED = PLACED_FEATURES.register("red_living_sponge_generation",
            () -> new PlacedFeature(RED_LIVING_SPONGE_CONFIGURED.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(512), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())))));         
            
            @SubscribeEvent
       public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
    	   if (event.getCategory() == Biome.BiomeCategory.OCEAN) {
    		   event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, LIVING_SPONGE_PLACED.getHolder().get());
    		   }
    	   if (event.getCategory() == Biome.BiomeCategory.OCEAN) {
    		   event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, RED_LIVING_SPONGE_PLACED.getHolder().get());
    	   }
        		}

            public static void register(IEventBus bus) {
	        CONFIGURED_FEATURES.register(bus);
	        PLACED_FEATURES.register(bus);
	        FEATURES.register(bus);
	        
	    }
        }            
 
    	  
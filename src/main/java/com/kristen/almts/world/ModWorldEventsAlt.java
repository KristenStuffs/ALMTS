package com.kristen.almts.world;

import com.kristen.almts.ALMTS;
import com.kristen.almts.world.gen.plants.LivingSpongeGeneration;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModWorldEventsAlt {
    private static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ALMTS.MOD_ID);
    private static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registry.FEATURE_REGISTRY, ALMTS.MOD_ID);

    
    // Placement
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MY_KELP = FEATURES.register("my_kelp",
            () -> new LivingSpongeGeneration(NoneFeatureConfiguration.CODEC));

    // Configuration
    public static final RegistryObject<ConfiguredFeature<?, ?>> MY_KELP_CONFIGURED = CONFIGURED_FEATURES.register("my_kelp",
            () -> new ConfiguredFeature<>(MY_KELP.get(), NoneFeatureConfiguration.INSTANCE));

    

    	    public static void register(IEventBus bus) {
    	        CONFIGURED_FEATURES.register(bus);
    	        FEATURES.register(bus);
    	        
    	    }
    	}
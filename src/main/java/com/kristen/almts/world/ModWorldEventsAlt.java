package com.kristen.almts.world;

import com.kristen.almts.ALMTS;
import com.kristen.almts.world.gen.plants.LivingSpongeGeneration;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ALMTS.MOD_ID)
public class ModWorldEventsAlt<FC extends FeatureConfiguration> extends net.minecraftforge.registries.ForgeRegistryEntry<Feature<?>>
{
       public static final Feature<NoneFeatureConfiguration> LIVING_SPONGE = register("living_sponge", new LivingSpongeGeneration(NoneFeatureConfiguration.CODEC));
   
    
       @SuppressWarnings("deprecation")
       @SubscribeEvent
 private static <C extends FeatureConfiguration, F extends Feature<C>> F register(String p_65808_, F p_65809_) {
              return Registry.register(Registry.FEATURE, p_65808_, p_65809_);
}
            
}
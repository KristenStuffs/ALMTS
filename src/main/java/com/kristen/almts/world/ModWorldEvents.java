package com.kristen.almts.world;

import com.kristen.almts.ALMTS;
import com.kristen.almts.world.gen.ModBeachGeneration;
import com.kristen.almts.world.gen.ModStonyShoreGeneration;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ALMTS.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModBeachGeneration.generatePatch(event);
        ModStonyShoreGeneration.generatePatch(event);
        
    }
}

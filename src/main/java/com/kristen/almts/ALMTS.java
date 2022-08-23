package com.kristen.almts;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kristen.almts.block.ModBlocks;
import com.kristen.almts.item.ModItems;
import com.kristen.almts.world.ModWorldEventsAlt;

@Mod(ALMTS.MOD_ID)
public class ALMTS {
    public static final String MOD_ID = "almts";

    private static final Logger LOGGER = LogManager.getLogger();

    public ALMTS() {

        FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModWorldEventsAlt.register(eventBus); 

        eventBus.addListener(this::setup);
        

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);        
    }
    
	@SuppressWarnings("unused")
	private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAND_DOLLAR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLAM_SHELL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GIANT_CLAM_SHELL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARNACLES.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARNACLE_PASTE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIVING_SPONGE.get(), RenderType.translucent());   
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIVING_SPONGE_PLANT.get(), RenderType.translucent());   
    }


    private void setup(final FMLCommonSetupEvent event) {
    	
        LOGGER.info("A Lot More to Sea Initalised!");
    }
}

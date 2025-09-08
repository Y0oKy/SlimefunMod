package net.slimefun.slimefunmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.CreativeModeTabRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.slimefun.slimefunmod.item.ModItems;
import org.slf4j.Logger;

// O valor aqui deve corresponder a uma entrada no arquivo META-INF/mods.toml
@Mod(SlimeFun.MOD_ID)
public class SlimeFun
{
    // Define o ID do mod em um local comum para que tudo faça referência
    public static final String MOD_ID = "slimefun";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public SlimeFun(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Registro para eventos de servidor e outros jogos nos quais temos interesse
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);

        // Registre o item em uma guia criativa
        modEventBus.addListener(this::addCreative);
        // Registre o ForgeConfigSpec do nosso mod para que o Forge possa criar e carregar o arquivo de configuração para nós
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

  }

    // Adiciona o item de bloco de exemplo à guia de blocos de construção
    private void addCreative(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey () == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.Kelp_Cookie);
        }
    }

    // Você pode usar SubscribeEvent e deixar o Event Bus descobrir métodos para chamar
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // Você pode usar o EventBusSubscriber para registrar automaticamente todos os métodos estáticos na classe anotada com @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){

        }
    }
}

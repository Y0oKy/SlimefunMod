package net.slimefun.slimefunmod.item;

import com.mojang.brigadier.LiteralMessage;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.slimefun.slimefunmod.SlimeFun;
import net.slimefun.slimefunmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SlimeFun.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SLIMEFUN_TAB = CREATIVE_MODE_TABS.register("slimefun_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Tin_Ingot.get()))
            .title(Component.translatable("creativetab.slimefun.slimefun_tab"))
            .displayItems((itemDisplayParameters, ouput) ->{
            //Weapons

            //Items

            //Food
                ouput.accept(ModItems.Kelp_Cookie.get());
            //Basic Machines
                ouput.accept(ModBlocks.PANNING_MACHINE.get());
                ouput.accept(ModBlocks.ORE_WASHER.get());
            //Resources
                //Dust
                ouput.accept(ModItems.Aluminum_Dust.get());
                ouput.accept(ModItems.Copper_Dust.get());
                ouput.accept(ModItems.Gold_Dust.get());
                ouput.accept(ModItems.Iron_Dust.get());
                ouput.accept(ModItems.Lead_Dust.get());
                ouput.accept(ModItems.Magnesium_Dust.get());
                ouput.accept(ModItems.Silver_Dust.get());
                ouput.accept(ModItems.Tin_Dust.get());
                ouput.accept(ModItems.Zinc_Dust.get());
                //Basic Metals
                ouput.accept(ModItems.Aluminum_Ingot.get());
                ouput.accept(ModItems.Lead_Ingot.get());
                ouput.accept(ModItems.Magnesium_Ingot.get());
                ouput.accept(ModItems.Silver_Ingot.get());
                ouput.accept(ModItems.Tin_Ingot.get());
                ouput.accept(ModItems.Zinc_Ingot.get());
                //Gold Ingot (4 to 24-Carat)
                ouput.accept(ModItems.Gold_Ingot2C.get());
                ouput.accept(ModItems.Gold_Ingot4C.get());
                ouput.accept(ModItems.Gold_Ingot6C.get());
                ouput.accept(ModItems.Gold_Ingot8C.get());
                ouput.accept(ModItems.Gold_Ingot10C.get());
                ouput.accept(ModItems.Gold_Ingot12C.get());
                ouput.accept(ModItems.Gold_Ingot14C.get());
                ouput.accept(ModItems.Gold_Ingot16C.get());
                ouput.accept(ModItems.Gold_Ingot18C.get());
                ouput.accept(ModItems.Gold_Ingot20C.get());
                ouput.accept(ModItems.Gold_Ingot22C.get());
                ouput.accept(ModItems.Gold_Ingot24C.get());
            //Tools
                ouput.accept(ModItems.GOLDPAN.get());
                ouput.accept(ModItems.NETHERGOLDPAN.get());
            //Armor's

            //Magical Items

            //Magical Gadgets

            //Talismans

            //Technical Components

            //Miscellaneous Items
                ouput.accept(ModItems.SiftedOre.get());
                ouput.accept(ModItems.Stone_Chunk.get());
                //Basic Metals Block
                ouput.accept(ModBlocks.Aluminum_Block.get());
                ouput.accept(ModBlocks.Gold24_Block.get());
                ouput.accept(ModBlocks.Lead_Block.get());
                ouput.accept(ModBlocks.Magnesium_Block.get());
                ouput.accept(ModBlocks.Silver_Block.get());
                ouput.accept(ModBlocks.Tin_Block.get());
                ouput.accept(ModBlocks.Zinc_Block.get());
            //Energy & Electricity
            //GPS
            //Technical Gadgets
            //Programmable Androids
            //Cargo Management
            //Seasonal Categories

            }).build());


    public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
    }
}

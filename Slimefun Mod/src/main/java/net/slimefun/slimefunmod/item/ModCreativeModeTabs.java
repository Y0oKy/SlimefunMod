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
            //Food
                ouput.accept(ModItems.Kelp_Cookie.get());
            //Miscellaneous Items
                ouput.accept(ModItems.SiftedOre.get());
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
                //Basic Metals Block
                ouput.accept(ModBlocks.Tin_Block.get());

            }).build());


    public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
    }
}

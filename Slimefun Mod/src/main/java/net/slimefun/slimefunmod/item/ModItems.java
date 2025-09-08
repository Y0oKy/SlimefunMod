package net.slimefun.slimefunmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.slimefun.slimefunmod.SlimeFun;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlimeFun.MOD_ID);

    public static final RegistryObject<Item> Kelp_Cookie = ITEMS.register("kelp_cookie",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SiftedOre = ITEMS.register("sifted_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Aluminum_Dust = ITEMS.register("aluminum_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Copper_Dust = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Gold_Dust = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Iron_Dust = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Lead_Dust = ITEMS.register("lead_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Magnesium_Dust = ITEMS.register("magnesium_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Silver_Dust = ITEMS.register("silver_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Tin_Dust = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Zinc_Dust = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
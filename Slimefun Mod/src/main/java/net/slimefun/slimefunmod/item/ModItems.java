package net.slimefun.slimefunmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.slimefun.slimefunmod.SlimeFun;
import net.slimefun.slimefunmod.item.custom.GoldPan;
import net.slimefun.slimefunmod.item.custom.NetherGoldPan;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlimeFun.MOD_ID);
//Food
    public static final RegistryObject<Item> Kelp_Cookie = ITEMS.register("kelp_cookie",
            () -> new Item(new Item.Properties()));
//Resources
    //Dust
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
    //Basic Metals
    public static final RegistryObject<Item> Aluminum_Ingot = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Lead_Ingot = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Magnesium_Ingot = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Silver_Ingot = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Tin_Ingot = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Zinc_Ingot = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));
    //Gold Ingot (4 to 24-Carat)
    public static final RegistryObject<Item> Gold_Ingot2C = ITEMS.register("gold_ingot_2c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot4C = ITEMS.register("gold_ingot_4c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot6C = ITEMS.register("gold_ingot_6c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot8C = ITEMS.register("gold_ingot_8c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot10C = ITEMS.register("gold_ingot_10c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot12C = ITEMS.register("gold_ingot_12c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot14C = ITEMS.register("gold_ingot_14c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot16C = ITEMS.register("gold_ingot_16c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot18C = ITEMS.register("gold_ingot_18c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot20C = ITEMS.register("gold_ingot_20c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot22C = ITEMS.register("gold_ingot_22c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ingot24C = ITEMS.register("gold_ingot_24c",
            () -> new Item(new Item.Properties()));
//Tools
    public static final RegistryObject<Item> GOLDPAN = ITEMS.register("goldpan",
        () -> new GoldPan(new Item.Properties()));
    public static final RegistryObject<Item> NETHERGOLDPAN = ITEMS.register("nether_goldpan",
            () -> new NetherGoldPan(new Item.Properties()));
//Miscellaneous Items
    public static final RegistryObject<Item> SiftedOre = ITEMS.register("sifted_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Stone_Chunk = ITEMS.register("stone_chunk",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
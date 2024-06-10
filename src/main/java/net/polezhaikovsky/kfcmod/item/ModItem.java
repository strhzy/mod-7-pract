package net.polezhaikovsky.kfcmod.item;

import net.polezhaikovsky.kfcmod.*;
import net.polezhaikovsky.kfcmod.KfcMod;
import net.polezhaikovsky.kfcmod.block.ModBlock;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItem {
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, KfcMod.MOD_ID);

    public static final RegistryObject<Item> leg = ITEMS.register("leg", () -> new Item(new Item.Properties()
        .food((new FoodProperties
        .Builder()
        .nutrition(10).saturationMod(0.9f))
        .build()).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> fries = ITEMS.register("fries", () -> new Item(new Item.Properties()
        .food((new FoodProperties
        .Builder()
        .nutrition(15).saturationMod(0.9f))
        .build()).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> lipton = ITEMS.register("lipton", () -> new Item(new Item.Properties()
        .food((new FoodProperties
        .Builder()
        .nutrition(15).saturationMod(0.9f))
        .build()).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> sanders = ITEMS.register("sanders", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> bucket = 
            ITEMS.register("bucket", () -> new BlockItem(ModBlock
                    .bucket.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> doggo = 
            ITEMS.register("doggo", () -> new BlockItem(ModBlock
                    .doggo.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> friesblock = 
            ITEMS.register("friesblock", () -> new BlockItem(ModBlock
                    .friesblock.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> wingsblock = 
            ITEMS.register("wingsblock", () -> new BlockItem(ModBlock
                    .wingsblock.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

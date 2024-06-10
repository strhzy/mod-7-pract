package net.polezhaikovsky.kfcmod.block;

import net.polezhaikovsky.kfcmod.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KfcMod.MOD_ID);

    public static final RegistryObject<Block> bucket = BLOCKS.register("bucket", () ->
        new Block(BlockBehaviour.Properties.of(Material.WOOD)));

    public static final RegistryObject<Block> doggo = BLOCKS.register("doggo", () ->
        new Block(BlockBehaviour.Properties.of(Material.WOOD)));

    public static final RegistryObject<Block> friesblock = BLOCKS.register("friesblock", () ->
        new Block(BlockBehaviour.Properties.of(Material.WOOD)));

    public static final RegistryObject<Block> wingsblock = BLOCKS.register("wingsblock", () ->
        new Block(BlockBehaviour.Properties.of(Material.WOOD)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}

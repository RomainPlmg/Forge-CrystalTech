package com.rominouplmg.crystaltech.common.item;

import com.rominouplmg.crystaltech.CrystalTech;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrystalTech.MOD_ID);

    public static final RegistryObject<Item> GRAPHITE_DUST = ITEMS.register("graphite_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_CRYSTAL_TECH)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

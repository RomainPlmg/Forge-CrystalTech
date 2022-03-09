package com.rominouplmg.crystaltech.common.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_CRYSTAL_TECH = new CreativeModeTab("crystaltechtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GRAPHITE_DUST.get());
        }
    };
}

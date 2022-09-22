package com.cyvack.create_crystal_clear;

import com.cyvack.create_crystal_clear.blocks.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.world.item.CreativeModeTab;

public class CrystalClearTab {
    public static final CreativeModeTab GLASS_TAB = FabricItemGroupBuilder.create(CreateCrystalClear.asResource("create_crystal_clear")).icon(ModBlocks.COPPER_GLASS_CASING::asStack).build();

    public static CreativeModeTab register() {
        return GLASS_TAB;
    }
}

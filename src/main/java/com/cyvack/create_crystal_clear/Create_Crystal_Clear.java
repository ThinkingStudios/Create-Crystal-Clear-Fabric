package com.cyvack.create_crystal_clear;

import com.cyvack.create_crystal_clear.blocks.ModBlocks;
import com.cyvack.create_crystal_clear.tile_entities.ModtileEntities;
import com.simibubi.create.foundation.data.CreateRegistrate;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class Create_Crystal_Clear implements ModInitializer {
    public static final String MOD_ID = "create_crystal_clear";
    public static boolean isAlloyedLoaded = true;
    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID).creativeModeTab(() -> CrystalClearTab.GLASS_TAB);

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModtileEntities.register();

        CrystalClearTab.register();

        REGISTRATE.register();
    }
}

package com.cyvack.create_crystal_clear;

import com.cyvack.create_crystal_clear.blocks.ModBlocks;
import com.cyvack.create_crystal_clear.blocks.compat.AlloyedCompatBlocks;
import com.cyvack.create_crystal_clear.tile_entities.ModtileEntities;
import com.simibubi.create.foundation.data.CreateRegistrate;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class Create_Crystal_Clear implements ModInitializer {

    public static final String MOD_ID = "create_crystal_clear";
    public static boolean isAlloyedLoaded = false;
    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    @Override
    public void onInitialize() {

        if (FabricLoader.getInstance().isModLoaded("alloyed"))
            isAlloyedLoaded = true;

        ModBlocks.register();
        ModtileEntities.register();

        // compat
        if (isAlloyedLoaded) {
            AlloyedCompatBlocks.register();
        }

        REGISTRATE.register();
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }
}

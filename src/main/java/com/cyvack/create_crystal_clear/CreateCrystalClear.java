package com.cyvack.create_crystal_clear;

import com.cyvack.create_crystal_clear.blocks.ModBlocks;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateCrystalClear implements ModInitializer {
    public static final String MOD_ID = "create_crystal_clear";
    public static final Logger LOGGER = LogManager.getLogger();
    private static final NonNullSupplier<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(MOD_ID);

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE.get();
    }

    public static Boolean isAlloyedLoaded() {
        //return FabricLoader.getInstance().isModLoaded("alloyed");
        return true;
    }

    @Override
    public void onInitialize() {
        ModBlocks.getRegistrate().register();
        if (isAlloyedLoaded()) {
        }
    }
}

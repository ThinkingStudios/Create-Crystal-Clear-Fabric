package com.cyvack.create_crystal_clear;

import com.cyvack.create_crystal_clear.content.compat.blocks.AlloyedCompatBlocks;
import com.cyvack.create_crystal_clear.index.CCBlockEntities;
import com.cyvack.create_crystal_clear.index.CCBlocks;
import com.cyvack.create_crystal_clear.index.CCTab;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;



public class CrystalClear implements ModInitializer {
    public static final String ID = "create_crystal_clear";
    public static boolean isAlloyedLoaded = false;
    public static final NonNullSupplier<CreateRegistrate> REGISTRATE = NonNullSupplier.lazy(() -> CreateRegistrate.create(ID)
            .creativeModeTab(() -> CCTab.MAIN_GROUP, "Crystal Clear"));

    @Override
    public void onInitialize() {
        if (FabricLoader.getInstance().isModLoaded("alloyed")) {
            isAlloyedLoaded = true;
        }
        CCBlocks.register();
        CCBlockEntities.register();
        // compat
        //if (isAlloyedLoaded) {
        //    AlloyedCompatBlocks.register();
        //}
    }

    public CrystalClear(){

    }

    public static CreateRegistrate registrate() {
        return REGISTRATE.get();
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(ID, path);
    }
}

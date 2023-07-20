package com.cyvack.create_crystal_clear.index;

import com.cyvack.create_crystal_clear.CrystalClear;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.world.item.CreativeModeTab;

public class CCTab {
    public static CreativeModeTab MAIN_GROUP = FabricItemGroupBuilder.create(CrystalClear.asResource(CrystalClear.ID)).icon(() -> CCBlocks.GLASS_CASINGS.blockEntryMap.get("copper").asStack()).build();
}

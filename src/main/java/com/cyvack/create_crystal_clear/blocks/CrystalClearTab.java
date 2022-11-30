package com.cyvack.create_crystal_clear.blocks;

import com.cyvack.create_crystal_clear.Create_Crystal_Clear;
import com.simibubi.create.foundation.data.CreateRegistrate;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.world.item.CreativeModeTab;

public class CrystalClearTab {
	public static final CreativeModeTab GLASS_TAB = FabricItemGroupBuilder.create(Create_Crystal_Clear.asResource("create_crystal_clear")).icon(ModBlocks.COPPER_GLASS_CASING::asStack).build();
	private static final CreateRegistrate REGISTRATE = Create_Crystal_Clear.registrate().creativeModeTab(() -> GLASS_TAB, "Create: Crystal Clear");
}

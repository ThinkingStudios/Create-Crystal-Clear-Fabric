package com.cyvack.create_crystal_clear.blocks;

import com.cyvack.create_crystal_clear.CreateCrystalClear;
import com.cyvack.create_crystal_clear.CrystalClearTab;
import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;

import static com.cyvack.create_crystal_clear.data.BlockBuilders.glassCasing;
import static com.cyvack.create_crystal_clear.data.BlockBuilders.tintedGlassCasing;

public class ModBlocks {
    private static final
    CreateRegistrate REGISTRATE = CreateCrystalClear.registrate().creativeModeTab(() -> CrystalClearTab.GLASS_TAB);

    public static CreateRegistrate getRegistrate() {
        return REGISTRATE;
    }

    //Casings
    public static final BlockEntry<GlassCasing> ANDESITE_GLASS_CASING = glassCasing("andesite_glass_casing", () -> new SimpleCTBehaviour(ModSpriteShifts.ANDESITE_GLASS_CASING)),

    BRASS_GLASS_CASING = glassCasing("brass_glass_casing", () -> new SimpleCTBehaviour(ModSpriteShifts.BRASS_GLASS_CASING)),

    COPPER_GLASS_CASING = glassCasing("copper_glass_casing", () -> new SimpleCTBehaviour(ModSpriteShifts.COPPER_GLASS_CASING)),

    STEEL_GLASS_CASING = glassCasing("steel_glass_casing", () -> new SimpleCTBehaviour((ModSpriteShifts.STEEL_GLASS_CASING)));

    //Clear Casings
    public static final BlockEntry<GlassCasing>
            ANDESITE_CLEAR_GLASS_CASING = glassCasing("andesite_clear_glass_casing", () -> new SimpleCTBehaviour(ModSpriteShifts.ANDESITE_CLEAR_GLASS_CASING)),

    BRASS_CLEAR_GLASS_CASING = glassCasing("brass_clear_glass_casing", () -> new SimpleCTBehaviour(ModSpriteShifts.BRASS_CLEAR_GLASS_CASING)),

    COPPER_CLEAR_GLASS_CASING = glassCasing("copper_clear_glass_casing", () -> new SimpleCTBehaviour(ModSpriteShifts.COPPER_CLEAR_GLASS_CASING));

    public static final BlockEntry<TintedGlassCasing>
            STEEL_TINTED_GLASS_CASING = tintedGlassCasing("steel_tinted_glass_casing", () -> new SimpleCTBehaviour((ModSpriteShifts.STEEL_TINTED_GLASS_CASING)));

    public static void register() {
    }
}

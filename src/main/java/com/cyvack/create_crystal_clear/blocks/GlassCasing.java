package com.cyvack.create_crystal_clear.blocks;

import com.simibubi.create.content.palettes.ConnectedGlassBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class GlassCasing extends GlassBlock {

    public GlassCasing(Properties p_53640_) {
        super(p_53640_);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public boolean skipRendering(@NotNull BlockState state, BlockState adjacentBlockState, @NotNull Direction side) {
        return adjacentBlockState.getBlock() instanceof ConnectedGlassBlock || super.skipRendering(state, adjacentBlockState, side);
    }
}

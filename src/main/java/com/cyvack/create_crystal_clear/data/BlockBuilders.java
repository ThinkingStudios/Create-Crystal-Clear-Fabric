package com.cyvack.create_crystal_clear.data;

import com.cyvack.create_crystal_clear.CreateCrystalClear;
import com.cyvack.create_crystal_clear.blocks.ModBlocks;
import com.cyvack.create_crystal_clear.blocks.glass_casings.GlassCasing;
import com.cyvack.create_crystal_clear.blocks.glass_casings.TintedGlassCasing;
import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.block.connected.ConnectedTextureBehaviour;
import com.simibubi.create.foundation.data.*;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.core.BlockPos;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

import static com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures;

public class BlockBuilders {
    private static final CreateRegistrate REGISTRATE = CreateCrystalClear.registrate();

    private static Properties glassProperties(Properties p) {
        return p.isValidSpawn(BlockBuilders::never)
                .isRedstoneConductor(BlockBuilders::never)
                .isSuffocating(BlockBuilders::never)
                .isViewBlocking(BlockBuilders::never);
    }

    private static boolean never(BlockState p_235436_0_, BlockGetter p_235436_1_, BlockPos p_235436_2_) {
        return false;
    }

    private static Boolean never(BlockState p_235427_0_, BlockGetter p_235427_1_, BlockPos p_235427_2_,
                                 EntityType<?> p_235427_3_) {
        return false;
    }


    public static BlockEntry<GlassCasing> glassCasing(String name, Supplier<ConnectedTextureBehaviour> behaviour) {
        return ModBlocks.getRegistrate().block(name, GlassCasing::new)
                .onRegister(connectedTextures(behaviour))
                .addLayer(() -> RenderType::cutout)
                .initialProperties(() -> Blocks.GLASS)
                .properties(BlockBuilders::glassProperties)
                .loot(BlockLoot::dropWhenSilkTouch)
                .blockstate((c, p) -> BlockStateGen.cubeAll(c, p, "", c.getName()))
                .tag(AllTags.AllBlockTags.CASING.tag)
                .item()
                .tag(AllTags.AllItemTags.CASING.tag)
                .model((c, p) -> p.cubeColumn(c.getName(), p.modLoc("block/" + c.getName()), p.modLoc("block/" + c.getName())))
                .build()
                .register();
    }

    public static BlockEntry<TintedGlassCasing> tintedGlassCasing(String name, Supplier<ConnectedTextureBehaviour> behaviour) {
        return ModBlocks.getRegistrate().block(name, TintedGlassCasing::new)
                .onRegister(connectedTextures(behaviour))
                .addLayer(() -> RenderType::translucent)
                .initialProperties(() -> Blocks.TINTED_GLASS)
                .properties(BlockBuilders::glassProperties)
                .loot(BlockLoot::dropWhenSilkTouch)
                .blockstate((c, p) -> BlockStateGen.cubeAll(c, p, "", c.getName()))
                .tag(AllTags.AllBlockTags.CASING.tag)

                .item()
                .tag(AllTags.AllItemTags.CASING.tag)
                .model((c, p) -> p.cubeColumn(c.getName(), p.modLoc("block/" + c.getName()), p.modLoc("block/" + c.getName())))

                .build()
                .register();
    }
}

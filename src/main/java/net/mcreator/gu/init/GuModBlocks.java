
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gu.block.YuanshiblockBlock;
import net.mcreator.gu.block.OreyuanshiBlock;
import net.mcreator.gu.block.GrityuanshiBlock;
import net.mcreator.gu.GuMod;

public class GuModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GuMod.MODID);
	public static final RegistryObject<Block> OREYUANSHI = REGISTRY.register("oreyuanshi", () -> new OreyuanshiBlock());
	public static final RegistryObject<Block> YUANSHIBLOCK = REGISTRY.register("yuanshiblock", () -> new YuanshiblockBlock());
	public static final RegistryObject<Block> GRITYUANSHI = REGISTRY.register("grityuanshi", () -> new GrityuanshiBlock());
}

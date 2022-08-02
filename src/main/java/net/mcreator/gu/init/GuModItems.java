
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.gu.item.YuanshiItem;
import net.mcreator.gu.item.NuggetyuanshiItem;
import net.mcreator.gu.item.ItemhumanwingodguItem;
import net.mcreator.gu.item.ItemhopeguItem;
import net.mcreator.gu.GuMod;

public class GuModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GuMod.MODID);
	public static final RegistryObject<Item> ITEMHOPEGU = REGISTRY.register("itemhopegu", () -> new ItemhopeguItem());
	public static final RegistryObject<Item> HOPEGU = REGISTRY.register("hopegu_spawn_egg",
			() -> new ForgeSpawnEggItem(GuModEntities.HOPEGU, -1, -6710887, new Item.Properties().tab(GuModTabs.TAB_GU)));
	public static final RegistryObject<Item> YUANSHI = REGISTRY.register("yuanshi", () -> new YuanshiItem());
	public static final RegistryObject<Item> OREYUANSHI = block(GuModBlocks.OREYUANSHI, GuModTabs.TAB_GU);
	public static final RegistryObject<Item> ITEMHUMANWINGODGU = REGISTRY.register("itemhumanwingodgu", () -> new ItemhumanwingodguItem());
	public static final RegistryObject<Item> YUANSHIBLOCK = block(GuModBlocks.YUANSHIBLOCK, GuModTabs.TAB_GU);
	public static final RegistryObject<Item> GRITYUANSHI = block(GuModBlocks.GRITYUANSHI, GuModTabs.TAB_GU);
	public static final RegistryObject<Item> NUGGETYUANSHI = REGISTRY.register("nuggetyuanshi", () -> new NuggetyuanshiItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

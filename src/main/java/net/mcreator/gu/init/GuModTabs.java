
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gu.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GuModTabs {
	public static CreativeModeTab TAB_GU;

	public static void load() {
		TAB_GU = new CreativeModeTab("tabgu") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GuModItems.ITEMHOPEGU.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}


package net.mcreator.gu.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.gu.init.GuModTabs;

public class YuanshiItem extends Item {
	public YuanshiItem() {
		super(new Item.Properties().tab(GuModTabs.TAB_GU).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

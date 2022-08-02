
package net.mcreator.gu.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.gu.init.GuModTabs;

public class ItemhumanwingodguItem extends Item {
	public ItemhumanwingodguItem() {
		super(new Item.Properties().tab(GuModTabs.TAB_GU).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

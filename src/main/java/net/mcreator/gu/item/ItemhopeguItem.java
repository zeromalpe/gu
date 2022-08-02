
package net.mcreator.gu.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.gu.procedures.ItemhopeguDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure;
import net.mcreator.gu.init.GuModTabs;

public class ItemhopeguItem extends Item {
	public ItemhopeguItem() {
		super(new Item.Properties().tab(GuModTabs.TAB_GU).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		ItemhopeguDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure.execute(context.getLevel(), context.getClickedPos().getX(),
				context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}

package net.mcreator.gu.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class ItemhopeguDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		(itemstack).shrink(1);
		if (entity instanceof Player _player)
			_player.giveExperienceLevels(5);
	}
}

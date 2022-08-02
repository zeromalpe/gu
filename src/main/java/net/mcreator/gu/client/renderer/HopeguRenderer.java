
package net.mcreator.gu.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.gu.entity.HopeguEntity;
import net.mcreator.gu.client.model.Modelcustom_model;

public class HopeguRenderer extends MobRenderer<HopeguEntity, Modelcustom_model<HopeguEntity>> {
	public HopeguRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<HopeguEntity, Modelcustom_model<HopeguEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("gu:textures/texture_xiwanggu.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HopeguEntity entity) {
		return new ResourceLocation("gu:textures/texture_xiwanggu.png");
	}
}

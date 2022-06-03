package net.hadron_studios.magnificentmountains.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.hadron_studios.magnificentmountains.MagnificentMountainsMod;
import net.hadron_studios.magnificentmountains.entity.modlivingentity.SnowLeopard;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SnowLeopardRenderer extends GeoEntityRenderer<SnowLeopard> {
    public SnowLeopardRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SnowLeopardModel());
        this.shadowRadius = 1.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SnowLeopard instance) {
        return new ResourceLocation(MagnificentMountainsMod.MOD_ID, "textures/entity/snow_leopard/snow_leopard.png");
    }

    @Override
    public RenderType getRenderType(SnowLeopard animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer,
                                    VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}


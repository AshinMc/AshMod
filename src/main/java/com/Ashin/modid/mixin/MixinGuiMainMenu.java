package com.Ashin.modid.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.realms.RealmsBridge;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Mixin(GuiMainMenu.class)
public class MixinGuiMainMenu extends GuiScreen {



    @Inject(method = "initGui", at = @At("TAIL"))
    private void injected(CallbackInfo ci) {
        this.buttonList.remove(6);
        this.buttonList.remove(5);
        this.buttonList.remove(5);

    }
    /**
     * @author Ashin
     */
    @Overwrite
    private void addSingleplayerMultiplayerButtons(int p_addSingleplayerMultiplayerButtons_1_, int p_addSingleplayerMultiplayerButtons_2_) {
        // Your custom implementation to replace the entire addSingleplayerMultiplayerButtons method
        // Add your own code here


        int j = this.height / 4 + 48;

        this.buttonList.add(new GuiButton(1, this.width / 8, p_addSingleplayerMultiplayerButtons_1_,this.width /4 , this.height/12, I18n.format("menu.singleplayer", new Object[0])));
        this.buttonList.add(new GuiButton(2, this.width / 8, p_addSingleplayerMultiplayerButtons_1_ + ((this.height/12)+3) * 1,this.width / 4  , this.height/12, I18n.format("menu.multiplayer", new Object[0])));
        this.buttonList.add(new GuiButton(6, this.width / 8, (p_addSingleplayerMultiplayerButtons_1_ + ((this.height/12)+3) * 2 ), this.width /4 , this.height/12, I18n.format("fml.menu.mods", new Object[0])));
        this.buttonList.add(new GuiButton(0, this.width / 8,  (p_addSingleplayerMultiplayerButtons_1_ + ((this.height/12)+3)  * 3) , this.width /4 , this.height/12, I18n.format("menu.options", new Object[0])));
        this.buttonList.add(new GuiButton(4, this.width / 2 + 150, this.height/4 - 48, 20, 20, "X"));

    }
    /**
     *
     * @author Ashin
     */
    @Overwrite
    private void drawPanorama(int p_73970_1_, int p_73970_2_, float p_73970_3_)
    {
    }

}


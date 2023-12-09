package com.Ashin.modid.mixin;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.resources.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.client.gui.GuiScreen;

@Mixin(GuiMainMenu.class)
public class MixinGuiMainMenu extends GuiScreen {

    /**
     * @ashinmc
     */
    @Overwrite
    private void addSingleplayerMultiplayerButtons(int p_addSingleplayerMultiplayerButtons_1_, int p_addSingleplayerMultiplayerButtons_2_) {
        // Your custom implementation to replace the entire addSingleplayerMultiplayerButtons method
        // Add your own code here
        this.buttonList.add(new GuiButton(1, this.width / 2 - 50, p_addSingleplayerMultiplayerButtons_1_, I18n.format("menu.singleplayer", new Object[0])));
        this.buttonList.add(new GuiButton(2, this.width / 2 - 100, p_addSingleplayerMultiplayerButtons_1_ + p_addSingleplayerMultiplayerButtons_2_ * 1, I18n.format("menu.multiplayer", new Object[0])));
        this.buttonList.add(new GuiButton(6, this.width / 2 - 100, p_addSingleplayerMultiplayerButtons_1_ + p_addSingleplayerMultiplayerButtons_2_ * 2, 98, 20, I18n.format("fml.menu.mods", new Object[0])));
    }
}

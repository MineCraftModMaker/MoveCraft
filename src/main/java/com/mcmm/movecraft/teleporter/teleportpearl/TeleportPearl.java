package com.mcmm.movecraft.teleporter.teleportpearl;

import com.mcmm.movecraft.MoveCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Ewald on 02.06.2017.
 */
public class TeleportPearl extends Item{
    public TeleportPearl() {
        final int MAX_NUMBER_OF_TeleportPearl = 12;
        this.setMaxStackSize(MAX_NUMBER_OF_TeleportPearl);
        this.setCreativeTab(MoveCraft.creativeTab);
    }
}

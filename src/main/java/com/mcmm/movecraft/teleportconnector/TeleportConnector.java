package com.mcmm.movecraft.teleportconnector;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Marco on 07.04.2017.
 */
public class TeleportConnector extends Item {
    public TeleportConnector() {
        final int MAX_NUMBER_OF_CONNECTOR = 1;
        this.setMaxStackSize(MAX_NUMBER_OF_CONNECTOR);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}

package com.mcmm.movecraft.teleportconnector;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

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

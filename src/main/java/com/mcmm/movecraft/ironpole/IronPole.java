package com.mcmm.movecraft.ironpole;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Marco on 03.04.2017.
 */
public class IronPole extends Item{
    public IronPole() {
        final int MAX_NUMBER_OF_IRONPOLE = 64;
        this.setMaxStackSize(MAX_NUMBER_OF_IRONPOLE);
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }
}

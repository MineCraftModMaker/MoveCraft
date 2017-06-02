package com.mcmm.movecraft.movecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Ewald on 02.06.2017.
 */
public class MoveCraftTap extends CreativeTabs {


    public MoveCraftTap() {
        super("MoveCraft");
    }

    @Override
    public Item getTabIconItem() {
        return Items.ENDER_PEARL;
    }
}

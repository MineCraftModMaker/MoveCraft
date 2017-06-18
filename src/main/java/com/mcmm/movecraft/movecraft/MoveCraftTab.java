package com.mcmm.movecraft.movecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Ewald on 02.06.2017.
 */
public class MoveCraftTab extends CreativeTabs {

    /**
     * Übergibt den Name des CreativTabs
     */
    public MoveCraftTab() {
        super("MoveCraft");
    }

    /**
     * Returnt das Icon des Tabs
     * @return
     */
    @Override
    public Item getTabIconItem() {
        return com.mcmm.movecraft.teleporter.teleportpearl.StartupCommon.teleportPearl;
    }
}

package com.mcmm.movecraft.ironpole;

import com.mcmm.movecraft.MoveCraft;
import net.minecraft.item.Item;

/**
 * Created by Marco on 03.04.2017.
 *
 * Ist ein Crafting Item
 */


public class IronPole extends Item{

    /**
     * Hier werden die maximale Anzahl eingestellt die ein spieler in der Hand halten kann.
     * Weiter wird das Item zum Creativtab hinzugefügt
     */
    public IronPole() {
        final int MAX_NUMBER_OF_IRONPOLE = 16;
        this.setMaxStackSize(MAX_NUMBER_OF_IRONPOLE);
        this.setCreativeTab(MoveCraft.creativeTab);
    }
}

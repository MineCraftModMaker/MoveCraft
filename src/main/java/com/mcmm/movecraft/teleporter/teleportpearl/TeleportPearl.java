package com.mcmm.movecraft.teleporter.teleportpearl;

import com.mcmm.movecraft.MoveCraft;
import net.minecraft.item.Item;

/**
 * Created by Ewald on 02.06.2017.
 */
public class TeleportPearl extends Item{
    /**
     * Die maximal zulässige Anzahl an Items auf einen Stack wird beschränkt von 64 auf 12
     */
    public TeleportPearl() {
        final int MAX_NUMBER_OF_TeleportPearl = 12;
        this.setMaxStackSize(MAX_NUMBER_OF_TeleportPearl);
        this.setCreativeTab(MoveCraft.creativeTab);
    }
}

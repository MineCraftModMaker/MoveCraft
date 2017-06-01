package com.mcmm.movecraft.teleporter.teleportend;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Ewald on 27.03.2017.
 */
public class StartupClientOnly {

    public static void preInitClientOnly()
    {
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("movecraft:teleportend", "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(com.mcmm.movecraft.teleporter.teleportend.StartupCommon.itemTeleportEnd, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);

    }

    public static void initClientOnly()
    {
    }

    public static void postInitClientOnly()
    {
    }
}

package com.mcmm.movecraft.teleporter.teleportstart;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Ewald on 27.03.2017.
 */
public class StartupClientOnly {


    /**
     * Die Methode gibt an wo sich das Model befindet.
     */
    public static void preInitClientOnly()
    {
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("movecraft:teleportstart", "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(StartupCommon.itemTeleportStart, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);

    }

    public static void initClientOnly()
    {
    }

    public static void postInitClientOnly()
    {
    }
}

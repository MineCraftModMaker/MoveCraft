package com.mcmm.movecraft.Street.lightstreet;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Marco on 20.03.2017.
 */
public class StartupClientOnly {

    /**
     * Die Methode gibt an wo sich das Model befindet.
     */
    public static void preInitClientOnly()
    {
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("movecraft:lightstreet", "inventory");
        System.out.println("ItemLocation >> " + itemModelResourceLocation.toString());
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(StartupCommon.itemLightStreet, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
    }

    public static void initClientOnly()
    {
    }

    public static void postInitClientOnly()
    {
    }
}

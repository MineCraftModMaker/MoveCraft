package com.mcmm.blocks.lightstreet;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Marco on 20.03.2017.
 */
public class StartupClientOnly {
    public static void preInitClientOnly()
    {
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("movecraft:lightstreet", "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(StartupCommon.itemLightStreet, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
    }

    public static void initClientOnly()
    {
        System.out.println("was geht no net? Die texturen hinzuzufügen zu den blöcken bzw die models" +
                "Is des im 1.10 mit dem json? Jap" +
                "Fuck xD" +
                "I schaus ma schnell an warte");
    }

    public static void postInitClientOnly()
    {
    }
}

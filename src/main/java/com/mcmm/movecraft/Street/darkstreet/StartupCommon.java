package com.mcmm.movecraft.Street.darkstreet;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marco on 20.03.2017.
 */
public class StartupCommon {

    public static DarkStreet darkStreet;
    public static ItemBlock itemDarkStreet;


    /**
     * Setzt die Namen
     *    unlocalized: Mehrere Dinge können den gleichen haben
     *    registry:    Muss eindeutig sein
     *
     * Registriert sowohl den Block als auch das Item
     */
    public static void preInitCommon()
    {
        darkStreet = (DarkStreet) (new DarkStreet().setUnlocalizedName("street_dark"));
        darkStreet.setRegistryName("darkstreet");
        GameRegistry.register(darkStreet);

        itemDarkStreet = new ItemBlock(darkStreet);
        itemDarkStreet.setRegistryName(darkStreet.getRegistryName());
        GameRegistry.register(itemDarkStreet);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

package com.mcmm.movecraft.ironpole;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marco on 20.03.2017.
 */
public class StartupCommon {

    public static IronPole ironPole;

    /**
     * Setzt die Namen
     *    unlocalized: Mehrere Dinge können den gleichen haben
     *    registry:    Muss eindeutig sein
     *
     * Registriert das Item
     */
    public static void preInitCommon()
    {
        ironPole = (IronPole)(new IronPole().setUnlocalizedName("ironpole"));
        ironPole.setRegistryName("iron_pole");
        GameRegistry.register(ironPole);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

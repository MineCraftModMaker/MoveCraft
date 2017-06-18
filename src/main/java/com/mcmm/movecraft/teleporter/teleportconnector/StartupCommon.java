package com.mcmm.movecraft.teleporter.teleportconnector;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ewald on 04.05.2017.
 */
public class StartupCommon {

    public static TeleportConnector teleportConnector;


    /**
     * Setzt die Namen
     *    unlocalized: Mehrere Dinge können den gleichen haben
     *    registry:    Muss eindeutig sein
     *
     * Registriert das Item
     */
    public static void preInitCommon()
    {
        teleportConnector = (TeleportConnector)(new TeleportConnector().setUnlocalizedName("teleportconnector"));
        teleportConnector.setRegistryName("teleport_connector");
        GameRegistry.register(teleportConnector);


    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

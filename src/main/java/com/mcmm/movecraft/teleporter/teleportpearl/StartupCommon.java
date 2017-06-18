package com.mcmm.movecraft.teleporter.teleportpearl;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ewald on 02.06.2017.
 */
public class StartupCommon {

    public static TeleportPearl teleportPearl;

    /**
     * Setzt die Namen
     *    unlocalized: Mehrere Dinge können den gleichen haben
     *    registry:    Muss eindeutig sein
     *
     * Registriert das Item
     */
    public static void preInitCommon()
    {
        teleportPearl = (TeleportPearl)(new TeleportPearl().setUnlocalizedName("teleportpearl"));
        teleportPearl.setRegistryName("teleport_pearl");
        GameRegistry.register(teleportPearl);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

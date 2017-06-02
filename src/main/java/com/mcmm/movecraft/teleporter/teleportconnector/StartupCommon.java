package com.mcmm.movecraft.teleporter.teleportconnector;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ewald on 04.05.2017.
 */
public class StartupCommon {

    public static TeleportConnector teleportConnector;

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

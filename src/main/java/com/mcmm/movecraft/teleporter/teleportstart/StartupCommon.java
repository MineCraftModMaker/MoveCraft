package com.mcmm.movecraft.teleporter.teleportstart;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ewald on 27.03.2017.
 */
public class StartupCommon {

    public static TeleportStart startteleport;
    public static ItemBlock itemTeleportStart;

    /**
     * Setzt die Namen
     *    unlocalized: Mehrere Dinge können den gleichen haben
     *    registry:    Muss eindeutig sein
     *
     * Registriert sowohl den Block als auch das Item
     */
    public static void preInitCommon()
    {
        startteleport = (TeleportStart) (new TeleportStart().setUnlocalizedName("start_teleport"));
        startteleport.setRegistryName("teleportstart");
        GameRegistry.register(startteleport);

        itemTeleportStart = new ItemBlock(startteleport);
        itemTeleportStart.setRegistryName(startteleport.getRegistryName());
        GameRegistry.register(itemTeleportStart);

    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

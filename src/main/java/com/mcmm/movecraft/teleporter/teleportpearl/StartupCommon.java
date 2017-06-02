package com.mcmm.movecraft.teleporter.teleportpearl;

import com.mcmm.movecraft.ironpole.IronPole;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ewald on 02.06.2017.
 */
public class StartupCommon {

    public static TeleportPearl teleportPearl;

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

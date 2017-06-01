package com.mcmm.movecraft.teleporter.teleportend;


import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ewald on 27.03.2017.
 */
public class StartupCommon {

    public static TeleportEnd teleportEnd;
    public static ItemBlock itemTeleportEnd;

    public static void preInitCommon()
    {
        teleportEnd = (TeleportEnd) (new TeleportEnd().setUnlocalizedName("end_teleport"));
        teleportEnd.setRegistryName("teleportend");
        GameRegistry.register(teleportEnd);

        itemTeleportEnd = new ItemBlock(teleportEnd);
        itemTeleportEnd.setRegistryName(teleportEnd.getRegistryName());
        GameRegistry.register(itemTeleportEnd);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

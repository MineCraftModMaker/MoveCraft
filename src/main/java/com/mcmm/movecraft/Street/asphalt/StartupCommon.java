package com.mcmm.movecraft.Street.asphalt;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ewald on 18.06.2017.
 */
public class StartupCommon {

    public static Asphalt asphalt;
    public static ItemBlock itemAsphalt;


    /**
     * Setzt die Namen
     *    unlocalized: Mehrere Dinge können den gleichen haben
     *    registry:    Muss eindeutig sein
     *
     * Registriert sowohl den Block als auch das Item
     */
    public static void preInitCommon()
    {
        asphalt = (Asphalt) (new Asphalt().setUnlocalizedName("asphalt_unlocalized"));
        asphalt.setRegistryName("asphalt");
        GameRegistry.register(asphalt);

        itemAsphalt = new ItemBlock(asphalt);
        itemAsphalt.setRegistryName(asphalt.getRegistryName());
        GameRegistry.register(itemAsphalt);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

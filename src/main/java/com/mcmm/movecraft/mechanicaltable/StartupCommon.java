package com.mcmm.movecraft.mechanicaltable;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marco on 20.03.2017.
 */
public class StartupCommon {

    public static MechanicalTable mechanicalTable;
    public static ItemBlock itemMechanicalTable;

    /**
     * Setzt die Namen
     *    unlocalized: Mehrere Dinge können den gleichen haben
     *    registry:    Muss eindeutig sein
     *
     * Registriert sowohl den Block als auch das Item
     */
    public static void preInitCommon()
    {
        mechanicalTable = (MechanicalTable) (new MechanicalTable().setUnlocalizedName("mechanicaltable"));
        mechanicalTable.setRegistryName("mechanicaltable");
        GameRegistry.register(mechanicalTable);

        itemMechanicalTable = new ItemBlock(mechanicalTable);
        itemMechanicalTable.setRegistryName(mechanicalTable.getRegistryName());
        GameRegistry.register(itemMechanicalTable);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

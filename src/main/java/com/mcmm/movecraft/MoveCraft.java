package com.mcmm.movecraft;


import com.mcmm.movecraft.movecraft.MoveCraftTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Marco on 17.03.2017.
 */
@Mod(modid = MoveCraft.MODID, version = MoveCraft.VERSION)
public class MoveCraft {
    public static final String MODID = "movecraft";
    public static final String VERSION = "0.1";
    public static final MoveCraftTab creativeTab = new MoveCraftTab();

    @SidedProxy(clientSide="com.mcmm.movecraft.ClientOnlyProxy", serverSide="com.mcmm.movecraft.DedicatedServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }


    public static String prependModID(String name) {return MODID + ":" + name;}
}

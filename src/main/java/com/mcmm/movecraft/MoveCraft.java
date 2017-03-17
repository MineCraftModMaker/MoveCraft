package com.mcmm.movecraft;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * Created by Marco on 17.03.2017.
 */
@Mod(modid = MoveCraft.MODID, version = MoveCraft.VERSION)
public class MoveCraft {
    public static final String MODID = "movecraft";
    public static final String VERSION = "0.1";


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+ Blocks.DIRT.getUnlocalizedName());
    }
}

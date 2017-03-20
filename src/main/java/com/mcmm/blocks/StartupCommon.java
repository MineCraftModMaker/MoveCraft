package com.mcmm.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marco on 20.03.2017.
 */
public class StartupCommon {

    public static Greenstone greenstone;
    public static ItemBlock itemGreenstone;

    public static void preInitCommon()
    {
        greenstone = (Greenstone) (new Greenstone().setUnlocalizedName("stone_greenstone"));
        greenstone.setRegistryName("greenstone");
        GameRegistry.register(greenstone);

        itemGreenstone = new ItemBlock(greenstone);
        itemGreenstone.setRegistryName(greenstone.getRegistryName());
        GameRegistry.register(itemGreenstone);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

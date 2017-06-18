package com.mcmm.movecraft.Street.lightstreet;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marco on 20.03.2017.
 */
public class StartupCommon {

    public static LightStreet lightStreet;
    public static ItemBlock itemLightStreet;

    public static void preInitCommon()
    {
        lightStreet = (LightStreet) (new LightStreet().setUnlocalizedName("street_light"));
        lightStreet.setRegistryName("lightstreet");
        GameRegistry.register(lightStreet);

        itemLightStreet = new ItemBlock(lightStreet);
        itemLightStreet.setRegistryName(lightStreet.getRegistryName());
        GameRegistry.register(itemLightStreet);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}

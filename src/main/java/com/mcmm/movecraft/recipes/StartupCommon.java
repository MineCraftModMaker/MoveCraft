package com.mcmm.movecraft.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marco on 21.03.2017.
 */
public class StartupCommon {
    public static void preInit() {
    }

    public static void init() {
        // Mechanical Table
        final int BLUE_DYE_DAMAGE_VALUE = EnumDyeColor.BLUE.getDyeDamage();
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.mechanicaltable.StartupCommon.itemMechanicalTable), new Object[]{
            "...",
            "ICI",
            "LIL",
                'I', Items.IRON_INGOT,
                'C', Blocks.CRAFTING_TABLE,
                'L', new ItemStack(Items.DYE, 1, BLUE_DYE_DAMAGE_VALUE)});


        // DarkStreet
        final int BLACK_DYE_DAMAGE_VALUE = EnumDyeColor.BLACK.getDyeDamage();
        GameRegistry.addShapelessRecipe(new ItemStack(com.mcmm.movecraft.darkstreet.StartupCommon.itemDarkStreet, 2), new Object[]{
                Blocks.COBBLESTONE,
                Blocks.GRAVEL,
                new ItemStack(Items.DYE, 1, BLACK_DYE_DAMAGE_VALUE)
        });

        // LightStreet
        final int WHITE_DYE_DAMAGE_VALUE = EnumDyeColor.WHITE.getDyeDamage();
        GameRegistry.addShapelessRecipe(new ItemStack(com.mcmm.movecraft.lightstreet.StartupCommon.itemLightStreet, 2), new Object[]{
                Blocks.COBBLESTONE,
                Blocks.GRAVEL,
                new ItemStack(Items.DYE, 1, WHITE_DYE_DAMAGE_VALUE)
        });

    }

    public static void postInit() {

    }
}

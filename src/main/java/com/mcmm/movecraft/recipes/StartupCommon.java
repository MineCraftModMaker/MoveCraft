package com.mcmm.movecraft.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marco on 21.03.2017.
 *
 * Enthält alle Crafting Rezepte
 */
public class StartupCommon {
    public static void preInit() {
    }

    /**
     * Crafting-Recipes
     */
    public static void init() {

        final int RED_DYE_DAMAGE_VALUE = EnumDyeColor.RED.getDyeDamage();
        final int BLUE_DYE_DAMAGE_VALUE = EnumDyeColor.BLUE.getDyeDamage();
        final int WHITE_DYE_DAMAGE_VALUE = EnumDyeColor.WHITE.getDyeDamage();

        // Mechanical Table
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.mechanicaltable.StartupCommon.itemMechanicalTable), new Object[]{
                "...",
                "ICI",
                "LIL",
                'I', Items.IRON_INGOT,
                'C', Blocks.CRAFTING_TABLE,
                'L', new ItemStack(Items.DYE, 1, BLUE_DYE_DAMAGE_VALUE)});


        // DarkStreet
        GameRegistry.addShapelessRecipe(new ItemStack(com.mcmm.movecraft.Street.darkstreet.StartupCommon.itemDarkStreet, 2), new Object[]{
                Blocks.COBBLESTONE,
                Blocks.GRAVEL,
                com.mcmm.movecraft.Street.asphalt.StartupCommon.asphalt
        });

        // LightStreet
        GameRegistry.addShapelessRecipe(new ItemStack(com.mcmm.movecraft.Street.lightstreet.StartupCommon.itemLightStreet, 1), new Object[]{
                com.mcmm.movecraft.Street.darkstreet.StartupCommon.darkStreet,
                new ItemStack(Items.DYE, 1, WHITE_DYE_DAMAGE_VALUE)
        });

        // Asphalt
        GameRegistry.addShapelessRecipe(new ItemStack(com.mcmm.movecraft.Street.asphalt.StartupCommon.itemAsphalt, 1), new Object[]{
                Items.WATER_BUCKET,
                Blocks.GRAVEL
        });

        //IronPole
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.ironpole.StartupCommon.ironPole), new Object[]{
                "..I",
                ".B.",
                "I..",
                'I', Items.IRON_INGOT,
                'B', Items.BLAZE_ROD
        });

        // TeleportConnector
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.teleporter.teleportconnector.StartupCommon.teleportConnector), new Object[]{
                ".LI",
                "OER",
                "TO.",
                'L', new ItemStack(Items.DYE, 1, BLUE_DYE_DAMAGE_VALUE),
                'I', com.mcmm.movecraft.ironpole.StartupCommon.ironPole,
                'O', Blocks.OBSIDIAN,
                'E', Items.EMERALD,
                'R', new ItemStack(Items.DYE, 1, RED_DYE_DAMAGE_VALUE),
                'T', com.mcmm.movecraft.teleporter.teleportpearl.StartupCommon.teleportPearl
        });

        // TeleportStart
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.teleporter.teleportstart.StartupCommon.startteleport), new Object[]{
                "IRI",
                "RER",
                "IRI",
                'R', new ItemStack(Items.DYE, 1, RED_DYE_DAMAGE_VALUE),
                'I', Items.IRON_INGOT,
                'E', Items.ENDER_PEARL
        });

        // TeleportEnd
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.teleporter.teleportend.StartupCommon.teleportEnd), new Object[]{
                "ILI",
                "LEL",
                "ILI",
                'L', new ItemStack(Items.DYE, 1, BLUE_DYE_DAMAGE_VALUE),
                'I', Items.IRON_INGOT,
                'E', Items.ENDER_PEARL
        });

        //TelepoertPearl
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.teleporter.teleportpearl.StartupCommon.teleportPearl), new Object[]{
                "DDD",
                "DED",
                "DDD",
                'D', Items.DIAMOND,
                'E', Items.ENDER_PEARL
        });


    }

    public static void postInit() {

    }
}

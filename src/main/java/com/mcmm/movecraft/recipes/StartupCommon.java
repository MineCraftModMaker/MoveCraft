package com.mcmm.movecraft.recipes;

import com.mcmm.movecraft.MoveCraft;
import com.mcmm.movecraft.teleporter.teleportpearl.TeleportPearl;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
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

        //IronPole
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.ironpole.StartupCommon.ironPole), new Object[]{
                "..I",
                ".I.",
                "I..",
                'I', Items.IRON_INGOT
        });

        // TeleportConnector
        final int RED_DYE_DAMAGE_VALUE = EnumDyeColor.RED.getDyeDamage();
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.teleporter.teleportconnector.StartupCommon.teleportConnector), new Object[]{
                ".L.",
                "OER",
                "TO.",
                'L', new ItemStack(Items.DYE, 1, BLUE_DYE_DAMAGE_VALUE),
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

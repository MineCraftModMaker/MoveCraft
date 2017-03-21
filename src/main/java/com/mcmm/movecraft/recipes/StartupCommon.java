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
        final int BLUE_DYE_DAMAGE_VALUE = EnumDyeColor.BLUE.getDyeDamage();
        GameRegistry.addRecipe(new ItemStack(com.mcmm.movecraft.mechanicaltable.StartupCommon.itemMechanicalTable), new Object[]{
            "...",
            "ICI",
            "LIL",
                'I', Items.IRON_INGOT,
                'C', Blocks.CRAFTING_TABLE,
                'L', new ItemStack(Items.DYE, 1, BLUE_DYE_DAMAGE_VALUE)});
    }

    public static void postInit() {

    }
}

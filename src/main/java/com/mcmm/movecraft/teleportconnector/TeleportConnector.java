package com.mcmm.movecraft.teleportconnector;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by Marco on 07.04.2017.
 */
public class TeleportConnector extends Item {
    public TeleportConnector() {
        final int MAX_NUMBER_OF_CONNECTOR = 1;
        this.setMaxStackSize(MAX_NUMBER_OF_CONNECTOR);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
        System.out.println("RIGHTCLICK >> " + playerIn.toString());
        //playerIn.setPosition(playerIn.getPosition().getX() + (10 * playerIn.getHorizontalFacing().getDirectionVec().getX())
        //        , playerIn.getPosition().getY()
        //        , playerIn.getPosition().getZ() + (10 * playerIn.getHorizontalFacing().getDirectionVec().getZ()));

        playerIn.setPosition(playerIn.getPosition().getX() + (10 * playerIn.getLookVec().xCoord)
                , playerIn.getPosition().getY() + (10 * playerIn.getLookVec().yCoord)
                , playerIn.getPosition().getZ() + (10 * playerIn.getLookVec().zCoord));
        System.out.println("RIGHTCLICK FACING >> " + playerIn.getLookVec().xCoord);

        return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
    }

}

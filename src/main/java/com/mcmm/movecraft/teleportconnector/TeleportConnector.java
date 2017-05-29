package com.mcmm.movecraft.teleportconnector;

import com.mcmm.movecraft.teleportend.TeleportEnd;
import com.mcmm.movecraft.teleportstart.TeleportStart;
import com.sun.xml.internal.bind.v2.TODO;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

/**
 * Created by Marco on 07.04.2017.
 */
public class TeleportConnector extends Item {

    private static Block lastBlock = null;

    public TeleportConnector() {
        final int MAX_NUMBER_OF_CONNECTOR = 1;
        this.setMaxStackSize(MAX_NUMBER_OF_CONNECTOR);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {

        RayTraceResult rtr = playerIn.rayTrace(200, 1.0f);
        if (rtr != null) {
            EnumFacing facing = rtr.sideHit;
            Block blockLookingAt = worldIn.getBlockState(rtr.getBlockPos()).getBlock();
            System.out.println("Unloc" + blockLookingAt.getUnlocalizedName());
            Block clickedBlock = Block.getBlockFromName(blockLookingAt.getUnlocalizedName());
            BlockPos pos = rtr.getBlockPos();
            int CBX = pos.getX();
            int CBY = pos.getY();
            int CBZ = pos.getZ();
            System.out.println(CBX + " " + CBY + " " + CBZ);
            if (lastBlock == null) {
                System.out.println("click on Block");
                lastBlock = clickedBlock;
            } else if (!lastBlock.equals(clickedBlock)
                    && lastBlock instanceof TeleportStart
                    && clickedBlock instanceof TeleportEnd) {
                System.out.println("hallo");
                TeleportStart ts = (TeleportStart) lastBlock;
                ts.setEndX(CBX);
                ts.setEndY(CBY);
                ts.setEndZ(CBZ);
                System.out.println("CBX " + ts.getEndX() + "CBY " + ts.getEndY() + "CBZ " + ts.getEndZ());
            }
        }

        //    playerIn.setPosition(playerIn.getPosition().getX() + (10 * playerIn.getLookVec().xCoord)
        //            , playerIn.getPosition().getY() + (10 * playerIn.getLookVec().yCoord)
        //            , playerIn.getPosition().getZ() + (10 * playerIn.getLookVec().zCoord));
        //    System.out.println("RIGHTCLICK FACING >> " + playerIn.getLookVec().xCoord);

        return super.

                onItemRightClick(itemStackIn, worldIn, playerIn, hand);
    }


}

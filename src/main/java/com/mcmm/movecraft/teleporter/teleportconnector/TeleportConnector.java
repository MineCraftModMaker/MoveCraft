package com.mcmm.movecraft.teleporter.teleportconnector;

import com.mcmm.movecraft.MoveCraft;
import com.mcmm.movecraft.teleporter.PortConnection;
import com.mcmm.movecraft.teleporter.teleportend.TeleportEnd;
import com.mcmm.movecraft.teleporter.teleportstart.TeleportStart;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

/**
 * Created by Marco on 07.04.2017.
 */
public class TeleportConnector extends Item {

    private Block startBlock = null;
    private double startX;
    private double startY;
    private double startZ;

    public TeleportConnector() {
        final int MAX_NUMBER_OF_CONNECTOR = 1;
        this.setMaxStackSize(MAX_NUMBER_OF_CONNECTOR);
        this.setCreativeTab(MoveCraft.creativeTab);
    }

//    @Override
//    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
//
//        RayTraceResult rtr = playerIn.rayTrace(200, 1.0f);
//        if (rtr != null) {
//            EnumFacing facing = rtr.sideHit;
//            Block blockLookingAt = worldIn.getBlockState(rtr.getBlockPos()).getBlock();
//            System.out.println("Unloc" + blockLookingAt.getUnlocalizedName());
//            Block clickedBlock = Block.getBlockFromName(blockLookingAt.getUnlocalizedName());
//            BlockPos pos = rtr.getBlockPos();
//            int CBX = pos.getX();
//            int CBY = pos.getY();
//            int CBZ = pos.getZ();
//            System.out.println(CBX + " " + CBY + " " + CBZ);
//            if (lastBlock == null) {
//                lastBlock = clickedBlock;
//            } else if (!lastBlock.equals(clickedBlock)
//                    && lastBlock instanceof TeleportStart
//                    && clickedBlock instanceof TeleportEnd) {
//                TeleportStart ts = (TeleportStart) lastBlock;
//                ts.setEndX(CBX);
//                ts.setEndY(CBY);
//                ts.setEndZ(CBZ);
//            }
//            playerIn.addChatMessage(new TextComponentBase() {
//                @Override
//                public String getUnformattedComponentText() {
//                    return "Hiii";
//                }
//
//                @Override
//                public ITextComponent createCopy() {
//                    return null;
//                }
//            });
//        }
//
//        //    playerIn.setPosition(playerIn.getPosition().getX() + (10 * playerIn.getLookVec().xCoord)
//        //            , playerIn.getPosition().getY() + (10 * playerIn.getLookVec().yCoord)
//        //            , playerIn.getPosition().getZ() + (10 * playerIn.getLookVec().zCoord));
//        //    System.out.println("RIGHTCLICK FACING >> " + playerIn.getLookVec().xCoord);
//
//        return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
//    }


    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote)
        {
            return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
        }
        Block block = worldIn.getBlockState(pos).getBlock();

        if(block instanceof TeleportStart)
        {

            startBlock = block;
            startX = pos.getX();
            startY = pos.getY();
            startZ = pos.getZ();
            playerIn.addChatMessage(new TextComponentString("Start at: X(" + pos.getX() + ") Y(" + pos.getY() + ") Z(" + pos.getZ() + ")"));
        }
        if(block instanceof TeleportEnd)
        {
            playerIn.addChatMessage(new TextComponentString("End at: X(" + pos.getX() + ") Y(" + pos.getY() + ") Z(" + pos.getZ() + ")"));
            if(startBlock!= null)
            {
                playerIn.addChatMessage(new TextComponentString("Connection Complete"));
                //playerIn.setPosition(pos.getX() + 0.5, pos.getY() + 0.07, pos.getZ() + 0.5);
                TeleportStart startTele = (TeleportStart)startBlock;
                //startTele.setEndX(pos.getX() + 0.5);
                //startTele.setEndY(pos.getY() + 0.07);
                //startTele.setEndZ(pos.getZ() + 0.5);
                PortConnection pc = new PortConnection(startX, startY, startZ, pos.getX() + 0.5, pos.getY() + 0.07, pos.getZ() + 0.5);
                PortConnection pcDouble = startTele.isInList(pc);
                if(pcDouble == null)
                {
                    startTele.addListEntry(pc);
                } else
                {
                    startTele.deleteListEntry(pcDouble);
                    startTele.addListEntry(pc);
                }

            }
        }
        return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}

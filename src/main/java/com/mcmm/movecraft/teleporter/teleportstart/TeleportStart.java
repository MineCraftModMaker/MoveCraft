package com.mcmm.movecraft.teleporter.teleportstart;

import com.mcmm.movecraft.MoveCraft;
import com.mcmm.movecraft.teleporter.PortConnection;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.LinkedList;

/**
 * Created by Ewald on 27.03.2017.
 */
public class TeleportStart extends Block  {

    private double endX;
    private double endY;
    private double endZ;
    private LinkedList<PortConnection> connectionList;


    public double getEndX() {
        return endX;
    }

    public void setEndX(double endX) {
        this.endX = endX;
    }

    public double getEndY() {
        return endY;
    }

    public void setEndY(double endY) {
        this.endY = endY;
    }

    public double getEndZ() {
        return endZ;
    }

    public void setEndZ(double endZ) {
        this.endZ = endZ;
    }



    public TeleportStart() {
        super(Material.ROCK);
        this.setCreativeTab(MoveCraft.creativeTab);
        connectionList = new LinkedList<>();
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }

    @Override
    public boolean isOpaqueCube(IBlockState iBlockState) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState iBlockState) {
        return false;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
        return EnumBlockRenderType.MODEL;
    }


    private final AxisAlignedBB TELEPORT_AABB = getAABBFromPixels(0, 0, 0, 16, 1, 16);


    @Nullable
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return TELEPORT_AABB;
    }


    private AxisAlignedBB getAABBFromPixels(int minX, int minY, int minZ, int maxX, int maxY, int maxZ)
    {
        final float PIXEL_WIDTH = 1.0F / 16.0F;
        return new AxisAlignedBB(minX * PIXEL_WIDTH, minY * PIXEL_WIDTH, minZ * PIXEL_WIDTH,
                maxX * PIXEL_WIDTH, maxY * PIXEL_WIDTH, maxZ * PIXEL_WIDTH);
    }


    @Mod.EventHandler
    public void onClicked(PlayerInteractEvent event)
    {
        EntityPlayer player = event.getEntityPlayer();
        System.out.println("EVENT");
        player.getHeldItem(EnumHand.MAIN_HAND);
    }

    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        double x = entityIn.getPositionVector().xCoord;
        double x1 = Math.abs(x - (int)x);
        double z = entityIn.getPositionVector().zCoord;
        double z1 = Math.abs(z - (int)z);
        if(x1 > 0.3 && x1 < 0.7 && z1 > 0.3 && z1 < 0.7) {

            for (PortConnection pc :
                    connectionList) {
                if(pos.getX() == pc.getStartX() && pos.getY() == pc.getStartY() && pos.getZ() == pc.getStartZ())
                {
                    entityIn.setPosition(pc.getEndX(), pc.getEndY(), pc.getEndZ());
                    break;
                }

            }

        }

    }

    public void addListEntry(PortConnection pc)
    {
        connectionList.add(pc);
    }

    public PortConnection isInList(PortConnection pc)
    {
        for (PortConnection portCon : connectionList) {
            if(pc.equals(portCon))
            {
                return portCon;
            }
        }
        return null;
    }

    public boolean deleteListEntry(PortConnection pc)
    {
        return connectionList.remove(pc);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
        return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0624D, 1.0D);
    }



}

package com.mcmm.movecraft.teleportstart;

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

/**
 * Created by Ewald on 27.03.2017.
 */
public class TeleportStart extends Block {

    private int EndX;
    private int EndY;
    private int EndZ;

    public int getEndX() {
        return EndX;
    }

    public void setEndX(int endX) {
        EndX = endX;
    }

    public int getEndY() {
        return EndY;
    }

    public void setEndY(int endY) {
        EndY = endY;
    }

    public int getEndZ() {
        return EndZ;
    }

    public void setEndZ(int endZ) {
        EndZ = endZ;
    }

    public TeleportStart() {
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
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
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return TELEPORT_AABB;
    }


    private AxisAlignedBB getAABBFromPixels(int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
        final float PIXEL_WIDTH = 1.0F / 16.0F;
        return new AxisAlignedBB(minX * PIXEL_WIDTH, minY * PIXEL_WIDTH, minZ * PIXEL_WIDTH,
                maxX * PIXEL_WIDTH, maxY * PIXEL_WIDTH, maxZ * PIXEL_WIDTH);
    }


    @Mod.EventHandler
    public void onClicked(PlayerInteractEvent event) {
        EntityPlayer player = event.getEntityPlayer();
        System.out.println("EVENT");
        player.getHeldItem(EnumHand.MAIN_HAND);
    }

    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        entityIn.setPosition(EndX, EndY, EndZ);
    }


}

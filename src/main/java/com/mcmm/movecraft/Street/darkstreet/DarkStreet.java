package com.mcmm.movecraft.Street.darkstreet;

import com.mcmm.movecraft.MoveCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by Marco on 20.03.2017.
 */
public class DarkStreet extends Block{

    public DarkStreet() {
        super(Material.ROCK);
        this.setCreativeTab(MoveCraft.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }

    @Override
    public boolean isOpaqueCube(IBlockState iBlockState) {
        return true;
    }

    @Override
    public boolean isFullCube(IBlockState iBlockState) {
        return true;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
        return EnumBlockRenderType.MODEL;
    }


    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.motionX *= 1.15D;
        entityIn.motionZ *= 1.15D;
        if(entityIn.motionX > 0.8)
        {
            entityIn.motionX = 0.8;
        }
        if(entityIn.motionY > 0.8)
        {
            entityIn.motionY = 0.8;
        }
        if(entityIn.motionX < -0.8)
        {
            entityIn.motionX = -0.8;
        }
        if(entityIn.motionY < -0.8)
        {
            entityIn.motionY = -0.8;
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
       return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.99D, 1.0D);
    }


}

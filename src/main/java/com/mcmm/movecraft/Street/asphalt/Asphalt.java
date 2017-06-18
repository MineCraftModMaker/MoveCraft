package com.mcmm.movecraft.Street.asphalt;

import com.mcmm.movecraft.MoveCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Ewald on 18.06.2017.
 */
public class Asphalt extends Block {

    public Asphalt() {
        super(Material.ROCK);
        this.setCreativeTab(MoveCraft.creativeTab);
    };

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
}

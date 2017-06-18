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
 *
 * Ein einfacher Dekorationsblock
 */
public class Asphalt extends Block {

    /**
     * Übergibt das Material aus was es besteht
     * Fügt in den CreativTab hinzu
     */
    public Asphalt() {
        super(Material.ROCK);
        this.setCreativeTab(MoveCraft.creativeTab);
    };

    /**
     * Gibt die Konsistens des Bockes zurück
     * @return
     */
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }

    /**
     * Gibt zurück ob der Block druchsichtig ist
     * @param iBlockState
     * @return
     */
    @Override
    public boolean isOpaqueCube(IBlockState iBlockState) {
        return true;
    }

    /**
     * Gibt zurück ob es ein ganzer Block ist
     * @param iBlockState
     * @return
     */
    @Override
    public boolean isFullCube(IBlockState iBlockState) {
        return true;
    }

    /**
     * Gibt den RenderTyp zurück
     * @param iBlockState
     * @return
     */
    @Override
    public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
        return EnumBlockRenderType.MODEL;
    }
}

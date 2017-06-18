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

    /**
     * Übergibt das Material aus was es besteht
     * Fügt in den CreativTab hinzu
     */
    public DarkStreet() {
        super(Material.ROCK);
        this.setCreativeTab(MoveCraft.creativeTab);
    }

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


    /**
     * Überprüft ob ein Entity mit dem Block in berührung kommt
     * @param worldIn
     * @param pos
     * @param state
     * @param entityIn
     */
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

    /**
     * Verschnellt ein kolitiertes Entity
     * @param blockState
     * @param worldIn
     * @param pos
     * @return
     */
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
       return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.99D, 1.0D);
    }


}

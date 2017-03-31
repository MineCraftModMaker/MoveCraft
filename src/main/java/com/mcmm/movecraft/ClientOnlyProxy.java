package com.mcmm.movecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * ClientProxy is used to set up the mod and start it running on normal minecraft.  It contains all the code that should run on the
 *   client side only.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public class ClientOnlyProxy extends CommonProxy
{

  /**
   * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
   */
  public void preInit()
  {
    super.preInit();

    com.mcmm.movecraft.darkstreet.StartupClientOnly.preInitClientOnly();
    com.mcmm.movecraft.lightstreet.StartupClientOnly.preInitClientOnly();
    com.mcmm.movecraft.mechanicaltable.StartupClientOnly.preInitClientOnly();
    com.mcmm.movecraft.teleportstart.StartupClientOnly.preInitClientOnly();
  }

  /**
   * Do your mod setup. Build whatever data structures you care about. Register recipes,
   * send FMLInterModComms messages to other mods.
   */
  public void init()
  {
    super.init();
    com.mcmm.movecraft.darkstreet.StartupClientOnly.initClientOnly();
    com.mcmm.movecraft.lightstreet.StartupClientOnly.initClientOnly();
    com.mcmm.movecraft.mechanicaltable.StartupClientOnly.initClientOnly();
    com.mcmm.movecraft.teleportstart.StartupClientOnly.initClientOnly();
  }

  /**
   * Handle interaction with other mods, complete your setup based on this.
   */
  public void postInit()
  {
    super.postInit();
    com.mcmm.movecraft.darkstreet.StartupClientOnly.postInitClientOnly();
    com.mcmm.movecraft.lightstreet.StartupClientOnly.postInitClientOnly();
    com.mcmm.movecraft.mechanicaltable.StartupClientOnly.postInitClientOnly();
    com.mcmm.movecraft.teleportstart.StartupClientOnly.postInitClientOnly();
  }

  @Override
  public boolean playerIsInCreativeMode(EntityPlayer player) {
    if (player instanceof EntityPlayerMP) {
      EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
      return entityPlayerMP.interactionManager.isCreative();
    } else if (player instanceof EntityPlayerSP) {
      return Minecraft.getMinecraft().playerController.isInCreativeMode();
    }
    return false;
  }

  @Override
  public boolean isDedicatedServer() {return false;}

}

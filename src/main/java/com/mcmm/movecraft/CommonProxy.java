package com.mcmm.movecraft;

import net.minecraft.entity.player.EntityPlayer;

/**
 * CommonProxy is used to set up the mod and start it running.  It contains all the code that should run on both the
 *   Standalone client and the dedicated server.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public abstract class CommonProxy {

  /**
   * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
   */
  public void preInit()
  {
	   //read config first
    com.mcmm.movecraft.darkstreet.StartupCommon.preInitCommon();
    com.mcmm.movecraft.lightstreet.StartupCommon.preInitCommon();
    com.mcmm.movecraft.mechanicaltable.StartupCommon.preInitCommon();
    com.mcmm.movecraft.teleportstart.StartupCommon.preInitCommon();
    com.mcmm.movecraft.teleportend.StartupCommon.preInitCommon();
    com.mcmm.movecraft.ironpole.StartupCommon.preInitCommon();
  }

  /**
   * Do your mod setup. Build whatever data structures you care about. Register recipes,
   * send FMLInterModComms messages to other mods.
   */
  public void init()
  {
    com.mcmm.movecraft.darkstreet.StartupCommon.initCommon();
    com.mcmm.movecraft.lightstreet.StartupCommon.initCommon();
    com.mcmm.movecraft.mechanicaltable.StartupCommon.initCommon();
    com.mcmm.movecraft.recipes.StartupCommon.init();
    com.mcmm.movecraft.teleportstart.StartupCommon.initCommon();
    com.mcmm.movecraft.teleportend.StartupCommon.initCommon();
    com.mcmm.movecraft.ironpole.StartupCommon.initCommon();
  }

  /**
   * Handle interaction with other mods, complete your setup based on this.
   */
  public void postInit()
  {
    com.mcmm.movecraft.darkstreet.StartupCommon.postInitCommon();
    com.mcmm.movecraft.lightstreet.StartupCommon.postInitCommon();
    com.mcmm.movecraft.mechanicaltable.StartupCommon.postInitCommon();
    com.mcmm.movecraft.teleportstart.StartupCommon.postInitCommon();
    com.mcmm.movecraft.teleportend.StartupCommon.postInitCommon();
    com.mcmm.movecraft.ironpole.StartupCommon.postInitCommon();
  }

  // helper to determine whether the given player is in creative mode
  //  not necessary for most examples
  abstract public boolean playerIsInCreativeMode(EntityPlayer player);

  /**
   * is this a dedicated server?
   * @return true if this is a dedicated server, false otherwise
   */
  abstract public boolean isDedicatedServer();
}

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
    com.mcmm.movecraft.Street.darkstreet.StartupCommon.preInitCommon();
    com.mcmm.movecraft.Street.lightstreet.StartupCommon.preInitCommon();
    com.mcmm.movecraft.mechanicaltable.StartupCommon.preInitCommon();
    com.mcmm.movecraft.teleporter.teleportstart.StartupCommon.preInitCommon();
    com.mcmm.movecraft.teleporter.teleportend.StartupCommon.preInitCommon();
    com.mcmm.movecraft.ironpole.StartupCommon.preInitCommon();
    com.mcmm.movecraft.teleporter.teleportconnector.StartupCommon.preInitCommon();
    com.mcmm.movecraft.bike.StartupCommon.preInitCommon();
    com.mcmm.movecraft.teleporter.teleportpearl.StartupCommon.preInitCommon();
    com.mcmm.movecraft.Street.asphalt.StartupCommon.preInitCommon();
  }

  /**
   * Do your mod setup. Build whatever data structures you care about. Register recipes,
   * send FMLInterModComms messages to other mods.
   */
  public void init()
  {
    com.mcmm.movecraft.Street.darkstreet.StartupCommon.initCommon();
    com.mcmm.movecraft.Street.lightstreet.StartupCommon.initCommon();
    com.mcmm.movecraft.mechanicaltable.StartupCommon.initCommon();
    com.mcmm.movecraft.recipes.StartupCommon.init();
    com.mcmm.movecraft.teleporter.teleportstart.StartupCommon.initCommon();
    com.mcmm.movecraft.teleporter.teleportend.StartupCommon.initCommon();
    com.mcmm.movecraft.ironpole.StartupCommon.initCommon();
    com.mcmm.movecraft.teleporter.teleportconnector.StartupCommon.initCommon();
    com.mcmm.movecraft.bike.StartupCommon.initCommon();
    com.mcmm.movecraft.teleporter.teleportpearl.StartupCommon.initCommon();
    com.mcmm.movecraft.Street.asphalt.StartupCommon.initCommon();
  }

  /**
   * Handle interaction with other mods, complete your setup based on this.
   */
  public void postInit()
  {
    com.mcmm.movecraft.Street.darkstreet.StartupCommon.postInitCommon();
    com.mcmm.movecraft.Street.lightstreet.StartupCommon.postInitCommon();
    com.mcmm.movecraft.mechanicaltable.StartupCommon.postInitCommon();
    com.mcmm.movecraft.teleporter.teleportstart.StartupCommon.postInitCommon();
    com.mcmm.movecraft.teleporter.teleportend.StartupCommon.postInitCommon();
    com.mcmm.movecraft.ironpole.StartupCommon.postInitCommon();
    com.mcmm.movecraft.teleporter.teleportconnector.StartupCommon.postInitCommon();
    com.mcmm.movecraft.bike.StartupCommon.postInitCommon();
    com.mcmm.movecraft.teleporter.teleportpearl.StartupCommon.postInitCommon();
    com.mcmm.movecraft.Street.asphalt.StartupCommon.postInitCommon();
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

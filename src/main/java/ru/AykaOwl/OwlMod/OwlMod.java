package com.AykaOwl.OwlMod;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = OwlMod.MODID, version = OwlMod.VERSION)
public class OwlMod
{
    public static final String MODID = "OwlMod";
    public static final String VERSION = "1.00";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}

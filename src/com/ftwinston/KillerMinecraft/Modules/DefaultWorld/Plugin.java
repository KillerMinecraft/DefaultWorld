package com.ftwinston.KillerMinecraft.Modules.DefaultWorld;

import org.bukkit.Material;
import org.bukkit.World.Environment;

import com.ftwinston.KillerMinecraft.WorldGenerator;
import com.ftwinston.KillerMinecraft.WorldGeneratorPlugin;

public class Plugin extends WorldGeneratorPlugin
{
	@Override
	public Environment getWorldType() { return Environment.NORMAL; }
	
	@Override
	public String[] getDescriptionText() { return new String[] {"Using the default world generator"}; }
	
	@Override
	public Material getMenuIcon() { return Material.GRASS; }
	
	@Override
	public WorldGenerator createInstance()
	{
		return new DefaultWorld();
	}
}
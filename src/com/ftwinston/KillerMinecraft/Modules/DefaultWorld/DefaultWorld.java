package com.ftwinston.KillerMinecraft.Modules.DefaultWorld;

import org.bukkit.WorldType;

import com.ftwinston.KillerMinecraft.Option;
import com.ftwinston.KillerMinecraft.WorldConfig;
import com.ftwinston.KillerMinecraft.WorldGenerator;
import com.ftwinston.KillerMinecraft.Configuration.ToggleOption;

public class DefaultWorld extends WorldGenerator
{
	ToggleOption largeBiomes, amplified;
	
	@Override
	public Option[] setupOptions()
	{
		largeBiomes = new ToggleOption("Use large biomes", false);
		amplified = new ToggleOption("Amplified world", false);
		
		return new Option[] { largeBiomes, amplified };
	}
	
	@Override
	public void setupWorld(WorldConfig world, Runnable runWhenDone)
	{
		if ( largeBiomes.isEnabled() )
			world.setWorldType(WorldType.LARGE_BIOMES);
		if ( amplified.isEnabled() )
			world.setWorldType(WorldType.AMPLIFIED);
		createWorld(world, runWhenDone);
	}
}

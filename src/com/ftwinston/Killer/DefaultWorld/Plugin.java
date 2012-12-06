package com.ftwinston.Killer.DefaultWorld;

import com.ftwinston.Killer.Killer;
import com.ftwinston.Killer.WorldOption;
import com.ftwinston.Killer.WorldOptionPlugin;

public class Plugin extends WorldOptionPlugin
{
	public void onEnable()
	{
		Killer.registerWorldOption(this);
	}
	
	@Override
	public WorldOption createInstance()
	{
		return new DefaultWorld();
	}
}
package com.harrystyles.levelreqs;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LevelRequirementsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LevelRequirementsPlugin.class);
		RuneLite.main(args);
	}
}
package xyz.evaan;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TediousCollectionLogPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TediousCollectionLogPlugin.class);
		RuneLite.main(args);
	}
}
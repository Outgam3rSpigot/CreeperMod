package me.Outgam3r.CreeperOnPlayer;

import org.bukkit.plugin.java.JavaPlugin;

import me.Outgam3r.CreeperOnPlayer.commands.CreeperCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new CreeperCommand(this);
	}
}
package com.yowshee.randomore;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class RandomOre extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("&l&cRandomOre has started up!");
        this.saveDefaultConfig();

        getServer().getPluginManager().registerEvents((Listener) new BlockBreak(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("RandomOre is shutting down...");
    }
}

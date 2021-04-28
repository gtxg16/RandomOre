package com.yowshee.orechanger;

import org.bukkit.plugin.java.JavaPlugin;

public final class OreChanger extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("&l&cOreChanger has started up!");

        getServer().getPluginManager().registerEvents(new EmeraldBlockBreak(), this);
        getServer().getPluginManager().registerEvents(new DiamondBlockBreak(), this);
        getServer().getPluginManager().registerEvents(new GoldBlockBreak(), this);
        getServer().getPluginManager().registerEvents(new IronBlockBreak(), this);
        getServer().getPluginManager().registerEvents(new LapisBlockBreak(), this);
        getServer().getPluginManager().registerEvents(new RedstoneBlockBreak(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("OreChanger is shutting down...");
    }
}

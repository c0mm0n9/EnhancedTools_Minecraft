package org.example.c0mm0n999.untitledplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnhancedTools extends JavaPlugin {

    @Override
    public void onEnable() {
       /* PluginCommand command =  getCommand("itemeditor");
        if(command != null) command.setExecutor(new untitledPluginCommand());*/
        ItemManager.init();
        // Plugin startup logic

    }



    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Shutting Down");
        // Plugin shutdown logic
    }
}

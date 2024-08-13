package iiDanto.customMessages;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new JoinLeaveMessages(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

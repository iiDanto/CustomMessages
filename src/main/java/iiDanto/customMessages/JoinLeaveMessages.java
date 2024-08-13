package iiDanto.customMessages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveMessages implements Listener {

    private final CustomMessages plugin;

    public JoinLeaveMessages(CustomMessages plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Boolean enabled = plugin.getConfig().getBoolean("join-message.enabled");
        if (enabled == true){
            String message = plugin.getConfig().getString("join-message.message");
            e.setJoinMessage(message);
        }
    }
    public void onPlayerLeave(PlayerQuitEvent e){
        Boolean enabled = plugin.getConfig().getBoolean("leave-message.enabled");
        if (enabled == true){
            String message = plugin.getConfig().getString("leave-message.message");
            e.setQuitMessage(message);
        }
    }
}

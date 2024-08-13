package iiDanto.customMessages;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathMessages implements Listener {
    private final CustomMessages plugin;

    public DeathMessages(CustomMessages plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Boolean enabled = plugin.getConfig().getBoolean("death-message.enabled");
        String message = plugin.getConfig().getString("death-message.message");
        Player p = e.getPlayer();
        e.setDeathMessage(message);
    }
}

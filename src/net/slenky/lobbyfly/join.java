package net.slenky.lobbyfly;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.eventHandler;
import org.bukkit.event.listener;
import org.bukkit.event.player.PlayerJoinEvent;

@EventHandler
public void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        if(p.hasPermission("lobbyfly.use")) {
        p.setAllowFlight(true);
        }
}
package net.slenky.lobbyfly;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;

        if(!p.hasPermission("lobbyfly.use")) {
            Message.playerSend(p, "§cYou cannot use this command.");
        } else {
            if(p.getAllowFlight()) {
                Message.playerSend(p, "§cFly deactivated!");
                p.setAllowFlight(false);
            } else {
                Message.playerSend(p, "§aFly activated!");
                p.setAllowFlight(true);
            }
        }
        return true;
    }
}
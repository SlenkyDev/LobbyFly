package net.slenky.lobbyfly;

import net.slenky.lobbyfly.command;
import net.slenky.lobbyfly.join;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        Message.consoleSend("[!] LobbyFly loaded!");

        loader();
    }

    private void loader() {
        getServer().getPluginManager().registerEvents((Listener) new join(), (Plugin) this);

        this.getCommand("fly").setExecutor((CommandExecutor) new fly());
    }

    public static Main getInstance() {
        return instance;
    }
}

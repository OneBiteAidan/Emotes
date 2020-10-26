package io.github.onebiteaidan.emotes;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class EmotesMain extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("onEnable is called!");
    }
    plugin.getCommand("command name").setExecutor(emote);
    @Override
    public void onDisable()
    {
        getLogger().info("onDisable is called!");
    }


}
/*
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        Player player = (Player) sender;
        if (alias.equalsIgnoreCase("heal")) {
            if (args.length == 0) {
                //Player only typed '/heal' so lets heal them back!
                player.setHealth(20.0);
            } else {
                //Player typed something more
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null) {
                    //Target is not online
                    player.sendMessage("Your target " + args[0] + " is not online!");
                } else {
                    //Targets online
                    player.sendMessage("You've healed " + args[0]);
                    target.setHealth(20.0);
                }
            }
        }
    }

 */
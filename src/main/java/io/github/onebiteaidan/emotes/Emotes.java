package io.github.onebiteaidan.emotes;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Emotes extends JavaPlugin implements CommandExecutor
{
    @Override
    public void onEnable()
    {
        getLogger().info("onEnable is called!");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("onDisable is called!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (label.equalsIgnoreCase("emote"))
        {
            if (sender instanceof Player)
            {
                Player player = (Player) sender;
                if (player.hasPermission("emote.use"))
                {
                    if (args.length == 0)
                    {
                        /* getStringList() is newer than the current RB 1337.  Use getList() and cast if you're
                        // concerned about backwards compatibility.
                        for (String line : getConfig().getStringList("emotes"))
                        {
                            player.sendMessage(line);
                        }*/
                        player.sendMessage("bababooey");
                    }
                    else if (args.length == 1)
                    {
                        player.chat("wakwakwakwakwakwk");
                    }
                    player.sendMessage(ChatColor.RED + "You do not have permission!");
                }
            else
                {
                    sender.sendMessage("Not enabled for console");
                }
                return true;
            }
        }
        return false;
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
package io.github.onebiteaidan.emotes;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Emote implements CommandExecutor
{
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
                        // getStringList() is newer than the current RB 1337.  Use getList() and cast if you're
                        // concerned about backwards compatibility.
                        for (String line : getConfig().getStringList("emotes"))
                        {
                            player.sendMessage(line);
                        }
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

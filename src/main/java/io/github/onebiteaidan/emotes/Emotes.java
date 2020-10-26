package io.github.onebiteaidan.emotes;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Emotes extends JavaPlugin implements CommandExecutor
{
    @Override
    public void onEnable()
    {

    }

    @Override
    public void onDisable()
    {

    }

    getCommand("command label").setExecutor(new CommandClass());
}

package me.tigercrl.selfkill;

import me.tigercrl.selfkill.Commands.SelfKillCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class SelfKill extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println(ChatColor.DARK_GREEN+"[SelfKill]Plugin successfully loaded!");
        System.out.println(ChatColor.DARK_GREEN+"[SelfKill]Author：Tigercrl");
        System.out.println(ChatColor.DARK_GREEN+"[SelfKill]Version：1.0");

        getCommand("selfkill").setExecutor(new SelfKillCommand());
    }

    //插件停用时执行次方法
    @Override
    public void onDisable() {
        System.out.println(ChatColor.DARK_GREEN+"[SelfKill]Plugin successfully unloaded!");
    }

}

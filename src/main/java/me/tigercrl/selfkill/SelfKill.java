package me.tigercrl.selfkill;

import me.tigercrl.selfkill.Commands.SelfKillCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class SelfKill extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println(ChatColor.DARK_GREEN+"[SelfKill]插件已成功加载！");
        System.out.println(ChatColor.DARK_GREEN+"[SelfKill]作者：Tigercrl");
        System.out.println(ChatColor.DARK_GREEN+"[SelfKill]版本：v1.0");

        getCommand("selfkill").setExecutor(new SelfKillCommand());
    }

    //插件停用时执行次方法
    @Override
    public void onDisable() {
        System.out.println(ChatColor.DARK_GREEN+"[SelfKill]插件已成功卸载！");
    }

}

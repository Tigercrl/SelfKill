package me.tigercrl.selfkill.Commands;

import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.ChatColor;

public class SelfKillCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("selfkill")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("这条指令只能由玩家输入");
            } else {
                Player player = (Player) sender;
                player.setHealth(0.0D);
                player.sendMessage(ChatColor.GRAY+"[SelfKill]您已自杀");
            }
            return true;
        }
        return false;
    }
}

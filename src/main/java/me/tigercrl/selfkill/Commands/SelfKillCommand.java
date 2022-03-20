package me.tigercrl.selfkill.Commands;

import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.ChatColor;

public class SelfKillCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("selfkill")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("This command can only used by players.");
            } else {
                Player player = (Player) sender;
                player.setHealth(0.0D);
                player.sendMessage(ChatColor.GRAY+"[SelfKill]You have killed yourself");
            }
            return true;
        }
        return false;
    }
}

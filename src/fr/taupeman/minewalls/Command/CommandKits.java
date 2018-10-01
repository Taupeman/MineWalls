package fr.taupeman.minewalls.Command;

import fr.taupeman.minewalls.Game.GameStatus;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandKits implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("kits")) {
            if (commandSender instanceof Player) {
                Player player = (Player) commandSender;
                if (!GameStatus.isIsStart() || GameStatus.isPreIsStart()) {

                } else {
                    player.sendMessage("Vous ne pouvez pas choisir votre kit en jeu !");
                }
            } else {
                commandSender.sendMessage("Seul les joueurs peuvent utiliser cette commande !");
            }
        }
        return false;
    }
}

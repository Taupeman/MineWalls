package fr.taupeman.minewalls.Player.Event;

import fr.taupeman.minewalls.Minewalls;
import fr.taupeman.minewalls.Player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    private static Minewalls instance = Minewalls.getInstance();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (instance.getPlayer(player) == null) instance.getPlayerDataList().add(new PlayerData(player));
        event.setJoinMessage(player.getDisplayName() + " est arrivé(e)");
    }
}

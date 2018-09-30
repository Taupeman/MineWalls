package fr.taupeman.minewalls.Player;

import org.bukkit.entity.Player;

public class PlayerData {
    private Player player;

    public PlayerData(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

}

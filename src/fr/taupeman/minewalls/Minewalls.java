package fr.taupeman.minewalls;

import fr.taupeman.minewalls.Player.Event.PlayerJoin;
import fr.taupeman.minewalls.Player.Event.PlayerQuit;
import fr.taupeman.minewalls.Player.PlayerData;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Minewalls extends JavaPlugin {
    private static final String ENABLE_MESSAGE = "[INFO]  MineWalls enable ... Good game !";
    private static final String DISABLE_MESSAGE = "[INFO]  MineWalls disable ... Good bye !";
    private static Minewalls instance;
    private List<PlayerData> playerDataList = new ArrayList<>();

    public static Minewalls getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        for(Player player: Bukkit.getOnlinePlayers()) {
            if (getPlayer(player) == null) getPlayerDataList().add(new PlayerData(player));
        }

        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerQuit(), this);

        Bukkit.getConsoleSender().sendMessage(ENABLE_MESSAGE);
    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(DISABLE_MESSAGE);
    }

    public List<PlayerData> getPlayerDataList() {
        return playerDataList;
    }

    public PlayerData getPlayer(Player player) {
        return playerDataList.stream().filter(playerData1 -> playerData1.getPlayer().getUniqueId().equals(player.getUniqueId())).findFirst().orElse(null);
    }

}

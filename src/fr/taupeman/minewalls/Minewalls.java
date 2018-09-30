package fr.taupeman.minewalls;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Minewalls extends JavaPlugin {
    private static Minewalls instance;
    private static final String ENABLE_MESSAGE = "[INFO]  MineWalls enable ... Good game !";
    private static final String DISABLE_MESSAGE = "[INFO]  MineWalls disable ... Good bye !";

    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getConsoleSender().sendMessage(ENABLE_MESSAGE);
    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(DISABLE_MESSAGE);
    }

}

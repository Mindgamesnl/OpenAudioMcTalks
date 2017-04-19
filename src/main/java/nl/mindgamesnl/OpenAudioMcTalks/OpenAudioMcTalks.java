package nl.mindgamesnl.OpenAudioMcTalks;

import org.bukkit.plugin.java.JavaPlugin;

public final class OpenAudioMcTalks extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new listener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

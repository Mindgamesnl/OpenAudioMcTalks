package nl.mindgamesnl.OpenAudioMcTalks;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.json.JSONObject;

import me.mindgamesnl.openaudiomc.publicApi.OpenAudioApi;
import net.openaudiomc.socket.Emitter;


public class listener implements Listener
{
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        for(Player player : Bukkit.getServer().getOnlinePlayers()) {
            if (OpenAudioApi.isConnected(player)) {
                JSONObject obj = new JSONObject();
                obj.put("command", "custom");
                obj.put("addon", "announce");
                obj.put("text", event.getMessage());
                obj.put("voice", 10);
                obj.put("sender", event.getPlayer().getName());
                obj.put("pitch", "2");
                Emitter.EmitToPlayer(player.getName(), obj.toString());
            }
        }
    }
}
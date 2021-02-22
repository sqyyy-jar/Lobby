package net.craftions.lobby.events;

import net.craftions.lobby.Lobby;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class EventChangeGameMode implements Listener {
    @EventHandler
    public void onChangeGameMode(PlayerGameModeChangeEvent e) {
        if (e.getNewGameMode().equals(GameMode.ADVENTURE) || e.getNewGameMode().equals(GameMode.SURVIVAL)) {
            Bukkit.getScheduler().scheduleSyncDelayedTask(Lobby.getPlugin(Lobby.class), new Runnable() {
                @Override
                public void run() {
                    e.getPlayer().setAllowFlight(true);
                }
            }, 0);
        }
    }
}

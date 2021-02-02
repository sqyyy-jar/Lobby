/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.lobby.events;

import net.craftions.lobby.config.Config;
import net.craftions.lobby.menu.Menu;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EventInventoryClick implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        if(Menu.tpTo.containsKey(e.getCurrentItem())){
            System.out.println("TEST");
            Location loc = Menu.tpTo.get(e.getCurrentItem());
            e.getWhoClicked().closeInventory();
            e.getWhoClicked().teleport(loc);
            e.setCancelled(true);
        }
    }
}

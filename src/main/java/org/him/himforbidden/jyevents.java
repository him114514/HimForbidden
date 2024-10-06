package org.him.himforbidden;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.List;

public class jyevents implements Listener {
    public static List<String> stringList = HimForbidden.wwgs.getConfig().getStringList("WeiJinCi");
    @EventHandler
    public void chexiao(AsyncPlayerChatEvent event) {
        if (wwg(event.getMessage() , stringList)) {
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.sendMessage("§c触发违禁词");
        }
    }
    private boolean wwg(String chat , List<String> lists) {
        for (String s : lists) {
            if (chat.contains(s)) {
                return true;
            }
        }
        return false;
    }
}

package org.linear.linearbot.event.server;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.maxgamer.quickshop.api.event.QSHandleChatEvent;

public class HookEvent implements Listener {
    private static String qsMessage;
    private static Player qsSender;

    @EventHandler(priority = EventPriority.HIGH)
    public void onQSChat(QSHandleChatEvent e) {
        setQsMessage(e.getMessage());
        setQsSender(e.getSender());
    }

    public static String getQsMessage() {return qsMessage;}
    public static Player getQsSender() {return qsSender;}
    private static void setQsMessage(String s) {qsMessage = s;}
    private static void setQsSender(Player p) {qsSender = p;}
}

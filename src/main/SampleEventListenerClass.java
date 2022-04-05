package zepl3.mcmcmcne.zepl3;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;


public class SampleEventListenerClass implements Listener {
    @EventHandler
    public void onBlockIgniteEvent(BlockIgniteEvent e) {
        Bukkit.broadcastMessage("x=?? y=?? z=?? のブロックが点火されました");
    }

}


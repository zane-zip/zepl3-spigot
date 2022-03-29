package zepl3.mcmcmcne.zepl3;

import org.bukkit.plugin.java.JavaPlugin;

public final class Zepl3 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("プラグインが開始しました");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("プラグインが停止しました");

    }
}

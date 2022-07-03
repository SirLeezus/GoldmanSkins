package lee.code.skins;

import lee.code.skins.commands.cmds.GiveSkinCMD;
import lee.code.skins.commands.cmds.SkinsCMD;
import lee.code.skins.commands.tabs.GiveSkinTab;
import lee.code.skins.commands.tabs.SkinsTab;
import lee.code.skins.listener.MenuListener;
import lee.code.skins.listener.SkinAnvilListener;
import lee.code.skins.listener.SkinPreviewListener;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class GoldmanSkins extends JavaPlugin {

    @Getter private Data data;
    @Getter private PU pU;

    @Override
    public void onEnable() {
        this.data = new Data();
        this.pU = new PU();

        data.loadData();
        registerListeners();
        registerCommands();

    }

    @Override
    public void onDisable() {

    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new SkinAnvilListener(), this);
        getServer().getPluginManager().registerEvents(new SkinPreviewListener(), this);
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
    }

    private void registerCommands() {
        getCommand("giveskin").setExecutor(new GiveSkinCMD());
        getCommand("giveskin").setTabCompleter(new GiveSkinTab());
        getCommand("skins").setExecutor(new SkinsCMD());
        getCommand("skins").setTabCompleter(new SkinsTab());
    }

    public static GoldmanSkins getPlugin() {
        return GoldmanSkins.getPlugin(GoldmanSkins.class);
    }
}

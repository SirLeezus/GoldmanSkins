package lee.code.skins.commands.cmds;

import lee.code.core.util.bukkit.BukkitUtils;
import lee.code.skins.GoldmanSkins;
import lee.code.skins.lists.Lang;
import lee.code.skins.lists.Skin;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GiveSkinCMD implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

        if (sender instanceof Player player) {
            if (args.length > 0) {
                String skin = args[0];
                Player target = player;

                if (args.length > 1) {
                    String stringPlayer = args[1];
                    OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayerIfCached(stringPlayer);
                    if (offlinePlayer != null) {
                        if (offlinePlayer.isOnline()) {
                            target = offlinePlayer.getPlayer();
                        }
                    }
                }

                if (GoldmanSkins.getPlugin().getData().getSkinKeys().contains(skin.toUpperCase())) {
                    BukkitUtils.givePlayerItem(target, Skin.valueOf(skin).getAnvilItem(), 1);
                }
            } else player.sendMessage(Lang.USAGE.getComponent(new String[] { command.getUsage() }));
        } else sender.sendMessage(Lang.PREFIX.getComponent(null).append(Lang.ERROR_NOT_A_CONSOLE_COMMAND.getComponent(null)));
        return true;
    }
}

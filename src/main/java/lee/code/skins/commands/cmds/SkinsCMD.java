package lee.code.skins.commands.cmds;

import lee.code.skins.GoldmanSkins;
import lee.code.skins.lists.Lang;
import lee.code.skins.menusystem.menus.SkinsMenu;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SkinsCMD implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (sender instanceof Player player) {
            player.playSound(player.getLocation(), Sound.ENTITY_LLAMA_SWAG, 1, 1);
            new SkinsMenu(GoldmanSkins.getPlugin().getData().getPlayerMU(player.getUniqueId())).open();
        } else sender.sendMessage(Lang.PREFIX.getComponent(null).append(Lang.ERROR_NOT_A_CONSOLE_COMMAND.getComponent(null)));
        return true;
    }
}

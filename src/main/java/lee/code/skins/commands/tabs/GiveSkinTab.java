package lee.code.skins.commands.tabs;

import lee.code.core.util.bukkit.BukkitUtils;
import lee.code.skins.GoldmanSkins;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class GiveSkinTab implements TabCompleter {

    private final List<String> blank = new ArrayList<>();

    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, String[] args) {
        if (sender instanceof Player) {
            if (args.length == 1) {
                return StringUtil.copyPartialMatches(args[0], GoldmanSkins.getPlugin().getData().getSkinKeys(), new ArrayList<>());
            } else if (args.length == 2) {
                return StringUtil.copyPartialMatches(args[1], BukkitUtils.getOnlinePlayers(), new ArrayList<>());
            } else return blank;
        } else return blank;
    }
}
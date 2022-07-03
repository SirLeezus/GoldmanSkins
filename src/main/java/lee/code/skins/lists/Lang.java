package lee.code.skins.lists;

import lee.code.core.util.bukkit.BukkitUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.kyori.adventure.text.Component;

@AllArgsConstructor
public enum Lang {
    PREFIX("&b&lSkins &3➔ &r"),
    MESSAGE_HELP_DIVIDER("&e▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"),
    MESSAGE_HELP_TITLE("                      &3-== &b&l&nCustomItem Help&r &3==-"),
    MESSAGE_HELP_SUB_COMMAND("&3{0}&b. &e{1} &c| &7{2}"),
    ERROR_NO_PERMISSION("&cYou sadly do not have permission for this."),
    ERROR_NOT_A_CONSOLE_COMMAND("&cThis is not a console command."),
    USAGE("&6&lUsage: &e{0}"),
    MENU_SKIN_PREVIEW_TITLE("&2&lSkin Preview"),
    MENU_SKINS_CATEGORY_TITLE("&2&lSkin Preview &8(Page {0})"),
    ERROR_MENU_PREVIOUS_PAGE("&7You are already on the first page."),
    ERROR_MENU_NEXT_PAGE("&7You are on the last page."),
    ;

    @Getter private final String string;

    public String getString(String[] variables) {
        String value = string;
        if (variables == null || variables.length == 0) return BukkitUtils.parseColorString(value);
        for (int i = 0; i < variables.length; i++) value = value.replace("{" + i + "}", variables[i]);
        return BukkitUtils.parseColorString(value);
    }

    public Component getComponent(String[] variables) {
        String value = string;
        if (variables == null || variables.length == 0) return BukkitUtils.parseColorComponent(value);
        for (int i = 0; i < variables.length; i++) value = value.replace("{" + i + "}", variables[i]);
        return BukkitUtils.parseColorComponent(value);
    }
}
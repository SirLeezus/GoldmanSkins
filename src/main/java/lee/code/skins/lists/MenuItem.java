package lee.code.skins.lists;

import lee.code.core.util.bukkit.BukkitUtils;
import lee.code.skins.GoldmanSkins;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

@AllArgsConstructor
public enum MenuItem {

    FILLER_GLASS(Material.BLACK_STAINED_GLASS_PANE, "&r", null, null),
    CLOSE_MENU(Material.BARRIER, "&c&lClose", null, null),
    NEXT_PAGE(Material.PAPER, "&eNext Page >", null, null),
    PREVIOUS_PAGE(Material.PAPER, "&e< Previous Page", null, null),
    BACK(Material.BARRIER, "&c&l< Back", null, null),
    SKIN_BOW(Material.BOW, "&e&lBow Skins", null, SkinType.BOW),
    SKIN_CROSSBOW(Material.CROSSBOW, "&e&lCrossbow Skins", null, SkinType.CROSSBOW),
    SKIN_SHIELD(Material.SHIELD, "&e&lShield Skins", null, SkinType.SHIELD),
    SKIN_FISHING_ROD(Material.FISHING_ROD, "&e&lFishing Rod Skins", null, SkinType.FISHING_ROD),
    SKIN_PICKAXE(Material.NETHERITE_PICKAXE, "&e&lPickaxe Skins", null, SkinType.PICKAXE),
    SKIN_AXE(Material.NETHERITE_AXE, "&e&lAxe Skins", null, SkinType.AXE),
    SKIN_SWORD(Material.NETHERITE_SWORD, "&e&lSword Skins", null, SkinType.SWORD),
    SKIN_SHOVEL(Material.NETHERITE_SHOVEL, "&e&lShovel Skins", null, SkinType.SHOVEL),
    SKIN_SHEARS(Material.SHEARS, "&e&lShears Skins", null, SkinType.SHEARS),
    SKIN_HOE(Material.NETHERITE_HOE, "&e&lHoe Skins", null, SkinType.HOE),
    ;

    @Getter private final Material type;
    @Getter private final String name;
    @Getter private final String lore;
    @Getter private final SkinType skinType;

    public ItemStack getItem() {
        return BukkitUtils.getItem(type, name, lore, null, true);
    }

    public ItemStack getSkinItem() {
        GoldmanSkins plugin = GoldmanSkins.getPlugin();
        ItemStack item = BukkitUtils.getItem(type, name, lore, null, true);
        ItemMeta itemMeta = item.getItemMeta();
        PersistentDataContainer dataContainer = itemMeta.getPersistentDataContainer();
        dataContainer.set(new NamespacedKey(plugin, "key"), PersistentDataType.STRING, skinType.name());
        item.setItemMeta(itemMeta);
        return item;
    }
}

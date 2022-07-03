package lee.code.skins;

import lee.code.skins.lists.Skin;
import lee.code.skins.lists.SkinType;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class PU {

    public Skin getSkin(ItemStack item) {
        GoldmanSkins plugin = GoldmanSkins.getPlugin();
        ItemMeta itemMeta = item.getItemMeta();
        PersistentDataContainer dataContainer = itemMeta.getPersistentDataContainer();
        NamespacedKey key = new NamespacedKey(plugin, "key");
        String skin = dataContainer.get(key, PersistentDataType.STRING);
        if (skin != null) return Skin.valueOf(skin);
        else return null;
    }

    public SkinType getSkinType(ItemStack item) {
        GoldmanSkins plugin = GoldmanSkins.getPlugin();
        ItemMeta itemMeta = item.getItemMeta();
        PersistentDataContainer dataContainer = itemMeta.getPersistentDataContainer();
        NamespacedKey key = new NamespacedKey(plugin, "key");
        String skin = dataContainer.get(key, PersistentDataType.STRING);
        if (skin != null) return SkinType.valueOf(skin);
        else return null;
    }
}

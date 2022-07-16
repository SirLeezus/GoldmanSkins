package lee.code.skins;

import lee.code.skins.lists.Skin;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SkinsAPI {

    public void forgeSkin(ItemStack skinItem, ItemStack targetItem) {
        GoldmanSkins plugin = GoldmanSkins.getPlugin();
        Skin skin = plugin.getPU().getSkin(skinItem);
        if (skin != null && plugin.getData().getSupportedSkinTypes(skin.getSkinType()).contains(targetItem.getType())) {
            ItemMeta resultMeta = targetItem.getItemMeta();
            resultMeta.setCustomModelData(skin.getId());
            targetItem.setItemMeta(resultMeta);
        }
    }
}

package lee.code.skins.listener;

import lee.code.skins.GoldmanSkins;
import lee.code.skins.lists.Skin;
import lee.code.skins.menusystem.menus.PreviewSkinMenu;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SkinPreviewListener implements Listener {

    @EventHandler
    public void onSkinItemPreview(PlayerInteractEvent e) {
        GoldmanSkins plugin = GoldmanSkins.getPlugin();
        Player player = e.getPlayer();
        if (player.isSneaking()) {
            ItemStack handItem = player.getInventory().getItemInMainHand();
            if (handItem.hasItemMeta()) {
                ItemMeta itemMeta = handItem.getItemMeta();
                if (itemMeta.hasCustomModelData() && itemMeta.getCustomModelData() == 4000) {
                    e.setCancelled(true);
                    Skin skin = plugin.getPU().getSkin(handItem);
                    player.playSound(player.getLocation(), Sound.ENTITY_LLAMA_SWAG, 1, 1);
                    new PreviewSkinMenu(plugin.getData().getPlayerMU(player.getUniqueId()), skin.getAnvilItem()).open();
                }
            }
        }
    }


}

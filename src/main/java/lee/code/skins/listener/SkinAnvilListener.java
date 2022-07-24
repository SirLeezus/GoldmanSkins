package lee.code.skins.listener;

import lee.code.skins.GoldmanSkins;
import lee.code.skins.lists.Skin;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SkinAnvilListener implements Listener {

    @EventHandler
    public void onAnvilSkin(PrepareAnvilEvent e) {
        GoldmanSkins plugin = GoldmanSkins.getPlugin();
        ItemStack[] contents = e.getInventory().getContents();
        ItemStack firstSlot = contents[0];
        ItemStack secondSlot = contents[1];

        if (firstSlot != null && secondSlot != null) {
            ItemMeta secondItemMeta = secondSlot.getItemMeta();
            if (secondItemMeta.hasCustomModelData()) {
                if (secondItemMeta.getCustomModelData() == 4000) {
                    Skin skin = plugin.getPU().getSkin(secondSlot);
                    if (skin != null && plugin.getData().getSupportedSkinTypes(skin.getSkinType()).contains(firstSlot.getType())) {
                        ItemStack result = firstSlot.clone();
                        ItemMeta resultMeta = result.getItemMeta();
                        resultMeta.setCustomModelData(skin.getId());
                        result.setItemMeta(resultMeta);
                        e.setResult(result);
                        if (e.getInventory().getRepairCost() < 1) Bukkit.getServer().getScheduler().runTaskLater(plugin, () -> e.getInventory().setRepairCost(1), 1L);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onAnvilRenameDeny(InventoryClickEvent e) {
        if (e.getInventory() instanceof AnvilInventory anvilInventory) {
            if (e.getSlotType() != InventoryType.SlotType.RESULT) return;
            ItemStack[] contents = anvilInventory.getContents();
            ItemStack firstSlot = contents[0];
            if (firstSlot!= null) {
                if (firstSlot.getItemMeta().hasCustomModelData()) {
                    if (firstSlot.getItemMeta().getCustomModelData() == 4000) {
                        e.setCancelled(true);
                    }
                }
            }
        }
    }
}

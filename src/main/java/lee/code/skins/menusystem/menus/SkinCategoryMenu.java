package lee.code.skins.menusystem.menus;

import lee.code.core.util.bukkit.BukkitUtils;
import lee.code.skins.GoldmanSkins;
import lee.code.skins.lists.Lang;
import lee.code.skins.lists.SkinType;
import lee.code.skins.menusystem.PaginatedMenu;
import lee.code.skins.menusystem.PlayerMU;
import net.kyori.adventure.text.Component;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class SkinCategoryMenu extends PaginatedMenu {

    public SkinCategoryMenu(PlayerMU pmu, SkinType skinType) {
        super(pmu);
        pmu.setSkinType(skinType);
    }

    @Override
    public Component getMenuName() {
        return Lang.MENU_SKINS_CATEGORY_TITLE.getComponent(new String[] { String.valueOf(pmu.getSkinPage() + 1) });
    }

    @Override
    public int getSlots() {
        return 54;
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {
        Player player = pmu.getOwner();
        ItemStack clickedItem = e.getCurrentItem();

        if (clickedItem == null) return;
        if (e.getClickedInventory() == player.getInventory()) return;
        if (clickedItem.getType().equals(Material.AIR)) return;
        if (clickedItem.equals(fillerGlass)) return;

        if (clickedItem.equals(back)) {
            playClickSound(player);
            new SkinsMenu(pmu).open();
        } else if (clickedItem.equals(previousPage)) {
            if (page == 0) {
                player.sendMessage(Lang.PREFIX.getComponent(null).append(Lang.ERROR_MENU_PREVIOUS_PAGE.getComponent(null)));
            } else {
                page = page - 1;
                pmu.setSkinPage(page);
                super.open();
                playClickSound(player);
            }
        } else if (clickedItem.equals(nextPage)) {
            if (!((index + 1) >= GoldmanSkins.getPlugin().getData().getSkinItems(pmu.getSkinType()).size())) {
                page = page + 1;
                pmu.setSkinPage(page);
                super.open();
                playClickSound(player);
            } else player.sendMessage(Lang.PREFIX.getComponent(null).append(Lang.ERROR_MENU_NEXT_PAGE.getComponent(null)));
        } else {
            if (player.getGameMode().equals(GameMode.CREATIVE)) {
                BukkitUtils.givePlayerItem(player, clickedItem, 1);
            }
        }
    }

    @Override
    public void setMenuItems() {
        addMenuBorder();
        page = pmu.getSkinPage();
        List<ItemStack> items = GoldmanSkins.getPlugin().getData().getSkinItems(pmu.getSkinType());

        if (items != null) {
            for(int i = 0; i < getMaxItemsPerPage(); i++) {
                index = getMaxItemsPerPage() * page + i;
                if(index >= items.size()) break;
                if (items.get(index) != null) {
                    ItemStack item = items.get(index);
                    inventory.addItem(item);
                }
            }
        }
    }
}

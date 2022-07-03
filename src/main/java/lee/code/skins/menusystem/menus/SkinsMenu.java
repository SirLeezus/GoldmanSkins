package lee.code.skins.menusystem.menus;

import lee.code.skins.GoldmanSkins;
import lee.code.skins.lists.Lang;
import lee.code.skins.lists.SkinType;
import lee.code.skins.menusystem.Menu;
import lee.code.skins.menusystem.PlayerMU;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class SkinsMenu extends Menu {

    public SkinsMenu(PlayerMU pmu) {
        super(pmu);
    }

    @Override
    public Component getMenuName() {
        return Lang.MENU_SKIN_PREVIEW_TITLE.getComponent(null);
    }

    @Override
    public int getSlots() {
        return 45;
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {
        GoldmanSkins plugin = GoldmanSkins.getPlugin();
        Player player = pmu.getOwner();
        ItemStack clickedItem = e.getCurrentItem();

        if (clickedItem == null) return;
        if (e.getClickedInventory() == player.getInventory()) return;
        if (clickedItem.getType().equals(Material.AIR)) return;
        if (clickedItem.equals(fillerGlass)) return;

        SkinType skin = plugin.getPU().getSkinType(clickedItem);
        playClickSound(player);
        new SkinCategoryMenu(pmu, skin).open();
    }

    @Override
    public void setMenuItems() {
        setFillerGlass();
        inventory.setItem(10, skinBow);
        inventory.setItem(12, skinCrossbow);
        inventory.setItem(14, skinShield);
        inventory.setItem(16, skinFishingRod);
        inventory.setItem(19, skinShears);
        inventory.setItem(21, skinPickaxe);
        inventory.setItem(23, skinAxe);
        inventory.setItem(25, skinSword);
        inventory.setItem(29, skinShovel);
        inventory.setItem(33, skinHoe);
    }
}

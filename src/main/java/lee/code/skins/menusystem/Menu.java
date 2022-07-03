package lee.code.skins.menusystem;

import lee.code.skins.lists.MenuItem;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public abstract class Menu implements InventoryHolder {

    public Menu(PlayerMU pmu) {
        this.pmu = pmu;
    }

    protected PlayerMU pmu;
    protected Inventory inventory;
    protected ItemStack fillerGlass = MenuItem.FILLER_GLASS.getItem();
    protected ItemStack nextPage = MenuItem.NEXT_PAGE.getItem();
    protected ItemStack previousPage = MenuItem.PREVIOUS_PAGE.getItem();
    protected ItemStack back = MenuItem.BACK.getItem();
    protected ItemStack skinBow = MenuItem.SKIN_BOW.getSkinItem();
    protected ItemStack skinCrossbow = MenuItem.SKIN_CROSSBOW.getSkinItem();
    protected ItemStack skinShears = MenuItem.SKIN_SHEARS.getSkinItem();
    protected ItemStack skinShield = MenuItem.SKIN_SHIELD.getSkinItem();
    protected ItemStack skinFishingRod = MenuItem.SKIN_FISHING_ROD.getSkinItem();
    protected ItemStack skinPickaxe = MenuItem.SKIN_PICKAXE.getSkinItem();
    protected ItemStack skinShovel = MenuItem.SKIN_SHOVEL.getSkinItem();
    protected ItemStack skinAxe = MenuItem.SKIN_AXE.getSkinItem();
    protected ItemStack skinSword = MenuItem.SKIN_SWORD.getSkinItem();
    protected ItemStack skinHoe = MenuItem.SKIN_HOE.getSkinItem();

    public abstract Component getMenuName();
    public abstract int getSlots();
    public abstract void handleMenu(InventoryClickEvent e);
    public abstract void setMenuItems();

    public void open() {
        inventory = Bukkit.createInventory(this, getSlots(), getMenuName());
        this.setMenuItems();
        pmu.getOwner().openInventory(inventory);
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public void setFillerGlass() {
        for (int i = 0; i < getSlots(); i++) {
            if (inventory.getItem(i) == null) {
                inventory.setItem(i, fillerGlass);
            }
        }
    }

    public void playClickSound(Player player) {
        player.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, (float) 0.5, (float) 1);
    }
}
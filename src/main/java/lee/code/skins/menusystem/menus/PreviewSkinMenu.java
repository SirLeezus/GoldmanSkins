package lee.code.skins.menusystem.menus;

import lee.code.skins.GoldmanSkins;
import lee.code.skins.lists.Lang;
import lee.code.skins.lists.Skin;
import lee.code.skins.menusystem.Menu;
import lee.code.skins.menusystem.PlayerMU;
import net.kyori.adventure.text.Component;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class PreviewSkinMenu extends Menu {

    public PreviewSkinMenu(PlayerMU pmu, ItemStack item) {
        super(pmu);
        pmu.setPreviewItem(item);
    }

    @Override
    public Component getMenuName() {
        return Lang.MENU_SKIN_PREVIEW_TITLE.getComponent(null);
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {

    }

    @Override
    public void setMenuItems() {
        setFillerGlass();
        Skin skin = GoldmanSkins.getPlugin().getPU().getSkin(pmu.getPreviewItem());
        inventory.setItem(13, skin.getCustomItem());
    }
}

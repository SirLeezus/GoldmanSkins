package lee.code.skins.menusystem;

import lee.code.skins.lists.SkinType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@RequiredArgsConstructor
public class PlayerMU {

    private final UUID owner;
    private final ConcurrentHashMap<SkinType, Integer> skinCategoryPage = new ConcurrentHashMap<>();
    @Getter @Setter private ItemStack previewItem;
    @Getter @Setter public SkinType skinType;
    public Player getOwner() {
        return Bukkit.getPlayer(owner);
    }

    public int getSkinPage() { return skinCategoryPage.getOrDefault(skinType, 0); }
    public void setSkinPage(int page) { skinCategoryPage.put(skinType, page); }
}
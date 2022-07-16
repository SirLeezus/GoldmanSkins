package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedHoe {
    NETHERITE_HOE(Material.NETHERITE_HOE),
    DIAMOND_HOE(Material.DIAMOND_HOE),
    GOLDEN_HOE(Material.GOLDEN_HOE),
    IRON_HOE(Material.IRON_HOE),
    WOODEN_HOE(Material.WOODEN_HOE),
    STONE_HOE(Material.STONE_HOE),
    ;

    @Getter private final Material material;
}

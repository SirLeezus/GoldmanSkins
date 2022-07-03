package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedSword {
    NETHERITE_SWORD(Material.NETHERITE_SWORD),
    DIAMOND_SWORD(Material.DIAMOND_SWORD),
    GOLDEN_SWORD(Material.GOLDEN_SWORD),
    IRON_SWORD(Material.IRON_SWORD),
    WOODEN_SWORD(Material.WOODEN_SWORD),
    STONE_SWORD(Material.STONE_SWORD),
    ;


    @Getter private final Material material;
}

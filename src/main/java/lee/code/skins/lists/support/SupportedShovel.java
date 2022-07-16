package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedShovel {
    NETHERITE_SHOVEL(Material.NETHERITE_SHOVEL),
    DIAMOND_SHOVEL(Material.DIAMOND_SHOVEL),
    GOLDEN_SHOVEL(Material.GOLDEN_SHOVEL),
    IRON_SHOVEL(Material.IRON_SHOVEL),
    WOODEN_SHOVEL(Material.WOODEN_SHOVEL),
    STONE_SHOVEL(Material.STONE_SHOVEL),
    ;


    @Getter private final Material material;
}

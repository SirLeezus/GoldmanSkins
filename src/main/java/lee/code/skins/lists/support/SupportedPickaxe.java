package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedPickaxe {
    NETHERITE_PICKAXE(Material.NETHERITE_PICKAXE),
    DIAMOND_PICKAXE(Material.DIAMOND_PICKAXE),
    GOLDEN_PICKAXE(Material.GOLDEN_PICKAXE),
    IRON_PICKAXE(Material.IRON_PICKAXE),
    WOODEN_PICKAXE(Material.WOODEN_PICKAXE),
    STONE_PICKAXE(Material.STONE_PICKAXE),
    ;


    @Getter private final Material material;
}

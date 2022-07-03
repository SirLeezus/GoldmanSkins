package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedAxe {
    NETHERITE_AXE(Material.NETHERITE_AXE),
    DIAMOND_AXE(Material.DIAMOND_AXE),
    GOLDEN_AXE(Material.GOLDEN_AXE),
    IRON_AXE(Material.IRON_AXE),
    WOODEN_AXE(Material.WOODEN_AXE),
    STONE_AXE(Material.STONE_AXE),
    ;


    @Getter private final Material material;
}

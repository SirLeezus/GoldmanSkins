package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedFishingRod {
    FISHING_ROD(Material.FISHING_ROD),
    ;


    @Getter private final Material material;
}

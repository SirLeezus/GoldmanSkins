package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedCrossbow {
    CROSSBOW(Material.CROSSBOW),
    ;


    @Getter private final Material material;
}

package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedShears {
    SHEARS(Material.SHEARS),
    ;


    @Getter private final Material material;
}

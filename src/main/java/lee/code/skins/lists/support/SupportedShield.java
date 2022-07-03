package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedShield {
    SHIELD(Material.SHIELD),
    ;


    @Getter private final Material material;
}

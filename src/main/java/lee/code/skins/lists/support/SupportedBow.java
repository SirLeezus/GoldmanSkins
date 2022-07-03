package lee.code.skins.lists.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;

@AllArgsConstructor
public enum SupportedBow {
    BOW(Material.BOW),
    ;


    @Getter private final Material material;
}

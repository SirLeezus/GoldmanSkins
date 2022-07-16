package lee.code.skins;

import lee.code.skins.lists.SkinType;
import lee.code.skins.lists.Skin;
import lee.code.skins.lists.support.*;
import lee.code.skins.menusystem.PlayerMU;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Data {

    private final ConcurrentHashMap<UUID, PlayerMU> playerMUList = new ConcurrentHashMap<>();
    @Getter private final List<String> skinKeys = new ArrayList<>();
    @Getter private final ConcurrentHashMap<SkinType, List<Material>> supportedTypes = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<SkinType, List<ItemStack>> skinItems = new ConcurrentHashMap<>();
    public List<Material> getSupportedSkinTypes(SkinType skinType) {
        return supportedTypes.get(skinType);
    }
    public List<ItemStack> getSkinItems(SkinType skinType) { return skinItems.get(skinType); }

    public PlayerMU getPlayerMU(UUID uuid) {
        if (playerMUList.containsKey(uuid)) {
            return playerMUList.get(uuid);
        } else {
            PlayerMU pmu = new PlayerMU(uuid);
            playerMUList.put(uuid, pmu);
            return pmu;
        }
    }

    public void loadData() {
        //skin keys
        skinKeys.addAll(EnumSet.allOf(Skin.class).stream().map(Skin::name).toList());

        //supported material types
        supportedTypes.put(SkinType.SWORD, EnumSet.allOf(SupportedSword.class).stream().map(SupportedSword::getMaterial).toList());
        supportedTypes.put(SkinType.AXE, EnumSet.allOf(SupportedAxe.class).stream().map(SupportedAxe::getMaterial).toList());
        supportedTypes.put(SkinType.BOW, EnumSet.allOf(SupportedBow.class).stream().map(SupportedBow::getMaterial).toList());
        supportedTypes.put(SkinType.SHOVEL, EnumSet.allOf(SupportedShovel.class).stream().map(SupportedShovel::getMaterial).toList());
        supportedTypes.put(SkinType.SHEARS, EnumSet.allOf(SupportedShears.class).stream().map(SupportedShears::getMaterial).toList());
        supportedTypes.put(SkinType.HOE, EnumSet.allOf(SupportedHoe.class).stream().map(SupportedHoe::getMaterial).toList());
        supportedTypes.put(SkinType.PICKAXE, EnumSet.allOf(SupportedPickaxe.class).stream().map(SupportedPickaxe::getMaterial).toList());
        supportedTypes.put(SkinType.FISHING_ROD, EnumSet.allOf(SupportedFishingRod.class).stream().map(SupportedFishingRod::getMaterial).toList());
        supportedTypes.put(SkinType.CROSSBOW, EnumSet.allOf(SupportedCrossbow.class).stream().map(SupportedCrossbow::getMaterial).toList());
        supportedTypes.put(SkinType.SHIELD, EnumSet.allOf(SupportedShield.class).stream().map(SupportedShield::getMaterial).toList());

        //skin items
        for (Skin skin : Skin.values()) {
            List<ItemStack> items;
            if (skinItems.containsKey(skin.getSkinType())) items = skinItems.get(skin.getSkinType());
            else items = new ArrayList<>();
            items.add(skin.getCustomItem());
            skinItems.put(skin.getSkinType(), items);
        }
    }
}

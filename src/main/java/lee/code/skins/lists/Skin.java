package lee.code.skins.lists;

import lee.code.core.util.bukkit.BukkitUtils;
import lee.code.skins.GoldmanSkins;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

@AllArgsConstructor
public enum Skin {

    //swords
    GALAXY_BLADE("&e&lGalaxy Blade", SkinType.SWORD, 4001),
    CRYSTAL_SWORD("&e&lCrystal Sword", SkinType.SWORD, 4002),
    GREATSWORD_OF_THE_HIDDEN_FOREST("&e&lGreatsword Of The Hidden Forest", SkinType.SWORD, 4003),
    MOLTEN_CHAOS_SWORD("&e&lMolten Chaos Sword", SkinType.SWORD, 4004),
    STEEL_SNAKE_SWORD("&e&lSteel Snake Sword", SkinType.SWORD, 4005),
    ZEPHYR_SWORD("&e&lZephyr Sword", SkinType.SWORD, 4006),
    BUBBLE_CORAL_BLADE("&e&lBubble Coral Blade", SkinType.SWORD, 4007),
    DRAGON_SWORD("&e&lDragon Sword", SkinType.SWORD, 4008),
    EYE_OF_END_SWORD("&e&lEye Of End Sword", SkinType.SWORD, 4009),
    AZURE_GREATSWORD("&e&lAzure Greatsword", SkinType.SWORD, 4010),
    RUNIC_PIERCER_SWORD("&e&lRunic Piercer Sword", SkinType.SWORD, 4011),
    DEATH_BLUDGEON("&e&lDeath Bludgeon", SkinType.SWORD, 4012),
    SOUL_DESTROYER_BLADE("&e&lSoul Destroyer Blade", SkinType.SWORD, 4013),
    CRIMSON_CLEAVER("&e&lCrimson Cleaver", SkinType.SWORD, 4014),
    GOLDEN_BLADE("&e&lGolden Blade", SkinType.SWORD, 4015),

    //bows
    WITHER_BOW("&e&lWither Bow", SkinType.BOW, 5000),
    NETHER_BOW("&e&lNether Bow", SkinType.BOW, 5001),
    ENDER_BOW("&e&lEnder Bow", SkinType.BOW, 5002),
    AQUA_BOW("&e&lAqua Bow", SkinType.BOW, 5003),
    GOLDEN_CROOK_STAFF("&e&lGolden Crook Staff", SkinType.BOW, 5004),

    //pickaxes
    FIERY_PICKAXE("&e&lFiery Pickaxe", SkinType.PICKAXE, 6000),
    ORE_OBLITERATOR("&e&lOre Obliterator Pickaxe", SkinType.PICKAXE, 6001),
    PICK_OF_DESTINY("&e&lPick Of Destiny", SkinType.PICKAXE, 6002),
    EMERALD_HERO_PICKAXE("&e&lEmerald Hero Pickaxe", SkinType.PICKAXE, 6003),
    YURILILY_PICKAXE("&e&lYurilily Pickaxe", SkinType.PICKAXE, 6004),

    //axes
    AZURE_GREATAXE("&e&lAzure Greataxe", SkinType.AXE, 7000),
    SKELETON_KING_AXE("&e&lSkeleton King Axe", SkinType.AXE, 7001),
    RUTHLESS_WAR_AXE("&e&lRuthless War Axe", SkinType.AXE, 7002),
    HYPER_EDGE_AXE("&e&lHyper Edge Axe", SkinType.AXE, 7003),
    FROST_AXE("&e&lFrost Axe", SkinType.AXE, 7004),

    //hoes
    AZURE_SCYTHE("&e&lAzure Scythe", SkinType.HOE, 8000),
    STEEL_LEAF_HOE("&e&lSteel Leaf Hoe", SkinType.HOE, 8001),
    URRE_HOE("&e&lUrre Hoe", SkinType.HOE, 8002),
    DARK_MATTER_HOE("&e&lDark Matter Hoe", SkinType.HOE, 8003),

    //shovels
    TWILIGHT_SHOVEL("&e&lTwilight Shovel", SkinType.SHOVEL, 9000),
    RUBY_SHOVEL("&e&lRuby Shovel", SkinType.SHOVEL, 9001),
    DEMON_STONE_SHOVEL("&e&lDemon Stone Shovel", SkinType.SHOVEL, 9002),
    PENGUIN_SHOVEL("&e&lPenguin Shovel", SkinType.SHOVEL, 9003),
    ANGEL_SHOVEL("&e&lAngel Shovel", SkinType.SHOVEL, 9004),
    ALLAY_SHOVEL("&e&lAllay Shovel", SkinType.SHOVEL, 9005),
    HOT_PINK_SHOVEL("&e&lHot Pink Shovel", SkinType.SHOVEL, 9006),

    //shield
    VIKING_SHIELD("&e&lViking Shield", SkinType.SHIELD, 10000),
    SILVER_EAGLE_SHIELD("&e&lSilver Eagle Shield", SkinType.SHIELD, 10001),

    //shears
    JUNGLE_SHEARS("&e&lJungle Shears", SkinType.SHEARS, 11000),
    PHOENIX_SHEARS("&e&lPhoenix Shears", SkinType.SHEARS, 11001),
    SILKY_BUTTER_SHEARS("&e&lSilky Butter Shears", SkinType.SHEARS, 11002),

    //fishing rod
    BROKEN_BRANCH_FISHING_ROD("&e&lBroken Branch Fishing Rod", SkinType.FISHING_ROD, 12000),


    ;

    @Getter private final String name;
    @Getter private final SkinType skinType;
    @Getter private final int id;

    public ItemStack getAnvilItem() {
        GoldmanSkins plugin = GoldmanSkins.getPlugin();
        String lore = "&6> &aUse this item in a anvil with a " + skinType.name().toLowerCase() + " to apply the skin.\n" +
                "&6> &aTo preview the skin sneak-click this item.";
        ItemStack item = BukkitUtils.getCustomItem(Material.GUNPOWDER, name + " Skin", lore, 4000, true);
        ItemMeta itemMeta = item.getItemMeta();
        PersistentDataContainer dataContainer = itemMeta.getPersistentDataContainer();
        dataContainer.set(new NamespacedKey(plugin, "key"), PersistentDataType.STRING, name());
        item.setItemMeta(itemMeta);
        return item;
    }

    public ItemStack getCustomItem() {
        Material mat = switch (skinType) {
            case AXE ->  Material.DIAMOND_AXE;
            case PICKAXE -> Material.DIAMOND_PICKAXE;
            case SHOVEL -> Material.DIAMOND_SHOVEL;
            case SWORD -> Material.DIAMOND_SWORD;
            case BOW -> Material.BOW;
            case HOE -> Material.DIAMOND_HOE;
            case FISHING_ROD -> Material.FISHING_ROD;
            case CROSSBOW -> Material.CROSSBOW;
            case SHIELD -> Material.SHIELD;
            case SHEARS -> Material.SHEARS;
         };

        return BukkitUtils.getCustomItem(mat, name + " Skin", null, id, true);
    }

}

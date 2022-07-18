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
    DRAGON_SLAYER_SWORD("&e&lDragon Slayer Sword", SkinType.SWORD, 4008),
    EYE_OF_THE_END_SWORD("&e&lEye Of The End Sword", SkinType.SWORD, 4009),
    AZURE_GREATSWORD("&e&lAzure Greatsword", SkinType.SWORD, 4010),
    RUNIC_PIERCER_SWORD("&e&lRunic Piercer Sword", SkinType.SWORD, 4011),
    DEATH_BLUDGEON("&e&lDeath Bludgeon", SkinType.SWORD, 4012),
    SOUL_DESTROYER_BLADE("&e&lSoul Destroyer Blade", SkinType.SWORD, 4013),
    CRIMSON_CLEAVER("&e&lCrimson Cleaver", SkinType.SWORD, 4014),
    GOLDEN_GLORY_BLADE("&e&lGolden Glory Blade", SkinType.SWORD, 4015),

    //bows
    PHANTOM_BOW("&e&lPhantom Bow", SkinType.BOW, 5000),
    DEVILS_STING_BOW("&e&lDevil's Sting Bow", SkinType.BOW, 5001),
    QUICKSTRIKE_BOW("&e&lQuickstrike Bow", SkinType.BOW, 5002),
    RAIN_DROP_BOW("&e&lRain Drop Bow", SkinType.BOW, 5003),
    SUNKEN_GEM_BOW("&e&lSunken Gem Bow", SkinType.BOW, 5005),
    LAST_WHISPER_BOW("&e&lLast Whisper Bow", SkinType.BOW, 5006),
    WORLDSHAPER_STAFF("&e&lWorldshaper Staff", SkinType.BOW, 5004),

    //pickaxes
    FIERY_PICKAXE("&e&lFiery Pickaxe", SkinType.PICKAXE, 6000),
    ORE_OBLITERATOR("&e&lOre Obliterator Pickaxe", SkinType.PICKAXE, 6001),
    PICK_OF_DESTINY("&e&lPick Of Destiny", SkinType.PICKAXE, 6002),
    HERO_OF_THE_VILLAGE_PICKAXE("&e&lHero Of The Village Pickaxe", SkinType.PICKAXE, 6003),
    YURILILY_PICKAXE("&e&lYurilily Pickaxe", SkinType.PICKAXE, 6004),
    GRIM_VIOLET_PICKAXE("&e&lGrim Violet Pickaxe", SkinType.PICKAXE, 6005),

    //axes
    AZURE_GREATAXE("&e&lAzure Greataxe", SkinType.AXE, 7000),
    SKELETON_KING_AXE("&e&lSkeleton King Axe", SkinType.AXE, 7001),
    RUTHLESS_WAR_AXE("&e&lRuthless War Axe", SkinType.AXE, 7002),
    HYPER_EDGE_AXE("&e&lHyper Edge Axe", SkinType.AXE, 7003),
    FROST_AXE("&e&lFrost Axe", SkinType.AXE, 7004),
    HOPES_END_AXE("&e&lHope's End Axe", SkinType.AXE, 7005),
    DEVOTION_AXE("&e&lDevotion Axe", SkinType.AXE, 7006),
    SLICE_OF_LIFE_AXE("&e&lSlice of Life Axe", SkinType.AXE, 7007),

    //hoes
    AZURE_SCYTHE("&e&lAzure Scythe", SkinType.HOE, 8000),
    STEEL_LEAF_HOE("&e&lSteel Leaf Hoe", SkinType.HOE, 8001),
    INFERNAL_HOE("&e&lInfernal Hoe", SkinType.HOE, 8002),
    DARK_MATTER_HOE("&e&lDark Matter Hoe", SkinType.HOE, 8003),
    ICE_STORM_HOE("&e&lIce Storm Hoe", SkinType.HOE, 8004),
    AWAKENED_DEMONIC_SCYTHE("&e&lAwakened Demonic Scythe", SkinType.HOE, 8005),
    SPARKLE_SWEEP_SCYTHE("&e&lSparkle Sweep Hoe", SkinType.HOE, 8006),

    //shovels
    TWILIGHT_SHOVEL("&e&lTwilight Shovel", SkinType.SHOVEL, 9000),
    RUBY_SHOVEL("&e&lRuby Shovel", SkinType.SHOVEL, 9001),
    SCOOP_OF_HEAVEN_SHOVEL("&e&lScoop Of Heaven Shovel", SkinType.SHOVEL, 9002),
    LAST_RESORT_SHOVEL("&e&lLast Resort Shovel", SkinType.SHOVEL, 9003),
    HEARTLESS_FOCUS_SHOVEL("&e&lHeartless Focus Shovel", SkinType.SHOVEL, 9004),
    FRENZY_SHOVEL("&e&lFrenzy Shovel", SkinType.SHOVEL, 9005),
    TWINKLE_SHOVEL("&e&lTwinkle Shovel", SkinType.SHOVEL, 9006),

    //shield
    AWW_MAN_SHIELD("&e&lAww Man Shield", SkinType.SHIELD, 10000),
    WALL_OF_PAIN_SHIELD("&e&lWall Of Pain Shield", SkinType.SHIELD, 10001),
    REDEMPTION_SHIELD("&e&lRedemption Shield", SkinType.SHIELD, 10002),
    CLEAR_VIEW_SHIELD("&e&lClear View Shield", SkinType.SHIELD, 10003),
    PRICKLY_STANCE_SHIELD("&e&lPrickly Stance Shield", SkinType.SHIELD, 10004),
    DEEP_DIVE_SHIELD("&e&lDeep Dive Shield", SkinType.SHIELD, 10005),
    JUICY_BERRIE_SHIELD("&e&lJuicy Berrie Shield", SkinType.SHIELD, 10006),
    GLOWING_KRAKEN_SHIELD("&e&lGlowing Kraken Shield", SkinType.SHIELD, 10007),
    PEACEFUL_FORCE_SHIELD("&e&lPeaceful Force Shield", SkinType.SHIELD, 10008),

    //shears
    JUNGLE_SHEARS("&e&lJungle Shears", SkinType.SHEARS, 11000),
    EMERALD_BLADE_SHEARS("&e&lEmerald Blade Shears", SkinType.SHEARS, 11001),
    SILKY_BUTTER_SHEARS("&e&lSilky Butter Shears", SkinType.SHEARS, 11002),
    HERO_STONE_SHEARS("&e&lHero Stone Shears", SkinType.SHEARS, 11003),
    ROYAL_SHEARS("&e&lRoyal Shears", SkinType.SHEARS, 11004),

    //fishing rod
    BROKEN_BRANCH_FISHING_ROD("&e&lBroken Branch Fishing Rod", SkinType.FISHING_ROD, 12000),
    OLD_FAITHFUL_FISHING_ROD("&e&lOld Faithful Fishing Rod", SkinType.FISHING_ROD, 12001),
    SUNKEN_GEM_FISHING_ROD("&e&lSunken Gem Fishing Rod", SkinType.FISHING_ROD, 12002),
    INSIGHT_FISHING_ROD("&e&lInsight Fishing Rod", SkinType.FISHING_ROD, 12003),
    WADDLES_FISHING_ROD("&e&lWaddles Fishing Rod", SkinType.FISHING_ROD, 12004),
    FAITHKEEPER_ROD("&e&lFaithkeeper Fishing Rod", SkinType.FISHING_ROD, 12005),
    MIDNIGHT_ECHO_FISHING_ROD("&e&lMidnight Echo Fishing Rod", SkinType.FISHING_ROD, 12006),

    //crossbows
    FURY_CROSSBOW("&e&lFury Crossbow", SkinType.CROSSBOW, 13000),
    RAINBOW_CROSSBOW("&e&lRainbow Crossbow", SkinType.CROSSBOW, 13001),
    GALAXY_SHOT_CROSSBOW("&e&lGalaxy Shot Crossbow", SkinType.CROSSBOW, 13002),
    KISS_OF_DEATH_CROSSBOW("&e&lKiss Of Death Crossbow", SkinType.CROSSBOW, 13003),
    LONG_WINTER_CROSSBOW("&e&lLong Winter Crossbow", SkinType.CROSSBOW, 13004),
    STICKY_SITUATION_CROSSBOW("&e&lSticky Situation Crossbow", SkinType.CROSSBOW, 13005),
    FERAL_SOUL_CROSSBOW("&e&lFeral Soul Crossbow", SkinType.CROSSBOW, 13006),
    DEMON_HUNTER_CROSSBOW("&e&lDemon Hunter Crossbow", SkinType.CROSSBOW, 13007),

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

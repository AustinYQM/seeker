package com.accio.seeker.representation.enums;

public enum EKeyword {
    BADGER,
    BAT,
    BIRD,
    BOAR,
    BOOK,
    BROOM,
    CANDY,
    CAPYBARA,
    CAT,
    CAULDRON,
    CHASER,
    CHIMAERA,
    CLOTHES,
    DEER,
    DOG,
    DRAGON,
    EAGLE,
    FAIRY,
    FERRET,
    FOX,
    GARGOYLE,
    GHOST,
    GHOUL,
    GNOME,
    GOBLIN,
    GRYFFINDOR,
    HEADMASTER,
    HEALING,
    HOUSE_ELF,
    HUFFLEPUFF,
    KEEPER,
    KELPIE,
    LION,
    MANTICORE,
    MONEY,
    OWL,
    PASSWORD,
    PHOENIX,
    PIXIE,
    PLANT,
    PORCUPINE,
    QUINTAPED,
    RAT,
    RAVENCLAW,
    ROOSTER,
    SEEKER,
    SLYTHERIN,
    SNAIL,
    SNAKE,
    SPIDER,
    SQUID,
    TOAD,
    TROLL,
    UNICORN,
    UNIQUE,
    WAND,
    WITCH,
    WIZARD,
    WOLF,

    CARE_OF_MAGICAL_CREATURES,
    CHARMS,
    POTIONS,
    QUIDDITCH,
    TRANSFIGURATION;

    public String getPrettyName() {
        if (this.name().contains("CARE_OF_MAGICAL_CREATURES")) {
            return "Care of Magical Creatures";
        }
        String prettyName = this.name().charAt(0) + this.name().substring(1).toLowerCase();
        return prettyName.replace("_", "-");
    }

    public static EKeyword fromPrettyName(String prettyName) {
        return switch (prettyName.toLowerCase()) {
            case "badger" -> BADGER;
            case "bat" -> BAT;
            case "bird" -> BIRD;
            case "boar" -> BOAR;
            case "book" -> BOOK;
            case "broom" -> BROOM;
            case "candy" -> CANDY;
            case "capybara" -> CAPYBARA;
            case "cat" -> CAT;
            case "cauldron" -> CAULDRON;
            case "chaser" -> CHASER;
            case "chimaera" -> CHIMAERA;
            case "clothes" -> CLOTHES;
            case "deer" -> DEER;
            case "dog" -> DOG;
            case "dragon" -> DRAGON;
            case "eagle" -> EAGLE;
            case "fairy" -> FAIRY;
            case "ferret" -> FERRET;
            case "fox" -> FOX;
            case "gargoyle" -> GARGOYLE;
            case "ghost" -> GHOST;
            case "ghoul" -> GHOUL;
            case "gnome" -> GNOME;
            case "goblin" -> GOBLIN;
            case "gryffindor" -> GRYFFINDOR;
            case "headmaster" -> HEADMASTER;
            case "healing" -> HEALING;
            case "house-elf" -> HOUSE_ELF;
            case "hufflepuff" -> HUFFLEPUFF;
            case "keeper" -> KEEPER;
            case "kelpie" -> KELPIE;
            case "lion" -> LION;
            case "manticore" -> MANTICORE;
            case "money" -> MONEY;
            case "owl" -> OWL;
            case "password" -> PASSWORD;
            case "phoenix" -> PHOENIX;
            case "pixie" -> PIXIE;
            case "plant" -> PLANT;
            case "porcupine" -> PORCUPINE;
            case "quintaped" -> QUINTAPED;
            case "rat" -> RAT;
            case "ravenclaw" -> RAVENCLAW;
            case "rooster" -> ROOSTER;
            case "seeker" -> SEEKER;
            case "care of magical creatures" -> CARE_OF_MAGICAL_CREATURES;
            case "charms" -> CHARMS;
            case "potions" -> POTIONS;
            case "quidditch" -> QUIDDITCH;
            case "transfiguration" -> TRANSFIGURATION;
            default -> throw new IllegalStateException("Unexpected value: " + prettyName);
        };
    }
}

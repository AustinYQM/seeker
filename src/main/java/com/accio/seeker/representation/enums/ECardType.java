package com.accio.seeker.representation.enums;

import lombok.Getter;

@Getter
public enum ECardType {
    ADVENTURE("Adventure"),
    CHARACTER("Character"),
    CREATURE("Creature"),
    ITEM("Item"),
    LESSON("Lesson"),
    LOCATION("Location"),
    MATCH("Match"),
    SPELL("Spell");

    private final String prettyName;

    ECardType(String prettyName) {
        this.prettyName = prettyName;
    }

    public static ECardType fromPrettyName(String prettyName) {
        return switch (prettyName.toLowerCase()) {
            case "adventure" -> ADVENTURE;
            case "character" -> CHARACTER;
            case "creature" -> CREATURE;
            case "item" -> ITEM;
            case "lesson" -> LESSON;
            case "location" -> LOCATION;
            case "match" -> MATCH;
            case "spell" -> SPELL;
            default -> throw new IllegalArgumentException("Unknown pretty name: " + prettyName);
        };
    }
}

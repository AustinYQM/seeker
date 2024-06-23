package com.accio.seeker.representation.enums;

import lombok.Getter;

@Getter
public enum ELesson {
    CARE_OF_MAGICAL_CREATURES("Care of Magical Creatures", "comc"),
    CHARMS("Charms", "c"),
    POTIONS("Potions", "p"),
    QUIDDITCH("Quidditch", "q"),
    TRANSFIGURATION("Transfiguration", "t");

    private final String prettyName;
    private final String shortName;

    ELesson(String prettyName, String shortName) {
        this.prettyName = prettyName;
        this.shortName = shortName;
    }

    public static ELesson fromShortName(String shortName) {
        return switch (shortName.toLowerCase()) {
            case "comc" -> CARE_OF_MAGICAL_CREATURES;
            case "c" -> CHARMS;
            case "p" -> POTIONS;
            case "q" -> QUIDDITCH;
            case "t" -> TRANSFIGURATION;
            default -> throw new IllegalArgumentException("Unknown short name: " + shortName);
        };
    }
}

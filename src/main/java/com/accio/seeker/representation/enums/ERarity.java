package com.accio.seeker.representation.enums;

import lombok.Getter;

@Getter
public enum ERarity {
    COMMON("Common", "c"),
    UNCOMMON("Uncommon", "u"),
    RARE("Rare", "r"),
    FOIL_PREMIUM("Foil Premium", "f"),
    HOLO_PORTRAIT_PREMIUM("Holo-Portrait Premium", "hp");

    private final String prettyName;
    private final String shortName;

    ERarity(String prettyName, String shortName) {
        this.prettyName = prettyName;
        this.shortName = shortName;
    }

    public static ERarity fromShortName(String shortName) {
        return switch (shortName.toLowerCase()) {
            case "c" -> COMMON;
            case "u" -> UNCOMMON;
            case "r" -> RARE;
            case "f" -> FOIL_PREMIUM;
            case "hp" -> HOLO_PORTRAIT_PREMIUM;
            default -> throw new IllegalArgumentException("Unknown short name: " + shortName);
        };
    }
}

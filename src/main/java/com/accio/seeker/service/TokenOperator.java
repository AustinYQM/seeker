package com.accio.seeker.service;

public record TokenOperator(TokenKeyword keyword, TokenOperand operand, String value) {

    public enum TokenKeyword {
        NAME,
        LESSON,
        POWER,
        TYPE,
        KEYWORD,
        TEXT,
        PROVIDES,
        FLAVOR,
        ARTIST,
        RARITY,
        SET,
        NUMBER,
        NONE
    }

    public enum TokenOperand {
        EQUALS,
        GREATER_THAN,
        LESS_THAN,
        GREATER_THAN_EQUALS,
        LESS_THAN_EQUALS,
        CONTAINS,
        NONE
    }

    public static TokenOperand parseOperand(String operand) {
        return switch (operand) {
            case "=" -> TokenOperand.EQUALS;
            case ">" -> TokenOperand.GREATER_THAN;
            case "<" -> TokenOperand.LESS_THAN;
            case ">=" -> TokenOperand.GREATER_THAN_EQUALS;
            case "<=" -> TokenOperand.LESS_THAN_EQUALS;
            case "*" -> TokenOperand.CONTAINS;
            default -> throw new IllegalArgumentException("Invalid operand: " + operand);
        };
    }
}

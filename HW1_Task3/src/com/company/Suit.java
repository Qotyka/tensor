package com.company;

public enum Suit {
    CLUBS(1), DIAMONDS(2), SPADES(3), HEARTS(4);
    private final int suitPower;

    Suit(int power) {
        suitPower = power;
    }

    public int getSuitValue() {
        return this.suitPower;
    }
}

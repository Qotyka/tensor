package com.company;

public enum Rank {
    two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10), jack(11),
    quin(12), king(13), ace(14), joker(15);
    private final int rankValue;

    Rank(int rank) {
        rankValue = rank;
    }

    public int getRankValue() {
        return rankValue;
    }
}

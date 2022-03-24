package com.company;

public class Card_b {
    private int rank;
    private String suit;

    public Card_b (int rank, String suit) {
        if(suit.equals("diamonds") || suit.equals("clubs") || suit.equals("hearts") || suit.equals("spades")){
            System.out.println("Card suit is wrong! Please, take one of this values: diamonds, clubs, hearts, spades");
        } else {
            this.rank = rank;
            this.suit = suit;
        }
    }

    //методы чтения значений rank и suit
    public int getRank () {
        return rank;
    }
    public String getSuit () {
        return suit;
    }
}

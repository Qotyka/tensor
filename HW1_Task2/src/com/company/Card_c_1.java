//класс с использованием массива
package com.company;

public class Card_c_1 {
    private int rank;
    private String suit;

    //для хранения пар масть/максимальный ранг пользуюсь массивом
    //индексы 0 - diamonds, 1 - clubs, 2 - hearts, 3 - spades
    static int[] maxRank = {0, 0, 0, 0};
    public Card_c_1() {
    }

    public Card_c_1(int rank, String suit) {
        if (suit.equals("diamonds") || suit.equals("clubs") || suit.equals("hearts") || suit.equals("spades")) {
            this.rank = rank;
            this.suit = suit;
            switch (suit) {
                case "diamonds" -> maxRank[0] = Math.max(maxRank[0], rank);
                case "clubs" -> maxRank[1] = Math.max(maxRank[1], rank);
                case "hearts" -> maxRank[2] = Math.max(maxRank[2], rank);
                case "spades" -> maxRank[3] = Math.max(maxRank[3], rank);
            }
        } else {
            System.out.println("Card suit is wrong! Please, take one of this values: diamonds, clubs, hearts, spades");
        }
    }

    public Card_c_1(String suit) {
        if (suit == "diamonds" || suit == "clubs" || suit == "hearts" || suit == "spades") {
            this.suit = suit;
            //проверка наличия suit в ключах Map maxRank
            switch (suit) {
                case "diamonds" -> this.rank = maxRank[0]+1;
                case "clubs" -> this.rank = maxRank[1]+1;
                case "hearts" -> this.rank = maxRank[2]+1;
                case "spades" -> this.rank = maxRank[3]+1;
            }
        } else {
            System.out.println("Card suit is wrong! Please, take one of this values: diamonds, clubs, hearts, spades");
        }
    }

    //методы чтения значений rank и suit
    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}

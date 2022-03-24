//класс с импользованием коллекции Map
package com.company;

import java.util.*;

public class Card_c {
    private int rank;
    private String suit;

    //для хранения пар масть/максимальный ранг пользуюсь коллекцией Map
    static Map<String, Integer> maxRank = new HashMap<String, Integer>();
    public Card_c() {
    }

    public Card_c(int rank, String suit) {
        if (suit.equals("diamonds") || suit.equals("clubs") || suit.equals("hearts") || suit.equals("spades")) {
            this.rank = rank;
            this.suit = suit;
            //проверка наличия suit в ключах Map maxRank
            if(maxRank.containsKey(suit)) {
                /*максимальное значение в паре rank и maxRank выбирается с помощью тернарного оператора
                и значение перезаписывается*/
                maxRank.put(suit, maxRank.get(suit) < rank ? rank:maxRank.get(suit));
            } else {
                maxRank.put(suit, rank);
            }

        } else {
            System.out.println("Card suit is wrong! Please, take one of this values: diamonds, clubs, hearts, spades");
        }
    }

    public Card_c(String suit) {
        if (suit.equals("diamonds") || suit.equals("clubs") || suit.equals("hearts") || suit.equals("spades")) {
            this.suit = suit;
            //проверка наличия suit в ключах Map maxRank
            if(maxRank.containsKey(suit)) {
                this.rank = maxRank.get(suit)+1;
            } else {
                //если нет такого suit, записывается в map с maxRank = 0
                maxRank.put(suit, 0);
            }
            this.rank = maxRank.get(suit)+1;
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

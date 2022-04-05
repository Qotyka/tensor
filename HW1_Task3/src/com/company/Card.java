package com.company;

public class Card {
    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        for (Suit i : Suit.values()) {
            if (i.name().equals(suit)) {
                this.rank = rank;
                this.suit = suit;
                break;
            }
        }
        if (suit == null) {
            System.out.println("Suit is wrong!");
        }
    }

    //реализация toString
    public String toString() {
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                if (rank == r.getRankValue() && suit.equals(s.name()))
                    return String.format("(%s, %s)", r.name(), s.name());
            }
        }
        return String.format("(%d, %s)", rank, suit);
    }

    //реализация equals
    public boolean equals(Object obj) {
        //если obj не относится к классу Card, возвращает false
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return (this.rank == card.rank) && (this.suit.equals(card.suit));
    }

    //hashCode зависит от ранга и первой буквы названия масти
    public int hashCode() {
        return rank + 10 * suit.toCharArray()[0];
    }

    //есть ли карта в стандартной французской 54-карточной колоде
    //Joker только в clubs и diamonds
    public boolean isInStandartDeck() {
        return (rank > Rank.two.getRankValue() && rank < Rank.ace.getRankValue())
                || (rank >= Rank.ace.getRankValue() && (Suit.DIAMONDS.name().equals(suit) || Suit.SPADES.name().equals(suit)));
    }

    //сильнее ли текущая карта переданной
    public boolean isStrongerThan(Object obj) {
        //если obj не относится к классу Card, возвращает false
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return (this.rank > card.rank) && (this.suit.equals(card.suit));
    }

    //сравнение текущей карты с переданной
    public int compareTo(Card card) {
        // 0 - карты равны, < 0 - текущая карта меньше, > 0 текущая карта больше
        // Любая карта сильной масти сильнее любой карты слабой масти
        if (Suit.valueOf(this.suit).getSuitValue() - Suit.valueOf(card.suit).getSuitValue() > 0) {
            return 1;
        } else if (Suit.valueOf(this.suit).getSuitValue() - Suit.valueOf(card.suit).getSuitValue() == 0) {
            return this.rank - card.rank;
        } else {
            return -1;
        }
    }

    public static int compareTo(Card card1, Card card2) {
        // 0 - карты равны, < 0 - первая карта меньше, > 0 первая карта больше
        // Любая карта сильной масти сильнее карты слабой масти
        if (Suit.valueOf(card1.suit).getSuitValue() - Suit.valueOf(card2.suit).getSuitValue() > 0) {
            return 1;
        } else if (Suit.valueOf(card1.suit).getSuitValue() - Suit.valueOf(card2.suit).getSuitValue() == 0) {
            return card1.rank - card2.rank;
        } else {
            return -1;
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
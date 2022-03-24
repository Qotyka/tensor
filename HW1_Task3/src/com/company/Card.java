package com.company;

public class Card{
    private int rank;
    private String suit;
    private static String[] names = {"Jack","Queen","King","Ace","Joker"};
    /* suits - массив для сравнения двух карт
    масти поставлены в порядке увеличения силы*/
    private static String[] suits = {"clubs","diamonds","spades","hearts"};
    public Card (int rank, String suit) {
        if(suit.equals("diamonds") || suit.equals("clubs") || suit.equals("hearts") || suit.equals("spades")){
            this.rank = rank;
            this.suit = suit;
        } else {
            System.out.println("Card suit is wrong! Please, take one of this values: diamonds, clubs, hearts, spades");
        }
    }
    //реализация toString
    public String toString(){
        //ace, king, queen, jack - 14, 13, 12, 11
        //joker - rank > 14
        if (rank > 10 && rank < 15){
            return String.format("(%s, %s)", names[rank-11], this.suit);
        } else if (rank >= 15 && (suit.equals("diamonds")||suit.equals("spades"))) {
            return String.format("(%s, %s)", names[4], this.suit);
        } else {
            return String.format("(%d, %s)", rank, this.suit);
        }
    }

    //реализация equals
    public boolean equals(Object obj){
        //если obj не относится к классу Card, возвращает false
        if(!(obj instanceof Card)){
            return false;
        }
        Card card = (Card) obj;
        return (this.rank == card.rank)&&(this.suit.equals(card.suit));
    }

    //hashCode зависит от ранга и первой буквы названия масти
    public int hashCode(){
        return rank + 10*suit.toCharArray()[0];
    }

    //есть ли карта в стандартной французской 54-карточной колоде
    //Joker только в clubs и diamonds
    public boolean isInStandartDeck ()
    {
        return (rank > 10 && rank < 15)||(rank >= 15 && (suit.equals("diamonds")||suit.equals("spades")));
    }

    //сильнее ли текущая карта переданной
    public boolean isStrongerThan (Object obj)
    {
        //если obj не относится к классу Card, возвращает false
        if(!(obj instanceof Card)){
            return false;
        }
        Card card = (Card) obj;
        return (this.rank > card.rank) && (this.suit.equals(card.suit));
    }

    //сравнение текущей карты с переданной
    public int compareTo (Card card)
    {
        //i, j - счетчики силы масти
        //перебираем все элементы массива мастей suits для 2-х карт
        //если нашли подходящую масть, счетчик не обновляется и цикл сбрасывается
        int i = 0, j = 0;
        for(String str : suits){
            if(str.equals(card.suit)){
                break;
            }
            i++;
        }
        for(String str : suits){
            if(str.equals(this.suit)){
                break;
            }
            j++;
        }
        // 0 - карты равны, < 0 - текущая карта меньше, > 0 текущая карта больше
        // Любая карта сильной масти сильнее любой карты слабой масти
        if (i-j > 0){
            return 1;
        } else if (i-j == 0) {
            return this.rank - card.rank;
        } else {
            return -1;
        }
    }

    public static int compareTo (Card card1, Card card2)
    {
        //i, j - счетчики силы масти
        //перебираем все элементы массива мастей suits для 2-х карт
        //если нашли подходящую масть, счетчик не обновляется и цикл сбрасывается
        int i = 0, j = 0;
        for(String str : suits){
            if(str.equals(card1.suit)){
                break;
            }
            i++;
        }
        for(String str : suits){
            if(str.equals(card2.suit)){
                break;
            }
            j++;
        }
        // 0 - карты равны, < 0 - первая карта меньше, > 0 первая карта больше
        // Любая карта сильной масти сильнее карты слабой масти
        return (i-j >= 0) ? card1.rank - card2.rank : card2.rank - card1.rank;
    }
    //методы чтения значений rank и suit
    public int getRank () {
        return rank;
    }
    public String getSuit () {
        return suit;
    }
}


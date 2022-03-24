package com.company;

public class Main {

    public static void main(String[] args) {
        String suit1 = "diamonds";
        String suit2 = "diamonds";
        String suit3 = "hearts";
        int rank1 = 2;
	    Card_c A = new Card_c(rank1, suit1); //основной конструктор
        Card_c B = new Card_c(suit2); //дополнительный конструктор, значение rank должно быть maxRank+1 = rank1 + 1
        Card_c C = new Card_c(suit3); //дополнительный конструктор, значение rank должно быть 1
        System.out.println("Card A: "+A.getSuit()+", "+A.getRank());
        System.out.println("Card B: "+B.getSuit()+", "+B.getRank());
        System.out.println("Card C: "+C.getSuit()+", "+C.getRank());

        Card_c_1 A1 = new Card_c_1(rank1, suit1); //основной конструктор
        Card_c_1 B1 = new Card_c_1(suit2); //дополнительный конструктор, значение rank должно быть maxRank+1 = rank1 + 1
        Card_c_1 C1 = new Card_c_1(suit3); //дополнительный конструктор, значение rank должно быть 1
        System.out.println("Card A1: "+A1.getSuit()+", "+A1.getRank());
        System.out.println("Card B1: "+B1.getSuit()+", "+B1.getRank());
        System.out.println("Card C1: "+C1.getSuit()+", "+C1.getRank());
    }
}

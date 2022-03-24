package com.company;

public class Main {

    public static void main(String[] args) {
        String suit1 = "hearts";
        String suit2 = "clubs";
        String suit3 = "heart";
        int rank1 = 17;
        int rank2 = 10;
        int rank3 = 1;
	    Card card1 = new Card(rank1, suit1);
        Card card2 = new Card(rank2, suit2);
        Card card3 = new Card(rank3, suit3);
        System.out.println (card1.toString());
        System.out.println (card2.toString());
        System.out.println (card1.compareTo(card2));
        System.out.println (card1.isStrongerThan(card2));
        System.out.println (card1.isInStandartDeck());
    }
}

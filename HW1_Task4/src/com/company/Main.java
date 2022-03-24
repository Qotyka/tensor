package com.company;

public class Main {

    public static void main(String[] args) {
	    Deck deck = Deck.createDeckWithJoker();
        //раздаем 5 карт
        Card card1 = deck.getCard();
        System.out.println(card1.toString());
        Card card2 = deck.getCard();
        System.out.println(card2.toString());
        Card card3 = deck.getCard();
        System.out.println(card3.toString());
        Card card4 = deck.getCard();
        System.out.println(card4.toString());
        Card card5 = deck.getCard();
        System.out.println(card5.toString());
        //вернем первые 3 карты (добавляются в конец колоды)
        deck.returnCard(card1);
        deck.returnCard(card2);
        deck.returnCard(card3);
        //еще раз вернем первые 2 карты
        deck.returnCard(card1);
        deck.returnCard(card2);
        //выводим колоду, в колоде не должно быть только card4, card5; card2 и card3 не должны повторяться
        System.out.println(deck.toString());
        //перемешаем карты в колоде
        deck.shuffleDeck();
        System.out.println(deck.toString());
        //отсортируем карты в колоде
        deck.sort();
        System.out.println(deck.toString());
        //извлекаем все карты из колоды
        while(!deck.isEmpty()){
            deck.getCard();
        }
        System.out.println(deck.toString());
    }
}

package com.company;

import java.util.*;

public class Deck{
    private ArrayList<Card> deck = new ArrayList<>();
    private static String[] names = {"Jack","Queen","King","Ace","Joker"};
    private static String[] suits = {"clubs","diamonds","spades","hearts"};
    private static int i = 0; // счетчик вытянутых из колоды карт
    //конструктор закрыт
    private Deck (){
    }
    //метод создания колоды с джокером
    public static Deck createDeckWithJoker(){
        Deck deck = new Deck();
        for(String suit : suits){
            for(int rank = 2; rank < 16; rank ++){
                //если ранг карты 14 и меньше, или 15 (Joker) и масть diamonds/spades - создает новую карту в колоде
                if(rank < 15 || (rank == 15 && (suit.equals(suits[1])||suit.equals(suits[2])))){
                    deck.deck.add(new Card(rank, suit));
                }
            }
        }
        return deck;
    }
    //метод создания колоды без джокера
    public static Deck createDeckWithoutJoker(){
        Deck deck = new Deck();
        for(String suit : suits){
            for(int rank = 1; rank < 15; rank ++){
                deck.deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }
    static Card takeRandomCard (){
        Deck deck = createDeckWithJoker();
        //случайная карта из стандартной колоды с 2 джокерами
        return deck.deck.get((int) (Math.random() * 54));
    }
    //перемешивает карты в текущей колоде
    public void shuffleDeck (){
        Collections.shuffle(this.deck);
    }
    //сортировка карт в колоде
    public void sort (){
        TreeSet<Card> new_deck = new TreeSet<Card>();
        new_deck.addAll(this.deck);
        this.deck.clear();
        this.deck.addAll(new_deck);
    }
    //раздача (извлечение) карт из колоды
    public Card getCard(){
        int randomNumber = (int) (Math.random() * (deck.toArray().length-1));
        Card card = deck.get(randomNumber);
        deck.remove(randomNumber); //удаляем карту из текущей колоды
        return card;
    }
    //возврат карт в колоду
    public void returnCard(Card card){
        for(Card a : deck){
            if (a.compareTo(card) == 0) {
                return;
            }
        }
        deck.add(card);
    }
    //проверка на пустоту
    public boolean isEmpty(){
        return (deck.size() == 0);
    }
    //реализация toString
    public String toString(){
        String result = "";
        for(Card card : deck){
            result = result + " " + card.toString();
        }
        if(result.equals("")){
            return "The deck is empty!";
        }
        return result;
    }
}

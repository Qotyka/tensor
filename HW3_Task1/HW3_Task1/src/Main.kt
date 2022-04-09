 fun main(args: Array<String>) {
        val card1 = Card(Rank.TWO, Suit.DIAMONDS)
        val card2 = Card(Rank.ACE, Suit.DIAMONDS)
        val card3 = Card(Rank.FIVE, Suit.SPADES)
        println(card1.toString())
        println(card2.toString())
        println(card1.compareTo(card2))
        println(card1.isStrongerThan(card2))
        println(card1.isInStandartDeck())
 }

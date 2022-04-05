 fun main(args: Array<String>) {
        val suit1 = "hearts"
        val suit2 = "clubs"
        val suit3 = "heart"
        val rank1 = 17
        val rank2 = 10
        val rank3 = 1
        val card1 = Card(rank1, suit1)
        val card2 = Card(rank2, suit2)
        val card3 = Card(rank3, suit3)
        println(card1.toString())
        println(card2.toString())
        println(card1.compareTo(card2))
        println(card1.isStrongerThan(card2))
        println(card1.isInStandartDeck())
 }

class Card(private val rank: Rank, private val suit: Suit): Comparable<Card> {
    //реализация toString
    override fun toString(): String {
        return "(${rank.name}, ${suit.name})"
    }

    //реализация equals
    override fun equals(other: Any?): Boolean {
        //если obj не относится к классу Card, возвращает false
        return if (other !is Card) {
            false
        } else {
            (rank.name == other.rank.name) && (suit.name == other.suit.name)
        }
    }

    //hashCode зависит от ранга карты и силы масти
    override fun hashCode(): Int {
        return rank.rank + 10 * suit.suitValue
    }

    //есть ли карта в стандартной французской 54-карточной колоде
    //Joker только в clubs и diamonds
    fun isInStandartDeck(): Boolean {
        return (rank.rank >= Rank.TWO.rank && rank.rank <= Rank.ACE.rank)
                || (rank.rank > Rank.ACE.rank &&
                (Suit.DIAMONDS.suitValue == suit.suitValue || Suit.SPADES.suitValue == suit.suitValue))
    }

    //сильнее ли текущая карта переданной
    fun isStrongerThan(other: Any?): Boolean {
        //если obj не относится к классу Card, возвращает false
        return if (other !is Card) {
            false
        } else {
            (rank > other.rank) && (suit == other.suit)
        }
    }

    //сравнение текущей карты с переданной
    override operator fun compareTo(other: Card): Int {
        // 0 - карты равны, < 0 - текущая карта меньше, > 0 текущая карта больше
        // Любая карта сильной масти сильнее любой карты слабой масти

        return if (this.suit.suitValue - other.suit.suitValue > 0) {
            1
        } else if (this.suit.suitValue - other.suit.suitValue == 0) {
            rank.rank - other.rank.rank
        } else {
            -1
        }
    }

    fun compareTo(card1: Card, card2: Card): Int {
        // 0 - карты равны, < 0 - первая карта меньше, > 0 первая карта больше
        // Любая карта сильной масти сильнее карты слабой масти

        return if (card1.suit.suitValue - card2.suit.suitValue > 0) {
            1
        } else if (card1.suit.suitValue - card2.suit.suitValue == 0) {
            card1.rank.rank - card2.rank.rank
        } else {
            -1
        }
    }

    //методы чтения значений rank и suit
    fun getRank(): Int {
        return rank.rank
    }

    fun getSuit(): String {
        return suit.name
    }
}
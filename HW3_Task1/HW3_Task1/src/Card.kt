class Card(private val rank: Int, private val suit: String?) {

    //реализация toString
    override fun toString(): String {
        val rankName = Rank.values().associate { it.getRank() to it.getRankName() }[rank]
        return "(${rankName ?: rank}, $suit)" //если rankName равен null, возвращает число указанного ранга
    }

    //реализация equals
    override fun equals(other: Any?): Boolean {
        //если obj не относится к классу Card, возвращает false
        return if (other !is Card) {
            false
        } else {
            (rank == other.rank) && suit.equals(other.suit)
        }
    }

    //hashCode зависит от ранга и первой буквы названия масти
    override fun hashCode(): Int {
        return rank + 10 * suit.hashCode()
    }

    //есть ли карта в стандартной французской 54-карточной колоде
    //Joker только в clubs и diamonds
    fun isInStandartDeck(): Boolean {
        return (rank >= Rank.TWO.getRank() && rank <= Rank.ACE.getRank()
                || rank > Rank.ACE.getRank() && (Suit.DIAMONDS.getSuitName() == suit || Suit.SPADES.getSuitName() == suit))
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
    operator fun compareTo(other: Card): Int {
        // 0 - карты равны, < 0 - текущая карта меньше, > 0 текущая карта больше
        // Любая карта сильной масти сильнее любой карты слабой масти
        val mapOfSuitToValue = Suit.values().associate { it.getSuitName() to it.getSuitValue() }
        return if (mapOfSuitToValue.getValue(suit.toString()) - mapOfSuitToValue.getValue(other.suit.toString()) > 0) {
            1
        } else if (mapOfSuitToValue.getValue(suit.toString()) - mapOfSuitToValue.getValue(other.suit.toString()) == 0) {
            rank - other.rank
        } else {
            -1
        }
    }

    fun compareTo(card1: Card, card2: Card): Int {
        // 0 - карты равны, < 0 - первая карта меньше, > 0 первая карта больше
        // Любая карта сильной масти сильнее карты слабой масти
        val mapOfSuitToValue = Suit.values().associate { it.getSuitName() to it.getSuitValue() }
        return if (mapOfSuitToValue.getValue(card1.suit.toString()) - mapOfSuitToValue.getValue(card2.suit.toString()) > 0) {
            1
        } else if (mapOfSuitToValue.getValue(card1.suit.toString()) - mapOfSuitToValue.getValue(card2.suit.toString()) == 0) {
            card1.rank - card2.rank
        } else {
            -1
        }
    }

    //методы чтения значений rank и suit
    fun getRank(): Int {
        return rank
    }

    fun getSuit(): String? {
        return suit
    }
}
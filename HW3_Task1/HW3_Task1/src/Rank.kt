enum class Rank(rank: Int, name: String) {
    TWO(2, "two"), THREE(3, "three"), FOUR(4, "four"), FIVE(5, "five"), SIX(6, "six"), SEVEN(7, "seven"), EIGHT(8, "eight"),
    NINE(9, "nine"), TEN(10,"ten"), JACK(11, "jack"), QUIN(12,"quin"), KING(13,"king"), ACE(14, "ace"), JOKER(15, "joker");

    private val rankValue: Int = rank;
    private val rankName: String = name
    fun getRank(): Int {
        return rankValue
    }
    fun getRankName(): String {
        return rankName
    }
}
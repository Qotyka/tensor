enum class Suit(suitValue: Int, suitName: String) {
    CLUBS(1, "clubs"), DIAMONDS(2, "diamonds"), SPADES(3, "spades"), HEARTS(4, "hearts");

    private val value = suitValue
    private val suit = suitName

    fun getSuitValue(): Int {
        return value
    }

    fun getSuitName(): String {
        return suit
    }
}
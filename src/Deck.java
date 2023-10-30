public class Deck {
    String[] cards;
    String trump;
    Integer cardsCount;
    static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static final String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    Integer max_cards;
    Integer min_cards;
    Deck() {
    }
    void setCount(int count) {
        this.cardsCount = count;
    }
    public void set_maxcards(int maxCards) {
        this.max_cards = maxCards;
    }
    public void init(Object attr1, Object attr2) {

    }


}
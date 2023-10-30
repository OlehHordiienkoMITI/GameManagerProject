import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Table {

    List<PlayersHands> players;
    List<String> cards;
    String trump;
    int cardsCount;
    static final Suits suits = Suits.CLUBS; // Приклад, можна змінити
    static final Values values = Values.TWO; // Приклад, можна змінити
    int max_cards;
    int min_cards;
    boolean shuffled;

    public Table() {
        players = new ArrayList<>();
        cards = new ArrayList<>();
        shuffled = false;
    }

    public enum Suits {
        HEARTS, DIAMONDS, CLUBS, SPADES;
    }

    public enum Values {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    public void addCard(String card) {
        cards.add(card);
    }

    public void removeCard(String card) {
        cards.remove(card);
    }

    public void sortCards() {
        Collections.sort(cards); // Припускаємо, що клас Card реалізує Comparable
    }

    public void printCards(Deck deck) {
        for (String card : cards) {
            System.out.println(card);
        }
    }

    public void shuffleCards(Deck deck) {
        Collections.shuffle(cards);
        shuffled = true;
    }

    public String getCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0); // Повертаємо та видаляємо верхню карту
        }
        return null;
    }

    public void set_trump_card(String card) {
        this.trump = card; // Припускаємо, що Card має метод toString(), який повертає масть
    }

    public int count_cards() {
        return cards.size();
    }

    public void add_player(PlayersHands player) {
        players.add(player);
    }

    public void remove_player(int playerIndex) {
        if (playerIndex >= 0 && playerIndex < players.size()) {
            players.remove(playerIndex);
        }
    }

    public void deal_cards(Deck deck, PlayersHands player, int max_cards) {}

    public void start_round() {}
}
public class Statistic {
    String current_trump;
    Deck deck;
    Dropped drop;
    PlayersHands[] players;
    int amount_trump;

    void init() {
    }

    String get_current_trump() {
        return current_trump;
    }

    Deck get_deck() {return deck;}
    Dropped get_drop() {return drop;}

    PlayersHands[] get_players() {
        return players;
    }

    int get_amount_trump() {
        return amount_trump;
    }

    void set_current_trump(String trump) {
        current_trump = trump;
    }

    void set_deck(Deck deck) {this.deck = deck;}
    void set_drop(Dropped drop) {this.drop = drop;}

    void set_players(PlayersHands[] players) {this.players = players;}

    void set_amount_trump(int amount_trump) {
        this.amount_trump = amount_trump;
    }
}

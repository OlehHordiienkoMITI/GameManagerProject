import java.util.Arrays;

public class PlayersHands {
    String player_name;
    String[] hand;

    void init(String player_name) {}

    void add_card(String card){}

    void remove_card(String card){}

    String[] get_hand() { return hand;}
    void sort_hand() { Arrays.sort(hand);}

    void play_card(String card) {}
    void clear_hand() {}
}

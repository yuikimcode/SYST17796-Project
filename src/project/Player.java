package project;

import java.util.ArrayList;
import java.util.Collections;

public class Player {

    private final String name;
    private ArrayList<Card> cards;
    private int shuffleTiming;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getPlayerName() {
        return name;
    }

    public void setCards(ArrayList<Card> cards) {
        addCards(cards);
        shuffleTiming = this.cards.size();
    }

    public ArrayList<Card> getCardInfo() {
        return this.cards;
    }

    public Card getOneCard() {
        if (shuffleTiming == 0) {
            shuffle();
        }
        shuffleTiming--;
        return this.cards.remove(0);
    }

    public void addCards(ArrayList<Card> cards) {
        for (Card c : cards) {
            this.cards.add(c);
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
        shuffleTiming = this.cards.size();
    }

    @Override
    public String toString() {
        String format = "%s has %d cards.";
        return String.format(format, name, this.cards.size());
    }

}

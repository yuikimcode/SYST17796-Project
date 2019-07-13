/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author megha,2019
 * @modifier Sehyun, 2019
 * @modifier Kowsiya, 2019
 */

package project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {

    private ArrayList<Card> cards;

    public GroupOfCards() {
        cards = new ArrayList<>();
        setCards();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards() {
        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Value v : Card.Value.values()) {
                cards.add(new Card(s, v));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

}

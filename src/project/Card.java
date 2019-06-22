package project;

public class Card {

    public enum Suit {
        CLUB, SPADE, HEARTS, DIAMONDS
    };

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    };
    private final Suit suit;
    private final Value value;

    public Card(Suit s, Value v) {
        suit = s;
        value = v;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getNum() {
        int num = 0;

        if (null != this.value) switch (this.value) {
            case ACE:
                num = 14;
                break;
            case TWO:
                num = 2;
                break;
            case THREE:
                num = 3;
                break;
            case FOUR:
                num = 4;
                break;
            case FIVE:
                num = 5;
                break;
            case SIX:
                num = 6;
                break;
            case SEVEN:
                num = 7;
                break;
            case EIGHT:
                num = 8;
                break;
            case NINE:
                num = 9;
                break;
            case TEN:
                num = 10;
                break;
            case JACK:
                num = 11;
                break;
            case QUEEN:
                num = 12;
                break;
            case KING:
                num = 13;
                break;
            default:
                break;
        }
        return num;
    }

    @Override
    public String toString() {
        String format = "%s %s";
        return String.format(format, suit, value);
    }

}

package project;

import java.util.ArrayList;
import java.util.Scanner;

public class WarGame {

    public static void main(String[] args) {
        System.out.println("============== War Game ==============");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the first player. : ");
        String user1 = input.nextLine();
        System.out.print("Please enter the name of the second player. : ");
        String user2 = input.nextLine();

        Player p1 = new Player(user1);
        Player p2 = new Player(user2);

        // Card creation and shuffle
        GroupOfCards cards = new GroupOfCards();
        cards.shuffle();

        // Assign 26 cards to two users
        ArrayList<Card> cards1 = new ArrayList<>();
        ArrayList<Card> cards2 = (ArrayList<Card>) cards.getCards().clone();

        for (int i = 0; i < 26; i++) {
            cards1.add(cards2.get(i));
            cards2.remove(i);
        }

        p1.setCards(cards1);
        p2.setCards(cards2);

        // Start Game 
        int count = 1;
        while (true) {

            if (p1.getCardInfo().isEmpty() || p2.getCardInfo().isEmpty()) {
                String winner = p1.getCardInfo().isEmpty() ? user2 : user1;
                System.out.printf("The final winner is %s", winner);
                break;
            }

            System.out.println("-----------------------------------------");
            System.out.printf("%d   [ %s\'s card : %d / %s\'s card : %d ]%n",
                    count, user1, p1.getCardInfo().size(), user2, p2.getCardInfo().size());

            ArrayList<Card> tmp = new ArrayList<>();

            boolean repeat = true;
            char thisTimeWinner = '1';
            do {
                Card c1 = p1.getOneCard();
                Card c2 = p2.getOneCard();
                tmp.add(c1);
                tmp.add(c2);
                String format = "    %s\'s card %s / %s\'s card %s%n";
                System.out.printf(format, user1, c1, user2, c2);
                if (c1.getNum() == c2.getNum() && p1.getCardInfo().size() > 2 && p1.getCardInfo().size() > 2) {
                    System.out.println("    next card overlay");
                    c1 = p1.getOneCard();
                    c2 = p2.getOneCard();
                    tmp.add(c1);
                    tmp.add(c2);
                } else {
                    repeat = false;
                    thisTimeWinner = (c1.getNum() > c2.getNum()) ? '1' : '2';
                }
            } while (repeat);

            String turnWinner = "";
            if (thisTimeWinner == '1') {
                turnWinner = user1;
                p1.addCards(tmp);
            } else {
                turnWinner = user2;
                p2.addCards(tmp);
            }

            System.out.printf("    In this turn, %s won. (get %d cards)%n", turnWinner, tmp.size());
            System.out.println("Next Turn?");
            input.nextLine();
            count++;
        }
    }
}

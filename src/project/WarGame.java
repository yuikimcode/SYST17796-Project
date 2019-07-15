/**
 * The class that models your game. 
 * @author Sehyun, 2019
 * @modifier Kowsiya, 2019
 */

package project;

import java.util.Scanner;

public class WarGame {

    public static void main(String[] args) {
        
        Game war = new Game("war");
        String play;
        do{
            war.play();
            Scanner in = new Scanner(System.in);
            System.out.println("\nWant to play again? \nType 'y' for yes or 'n'! for No!");
            play = in.next().toLowerCase();
        }while(play.equals("y")); 
         
        System.out.println("Thank you for palying!");
    }     
}

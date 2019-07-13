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
        String play = "y";
        do{
            war.play();s
            Scanner in = new Scanner(System.in);
            System.out.println("Want to play again? \nType 'y' for yes or 'n'! for No!");
            play = in.next().toLowerCase();
        }while(play.equals("y")); 
         
        System.out.println("Thank you for palying!");
    }     
}

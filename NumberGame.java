import java.util.Random;
import java.util.Scanner;

public class NumberGame { 

    static Scanner scanner = new Scanner(System.in);

    public static void numbergame (int random, int uservalue, int attempt, int tAttmpt) {
        
        float temp = (float)tAttmpt;        
        float score = ((attempt+1) / temp) *100;
        int TAttempt = (int) score;

        if (attempt == 0 && random == uservalue) {

            System.out.println("\nCongratulations,You guessed the number correctly, You Won the game");
            System.out.println("Score : "+TAttempt); 

        } 
        else if (attempt == 0) {

            System.out.println("\nGame Over");
            System.out.println("Your Attempts are over");
            System.out.println("You loose the game");
            System.out.println("Try next Time");

        } 
        else {

            if(random == uservalue)
            {
                System.out.println("\nCongratulations,You guessed the number correctly, You Won the game");
                System.out.println("Score : "+TAttempt);
            }
             else if(random >= uservalue)
            {
                System.out.print("TOO LOW !  Enter Greater Value : ");
                uservalue = scanner.nextInt();
                numbergame(random, uservalue, attempt-1, tAttmpt);
            }
             else 
            {
                System.out.print("TOO HIGH !  Enter lowest value : ");
                uservalue = scanner.nextInt();
                numbergame(random, uservalue, attempt-1, tAttmpt);
            }

        }
    }

    public static void main(String[] args) {

        System.out.println("\n\n\t.....NUMBER GAME.....");

        int play = 0;

        do {
    
            Random ran = new Random();

            int random = ran.nextInt(100);

            random+=1;

            System.out.print("\nNumber of Attempts : ");
            int attempt = scanner.nextInt();

            System.out.print("\nEnter Your Guessed Value : ");
            int user_value = scanner.nextInt();

            numbergame(random, user_value, attempt-1, attempt);

            System.out.print("\nDid you want to play more ?(If YES then type 1 and if NO then type 0): ");
            play = scanner.nextInt();

        } while (play == 1);

        scanner.close();
    }
}


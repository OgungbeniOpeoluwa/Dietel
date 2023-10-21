package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        playGame();
    }


    public static int guessGame(){
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        return random.nextInt(1,100);
    }

    public static void playGame(){
        Scanner scanner = new Scanner(System.in);
        String stopper = "yes".toLowerCase();
        while(stopper.equals("yes")) {
            int guess = guessGame();
            System.out.println("Guess a number between 1 and 100");
            int answer = scanner.nextInt();
            if (answer == guess) {
                System.out.println("Congratulations. You guessed the number!,");
            } else {
                if (answer > guess) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Too low  .Try again");
                }
            }
            System.out.println("will you like to continue? if (yes) enter yes else enter no");
            stopper = scanner.next().toLowerCase();

        }

    }

}

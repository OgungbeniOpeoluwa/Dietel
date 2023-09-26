package practise;

import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottery = (int)(Math.random() * 100);
        System.out.println("Enter your guess(two digit): ");
        int guess = scanner.nextInt();

        int lottery1 = lottery / 10;
        int lottery2 = lottery % 10;

        int guess1 = guess / 10;
        int guess2 = guess % 10;

        System.out.println("the lottery number is : " + lottery);

        if(guess == lottery){
            System.out.println("exact match");
        }
        else if (guess2 == lottery1 && guess1 == lottery2){
            System.out.println("match all digit");
        } else if (guess1 == lottery1 || guess1 == lottery2 || guess2 == lottery1 || guess2 == lottery2) {
            System.out.println("match one digit");
        }
        else{
            System.out.println("sorry, no match");
        }
    }
}

package liangExcersise;

import java.security.SecureRandom;
import java.util.Scanner;

public class Games0fCrap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the games of crap,Kindly press(1) to continue ,else press (0): ");
        int continues = scanner.nextInt();
        while (continues != 0) {
            gamesOfCrap();
            System.out.println("I HOPE YOU HAD FUN...WILL LIKE TO TRY AGAIN ?? PRESS (1) ,ELSE PRESS(0)");
            continues = scanner.nextInt();

        }
    }







    public static void gamesOfCrap() {
        SecureRandom random = new SecureRandom();
        int firstNumber = random.nextInt(1, 7);
        int secondNumber = random.nextInt(1, 7);
        int sum = firstNumber + secondNumber;
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You rolled " + firstNumber +  " + " + secondNumber + " =" + sum);
            System.out.println("YOU LOOSE!!");
        }
        else if (sum == 7 || sum == 11) {
            System.out.println("You rolled  " + firstNumber +  " + " + secondNumber + " =" + sum);
            System.out.println("YOU WIN!!");
        }
        else {
            System.out.println("you rolled  " + firstNumber + " " + " + " + secondNumber + " = " + sum);
            System.out.println("Point is :  " + sum);
            firstNumber = random.nextInt(1, 7);
            secondNumber = random.nextInt(1, 7);
            int totals = firstNumber + secondNumber;
            while (totals != sum && totals != 7){
                firstNumber = random.nextInt(1, 7);
                secondNumber = random.nextInt(1, 7);
                totals = firstNumber + secondNumber;
            }
            if(sum == totals){
                System.out.println("you rolled " + firstNumber + " + " + secondNumber + " = " + totals);
                System.out.println("YOU WIN!!");
            } else {
                System.out.println("you rolled " + firstNumber + " + " + secondNumber + " = " + totals);
                System.out.println("YOU LOOSE!!");

            }

        }
    }
    }



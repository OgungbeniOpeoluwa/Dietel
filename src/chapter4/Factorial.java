package chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int userInput = scanner.nextInt();

        while(userInput < 0){
            System.out.println("kindly Enter a positive number: ");
            userInput = scanner.nextInt();
        }
        int product = 1;
        for(int number = userInput;  number >= 1 ; number--){
          product *= number;
        }
        System.out.println("The factorial of " + userInput + " = " + product );
    }
}

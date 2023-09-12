package chibuzorAssignment;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number2 = 0;
        int userInput;
        int total;
        do {
            System.out.println("Enter a number :");
            int number = scanner.nextInt();

            System.out.println("Enter another number: ");
            int number1 = scanner.nextInt();

            total = number + number1;

            System.out.println(total);
            System.out.println("if you will like to continue,kindly enter any number to continue or press 0 to stop:");
            userInput = scanner.nextInt();


        } while (userInput != number2);


    }
}

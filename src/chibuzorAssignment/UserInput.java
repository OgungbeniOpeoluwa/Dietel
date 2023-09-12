package chibuzorAssignment;

import java.util.Scanner;

public class  UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or press 0 to stop");
        int userInput = scanner.nextInt();
        int positive = 0;
        int negative = 0;
        int count = 1;

        while (userInput != 0) {
            if(userInput > 0){
                positive++;
            }
            if(userInput < 0){
                negative++;
            }
            if(userInput == 0){
                count++;
            }
            System.out.println("Enter another number or press 0 to stop");
            userInput = scanner.nextInt();
            }
        System.out.println("Sum of positive number is "+positive);
        System.out.println("Sum of negative number is "+negative);
        System.out.println("Sum of zero is " +count);
        }
    }



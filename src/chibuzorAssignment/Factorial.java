package chibuzorAssignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int userInput = scanner.nextInt();
       int count =1;
        while(userInput > 0){
            count = count *userInput;
            userInput--;

        }
        System.out.println(count);

    }
}

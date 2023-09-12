package tdd;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        int result = number * number;
        System.out.printf("The square of the %d is %d", number,result);
    }
}

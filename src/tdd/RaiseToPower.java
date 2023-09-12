package tdd;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter another number : ");
        int number2 = scanner.nextInt();
        //System.out.println(number<<number2);
        int total = 1 ;
        for (int sum = 1; sum <= number2; sum++) {
            total= total * number;

        }
        System.out.println(total);
    }
}

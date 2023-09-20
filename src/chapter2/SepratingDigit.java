package chapter2;

import java.util.Scanner;

public class SepratingDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter five digit  number:");
        int number1 = input.nextInt();

        int result = number1 / 10000;
        int result2 = number1 / 10000 % 10;
        int result3 = number1 / 1000 % 10;
        int result4 = number1 / 100 % 10;
        int result5 = number1 % 10;

        System.out.printf("%d   %d   %d   %d   %d", result, result2, result3, result4, result5);

    }
}



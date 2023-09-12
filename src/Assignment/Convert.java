package Assignment;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary integer");
        int binary = scanner.nextInt();
        int firstNumber = binary / 100;
        int secondNumber = binary / 10 % 10;
        int thirdNumber = binary % 10;

        int total = firstNumber * 2 + secondNumber;
        int total2 = total * 2 + thirdNumber;
        System.out.println("the decimal equivalent of " + binary + " = " + total2);
    }
}

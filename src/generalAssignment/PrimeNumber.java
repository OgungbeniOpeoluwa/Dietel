package generalAssignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int count = 0;
        for (int sum = 2; sum < number; sum++) {
            if (number % sum == 0) {
                count++;

            }
        }
        if (count > 0) {
            System.out.println(number + " is not a prime number");
        }
        if (count == 0) {
            System.out.println(number + " is a prime number");
        }


    }
}



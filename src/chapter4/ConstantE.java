package chapter4;

import java.util.Scanner;

public class ConstantE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        double product = 1;
        double result = 1.0;
        for (int sum = 1; sum <= number; sum++) {
            product = product * (1.0 / sum);
            result += product;
        }
        System.out.println(result);
    }
}

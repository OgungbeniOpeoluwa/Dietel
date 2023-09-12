package generalAssignment;

import java.util.Scanner;

public class ValueJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int total = number % 10;
        int sum = total + number;
        System.out.println(sum);
    }
}

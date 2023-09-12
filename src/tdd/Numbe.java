 package tdd;

import java.util.Scanner;

public class Numbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int input = scanner.nextInt();
        int positive = 0;
        int negative = 0;
        int count = 0;
        for (int numb = 0; input != numb; numb++) {
            if (input > 0) {
                positive++;
            } else if (input < 0) {
                negative++;

            }
            if (input == 0) {
                count++;
            }
            System.out.println("enter a number or press 0 to quit");
            input = scanner.nextInt();
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(count);

    }
}

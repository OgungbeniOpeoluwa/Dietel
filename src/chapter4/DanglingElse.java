package chapter4;

import java.util.Scanner;

public class DanglingElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ;");
        int x = scanner.nextInt();
        System.out.println("enter a number");
        int y = scanner.nextInt();
        if (x > 5) {

            if (y > 5) {
                System.out.println("x and y are > 5");
            }
        }
        else {
            System.out.println("x is <= 5");
        }
    }
}

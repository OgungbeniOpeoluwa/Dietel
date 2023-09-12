package chapter4;

import java.util.Scanner;

public class BaseOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length base of a triangle");
        int number = scanner.nextInt();

        for(int row = 1;row<=number;row++){
            for(int column = 1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

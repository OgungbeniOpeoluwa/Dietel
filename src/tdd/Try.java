package tdd;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:: ");
        int num = input.nextInt();
        int total = 6|5;
        System.out.println(total);


        if (num % 5 == 0 ^ num == 2) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}

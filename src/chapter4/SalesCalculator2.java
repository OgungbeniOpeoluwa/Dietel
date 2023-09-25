package chapter4;

import java.util.Scanner;

public class SalesCalculator2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to calculate sales commission or enter 0 to zero: ");
        int stop = scanner.nextInt();

        while (stop != 0) {
            System.out.println("Enter the name of your drop shipping company: ");
            String name = scanner.next();
            System.out.println("kindly the number of goods sold for the week : ");
            int number = scanner.nextInt();

            if (number >= 1) {
                int total = 0;
                for (int sum = 1; sum <= number; sum++) {
                    System.out.println("kindly Enter the value of goods sold  : ");
                    int item = scanner.nextInt();
                    total += item;
                }
                double commission = total * 0.09 + 200;
                System.out.println("Dear" + " " + name + " " + "your weekly commission is :" + commission);
            }
            System.out.println("Enter 1 to calculate sales commission or enter 0 to zero: ");
            stop = scanner.nextInt();

        }
    }
}


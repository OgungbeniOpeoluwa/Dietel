package generalAssignment;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        System.out.println("Enter another number : ");
        int number2 = scanner.nextInt();
        int product = 1;

        for(int sum = 1 ; sum <= number2; sum++){
          product *= number;


        }
        System.out.println(product);


    }
}


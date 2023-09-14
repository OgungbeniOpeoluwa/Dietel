package chapter4;

import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number or kindly press 0 to stop: ");
        int userInput = scanner.nextInt();
        double total = 1;
        double sum =1;
        double total2 =0;
        for(int number = 1; number <= userInput; number++) {
            sum *=number;
        }
            for( int index = 1; index <= userInput; index--){
                total2 = total +(1.0/ sum * (index));

        }

        System.out.println(total2 + 1);
        System.out.println(Math.exp(userInput));

    }
}

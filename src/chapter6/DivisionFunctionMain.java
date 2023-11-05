package chapter6;

import java.util.Scanner;

public class DivisionFunctionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter a number 10 times to check which one  is divisible by 5: ");
        while(count < 10){
            System.out.println("Enter number " + count);
            int userInput = scanner.nextInt();
            System.out.println(DivisionFunction.isDivisible(userInput));
            count++;
        }
    }

}

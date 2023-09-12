package chapter4;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();

        int sum =0;
        while(sum < userInput){
            System.out.println("Enter an integer : ");
            int input = scanner.nextInt();
            sum += input;
        }
        System.out.println("the sum is : "+ sum);
        System.out.printf("the sum of the input is >= "+ userInput);
    }
}

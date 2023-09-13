package chapter4;

import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number or kindly press 0 to stop: ");
        int userInput = scanner.nextInt();
        while (userInput < 0) {
            System.out.println("kindly Enter a positive number: ");
            userInput = scanner.nextInt();
        }
        int product = 1;
        int sum =0;
        for(int number = userInput; number >= 1; number --){
            product *= number;
            sum += product;

//            System.out.println("Enter number 1 to continue or kindly press 0 to stop: ");
//             int number2 = scanner.nextInt();
//             if(number25 == 0){
//                 break;
//             }0
        }

        System.out.println(product);
        System.out.println(sum);

       // System.out.println("The factorial of " + userInput + " = " + product);

    }
}

package chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:");
        int number1 = input.nextInt();

        System.out.print("Enter second number:");
        int number2 = input.nextInt();

        int result = number1 * number1 * number1;
        int result2 =  number2 * number2;

        int multiples = result % result2;
        System.out.println(multiples);

        if(multiples == 0){
            System.out.println(result + " is a multiple of " + result2);
        }
        else {
            System.out.println(result + " is  not a multiple of " + result2);
        }

    }
}

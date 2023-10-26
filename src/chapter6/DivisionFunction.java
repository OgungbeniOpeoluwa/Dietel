package chapter6;

import java.util.Scanner;

public class DivisionFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter a number 10 times to check which one  is divisible by 5: ");
        while(count < 10){
            System.out.println("Enter number " + count);
            int userInput = scanner.nextInt();
            System.out.println(isDivisible(userInput));
            count++;
        }
    }




    public static  boolean isDivisible(int number){
        boolean result = false;
        if(number % 5 == 0){
            result = true;
        }
        return  result;
    }
}

package chibuzorAssignment;

import java.util.Scanner;

public class RangeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or press 0 to quit");
        int number = scanner.nextInt();
       int maximum = number;
        int minimum = number ;

        while(number != 0){
            if(number < minimum){
              minimum = number;
           }
            if(number > maximum){
                maximum = number;
            }
            System.out.println("Enter a number or press 0 to quit");
            number = scanner.nextInt();

        }

            System.out.println("the Smallest number is : " + minimum);

            System.out.println("the largest number is : " + maximum);

    }
}

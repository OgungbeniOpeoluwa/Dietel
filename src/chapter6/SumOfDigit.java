package chapter6;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in);
        System.out.println("Enter four digit numbers : ");
        int input = scanner.nextInt();
        while(input < 999 || input > 9999){
            System.out.println("Kindly enter  a four digit number : ");
            input = scanner.nextInt();
        }
        int result = add(input);
        System.out.println("The sum of the number you inputed is : " + result);

    }


    public static int add(int number){
        int count = 0;
        int sum = 0;
        while(number != 0){
            count = number % 10;
            sum += count;
            number/= 10;
        }
        return sum;



    }
}

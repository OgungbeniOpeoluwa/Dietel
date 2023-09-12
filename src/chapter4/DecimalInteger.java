package chapter4;

import java.util.Scanner;

public class DecimalInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        int userInput = scanner.nextInt();
        String binaryNumber = String.valueOf(userInput);
        int userNumber = binaryNumber.length();
        int total = 1;
        for(int number = 1; number < userNumber;number++){
            total *= 10;
        }
        int firstNumber = userInput / total;
        int result = firstNumber * 2;
        int divide = total / 10;
        int result2 = 0;

        for(int number = divide;number > 0; number = number / 10){
            result2 = userInput /number % 10;
            result += result2;
            result *= 2;
        }
        int division = result / 2;
        System.out.println(division);
    }
}

package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssitedInstruction {
    public static void main(String[] args) {
        randomNumbers();

    }

    public static int multiplication(int number,int numberTwo){
        return number * numberTwo;
    }
    public static int firstNumbers(){
        SecureRandom random = new SecureRandom();
        return random.nextInt(1,10);
    }
    public static int secondNumber(){
        SecureRandom random = new SecureRandom();
        return random.nextInt(1,10);
    }
    public static void randomNumbers() {
        Scanner scanner = new Scanner(System.in);
        String stoper = "yes";
        while (stoper.equals("yes")) {
            int  result = firstNumbers();
            int result2 = secondNumber();
            System.out.println("How much is " + result + " times " + result2);
            int input = scanner.nextInt();
            int product = multiplication(result, result2);
            if (product == input) {
                System.out.println("Very good");
            } else {
                while (input != product) {
                    System.out.println("No , Please Try again");
                    System.out.println("How much is " + result + " times " + result2);
                    input = scanner.nextInt();
                    product = multiplication(result, result2);
                }
            }
        System.out.println("yes to continue,else(no)");
        stoper = scanner.next();
    }
    }



    }




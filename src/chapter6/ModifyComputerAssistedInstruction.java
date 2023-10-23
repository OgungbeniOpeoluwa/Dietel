package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModifyComputerAssistedInstruction {
    public static void main(String[] args) {
        monitorStudentPerformance();
    }

    public static void monitorStudentPerformance() {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int result = 0;
        while (number < 10) {
            int firstNumber = ComputerAssitedInstruction.firstNumbers();
            int secondNumber = ComputerAssitedInstruction.secondNumber();
            int product = ComputerAssitedInstruction.multiplication(firstNumber, secondNumber);
            System.out.println("How much is " + firstNumber + " times " + secondNumber);
            int input = scanner.nextInt();
            if (input == product) {
                result++;
            }
            number++;
        }
        if (result * 100 > 75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }
}



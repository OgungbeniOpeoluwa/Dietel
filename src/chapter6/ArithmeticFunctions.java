package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ArithmeticFunctions {
    public static void displayArithmetic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                         pick which Arithmetic to work :
                         1. ADDITION
                         2. SUBTRACTION
                         3. DIVISION
                         4. MULTIPLICATION
                         5. RANDOM ARITHMETICS OPTIONS
                         6. enter "no" to stop
                         """);
        int numb = scanner.nextInt();
        arithmetic(numb);

    }

    public static int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public static int subtraction(int firstNumber,int secondNumber){
        return firstNumber - secondNumber;
    }
    public static double division(int firstNumber,int secondNumber){
        return (double) firstNumber /secondNumber;
    }

    public static void addition(){
        Scanner scanner = new Scanner(System.in);
        String stoper = "yes";
        while (stoper.equalsIgnoreCase("yes")) {
            int result = ComputerAssitedInstruction.firstNumbers();
            int result2 = ComputerAssitedInstruction.secondNumber();
            System.out.println("How much is " + result + " + " + result2);
            int input = scanner.nextInt();
            int product = addition(result, result2);
            if (product == input) {
                ComputerAssitedInstruction.corrrectAnswer();

            }
            while (input != product) {
               ComputerAssitedInstruction.inCorrrectAnswer();
                System.out.println("How much is " + result + " + " + result2);
                input = scanner.nextInt();
                product = addition(result, result2);
                if (product == input) {
                   ComputerAssitedInstruction.corrrectAnswer();
                }
            }
            System.out.println("yes to continue,else(no)");
            stoper = scanner.next().toLowerCase();
            if(stoper.equals("no")){
                displayArithmetic();
            }

        }
    }
    public static void subtraction(){
        Scanner scanner = new Scanner(System.in);
        String stoper = "yes";
        while (stoper.equalsIgnoreCase("yes")) {
            int result = ComputerAssitedInstruction.firstNumbers();
            int result2 = ComputerAssitedInstruction.secondNumber();
            System.out.println("How much is " + result + " - " + result2);
            int input = scanner.nextInt();
            int product = subtraction(result, result2);
            if (product == input) {
                ComputerAssitedInstruction.corrrectAnswer();

            }
            while (input != product) {
                ComputerAssitedInstruction.inCorrrectAnswer();
                System.out.println("How much is " + result + " - " + result2);
                input = scanner.nextInt();
                product = subtraction(result, result2);
                if (product == input) {
                    ComputerAssitedInstruction.corrrectAnswer();
                }
            }
            System.out.println("yes to continue,else(no)");
            stoper = scanner.next().toLowerCase();
            if(stoper.equals("no")){
                displayArithmetic();
            }


        }
    }
    public static void division(){
        Scanner scanner = new Scanner(System.in);
        String stoper = "yes";
        while (stoper.equalsIgnoreCase("yes")) {
            int result = ComputerAssitedInstruction.firstNumbers();
            int result2 = ComputerAssitedInstruction.secondNumber();
            System.out.println("How much is " + result + " / " + result2);
            double input = scanner.nextDouble();
            double product = division(result, result2);
            if (product == input) {
                ComputerAssitedInstruction.corrrectAnswer();

            }
            while (input != product) {
                ComputerAssitedInstruction.inCorrrectAnswer();
                System.out.println("How much is " + result + " / " + result2);
                input = scanner.nextInt();
                product = division(result, result2);
                if (product == input) {
                    ComputerAssitedInstruction.corrrectAnswer();
                }
            }
            System.out.println("yes to continue,else(no)");
            stoper = scanner.next().toLowerCase();
            if(stoper.equals("no")){
                displayArithmetic();
            }


        }
    }
    public static void randomArithmetic(){
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while(answer.equalsIgnoreCase("yes")){
            int numb = random.nextInt(1,5);
            int result = ComputerAssitedInstruction.firstNumbers();
            int result2 = ComputerAssitedInstruction.secondNumber();
            if(numb == 1){
                System.out.println("How much is " + result + " / " + result2);
               double input = scanner.nextDouble();
                double product = division(result, result2);
                while (input != product) {
                    ComputerAssitedInstruction.inCorrrectAnswer();
                    System.out.println("How much is " + result + " / " + result2);
                    input = scanner.nextInt();
                    if (product == input) {
                        ComputerAssitedInstruction.corrrectAnswer();

                    }
                }
            }
            else if(numb == 2){
                System.out.println("How much is " + result + " + " + result2);
                int input = scanner.nextInt();
                int add = addition(result, result2);
                if (add == input) {
                    ComputerAssitedInstruction.corrrectAnswer();
                }
                while (input != add) {
                    ComputerAssitedInstruction.inCorrrectAnswer();
                    System.out.println("How much is " + result + " + " + result2);
                    input = scanner.nextInt();
                    if (add == input) {
                        ComputerAssitedInstruction.corrrectAnswer();
                    }
                }
            }
            else if(numb == 3){
                System.out.println("How much is " + result + " - " + result2);
               int input = scanner.nextInt();
                int subtract = subtraction(result, result2);
                if (subtract == input) {
                    ComputerAssitedInstruction.corrrectAnswer();
                }
                while (input != subtract) {
                    ComputerAssitedInstruction.inCorrrectAnswer();
                    System.out.println("How much is " + result + " - " + result2);
                    input = scanner.nextInt();
                    if (subtract == input) {
                        ComputerAssitedInstruction.corrrectAnswer();

                    }
                }

            }
            if(numb == 4){
                System.out.println("How much is " + result + " times " + result2);
                int input = scanner.nextInt();
                int multiply = ComputerAssitedInstruction.multiplication(result, result2);
                if (multiply == input) {
                    ComputerAssitedInstruction.corrrectAnswer();
                }
                while (input != multiply) {
                    ComputerAssitedInstruction.inCorrrectAnswer();
                    System.out.println("How much is " + result + " times " + result2);
                    input = scanner.nextInt();
                    if (multiply == input) {
                        ComputerAssitedInstruction.corrrectAnswer();

                    }
                }
            }
        System.out.println("yes to continue,else(no)");
        answer = scanner.next().toLowerCase();
        if(answer.equals("no")) {
            displayArithmetic();
        }

        }

        }




    public static void arithmetic(int userInput) {
        switch (userInput) {
            case 1 -> addition();
            case 2 -> subtraction();
            case 3 -> division();
            case 4 -> ComputerAssitedInstruction.randomNumbers();
            case 5 -> randomArithmetic();
            case 6 -> {

            }
        }

    }

    }


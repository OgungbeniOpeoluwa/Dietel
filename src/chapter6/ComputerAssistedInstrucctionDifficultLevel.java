package chapter6;

import java.util.Scanner;

public class ComputerAssistedInstrucctionDifficultLevel {


 static Scanner scanner = new Scanner(System.in);
    public static int dificultLevel1(int firstNumber, int secondNumber ) {
        return ComputerAssitedInstruction.multiplication(firstNumber,secondNumber);
    }

    public static int difficultLevel2(int firstNumber, int secondNumber) {
        return ComputerAssitedInstruction.multiplication(firstNumber,secondNumber);
    }
    public static int levelOfGameToPick(){
        System.out.println("""
                1. Single Digit Multiplication
                2. double Digit Multiplication
                3. TO stop""");
        return scanner.nextInt();
    }
    public static void inCorrectAnswer(int answer,int firstNumber,int secondNumber,int correctAnswer){
        while(answer != correctAnswer){
            System.out.println("How many " + firstNumber + " times " + secondNumber);
            answer = scanner.nextInt();
            if(answer == correctAnswer){
                ComputerAssitedInstruction.corrrectAnswer();
            }
        }
    }
    public static  void diplayResult(){
        int input = levelOfGameToPick();
        switch (input){
            case 1: {
                System.out.println("Will you like to continue or Stop,if yes enter (yes),else(no)");
                String answer = scanner.next();
                while (answer.equalsIgnoreCase("yes")) {
                    int firstNumbers = ComputerAssitedInstruction.firstNumbers();
                   int  secondNumber = ComputerAssitedInstruction.secondNumber();
                    System.out.println("How many " + firstNumbers + " times " + secondNumber);
                    int inputs = scanner.nextInt();
                    int result = dificultLevel1(firstNumbers, secondNumber);
                    if (inputs == result) {
                        ComputerAssitedInstruction.corrrectAnswer();
                    } else {
                        ComputerAssitedInstruction.inCorrrectAnswer();
                        inCorrectAnswer(inputs, firstNumbers, secondNumber, result);
                    }
                    System.out.println("Will you like to continue or Stop,if yes enter (yes),else(no)");
                    answer = scanner.next();
                    if(answer.equalsIgnoreCase("no")) {
                        levelOfGameToPick();
                    }
                }
            }
            case 2:{
                System.out.println("Will you like to continue or Stop,if yes enter (yes),else(no)");
                String answer = scanner.next();
                while (answer.equalsIgnoreCase("yes")) {
                    int firstNumbers = ComputerAssitedInstruction.firstNumbers();
                    int secondNumber = ComputerAssitedInstruction.secondNumber();
                    System.out.println("How many " + firstNumbers + " times " + secondNumber);
                    int inputs = scanner.nextInt();
                    int result = difficultLevel2(firstNumbers,secondNumber);
                    if (inputs == result) {
                        ComputerAssitedInstruction.corrrectAnswer();
                    } else {
                        ComputerAssitedInstruction.inCorrrectAnswer();
                        inCorrectAnswer(inputs, firstNumbers, secondNumber, result);
                    }
                    System.out.println("Will you like to continue or Stop,if yes enter (yes),else(no)");
                    answer = scanner.next();
                    if(answer.equalsIgnoreCase("no")) {
                        levelOfGameToPick();
                    }
                }
            }
            case 3:{
                break;
            }
        }

    }
}

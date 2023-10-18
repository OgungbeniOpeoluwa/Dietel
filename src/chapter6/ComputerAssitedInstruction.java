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
    public static void corrrectAnswer(){
        SecureRandom random = new SecureRandom();
        int answer = random.nextInt(1,5);
        switch (answer) {
            case 1 ->System.out.println("Very good!");

            case 2 -> System.out.println("Excellent!");

            case 3 -> System.out.println("Nice work!");

            case 4 -> System.out.println("Keep up the good work!");

        }
    }
    public static void inCorrrectAnswer() {
        SecureRandom random = new SecureRandom();
        int answer = random.nextInt(1, 5);
        switch (answer) {
            case 1 -> System.out.println("No. Please try again.");

            case 2 -> System.out.println("Wrong. Try once more.");

            case 3 -> System.out.println("Don't give up!");

            case 4 -> System.out.println("No. Keep trying");

        }
    }

    public static void randomNumbers(){
        Scanner scanner = new Scanner(System.in);
        String stoper = "yes";
        int number = 0;
        int correctAnswer = 0;
        int inCorrectAnswer = 0;
        while (number != 10 ) {
            int  result = firstNumbers();
            int result2 = secondNumber();
            System.out.println("How much is " + result + " times " + result2);
            int input = scanner.nextInt();
            int product = multiplication(result, result2);
            if (product == input) {
                corrrectAnswer();
                correctAnswer +=10;

            } else {
                if(input != product){
                    inCorrectAnswer += 10;
                    System.out.println(inCorrectAnswer);
                }
                while (input != product) {
                    inCorrrectAnswer();
                    System.out.println("How much is " + result + " times " + result2);
                    input = scanner.nextInt();
                    product = multiplication(result, result2);
                    if (product == input) {
                        corrrectAnswer();
                        correctAnswer +=10;
                    }
                }
            }
            number++;
            if(number == 10) {
                if(correctAnswer > 70){
                    System.out.println("Congratulations, you are ready to go to the next level!");
                }
                else{
                    System.out.println("Please ask your teacher for extra help.");
                }
                System.out.println("yes to continue,else(no)");
                stoper = scanner.next();
                if (stoper.equals("yes")) {
                    number++;
                } else {
                    break;
                }
            }

    }
    }
}









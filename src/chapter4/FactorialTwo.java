package chapter4;

import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer  ");
        int userInput = scanner.nextInt();
        int product = 1;
        double  divide = 0;
        int product2 =1;
        double sum = 1;
        for(int number = 1;number <= userInput;number++){
            product *= userInput;
            product2 *= number;
            divide = (double) product / product2;
            sum += divide;

        }
        System.out.println("Constant e is = "+ sum);


    }
}

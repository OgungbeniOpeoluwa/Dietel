package chapter6;

import java.util.Scanner;

public class isMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stopper= 0;
        while(stopper != -1){
            System.out.println("Enter  first number :");
             int firstNumber = scanner.nextInt();
            System.out.println("Enter second Number :");
            int  secondNumber = scanner.nextInt();
            System.out.println(isMultiple(firstNumber, secondNumber));
            System.out.println("Press -1 to stop else press 0");
            stopper = scanner.nextInt();
        }
    }












    public static boolean isMultiple(int firstNumber,int secondNumber){
        boolean answer = false;
        if(secondNumber % firstNumber == 0){
            answer = true;
        }
        return answer;

    }
}

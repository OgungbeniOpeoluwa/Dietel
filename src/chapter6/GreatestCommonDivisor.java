package chapter6;

public class GreatestCommonDivisor {

    public static int commonDivisor(int firstNumber, int secondNumber) {
        if(firstNumber < secondNumber){
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        int answer = 0;
           while(firstNumber % secondNumber != 0){
               int product = firstNumber % secondNumber;
               firstNumber= secondNumber;
               secondNumber = product;
           }
           answer = secondNumber;


        return answer;

    }
}

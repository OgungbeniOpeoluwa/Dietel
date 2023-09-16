package practise;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three floating point values separated by spaces");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double result =maximum(number1,number2,number3);
        System.out.println(" the maximum is : " + result);
    }







    public static double maximum(double numberOne,double numberTwo,double numberThree){
        double maximumValue = numberOne;

        if(numberTwo > maximumValue){
            maximumValue = numberTwo;
        }
        if(numberThree > maximumValue){
            maximumValue = numberThree;
        }
        return  maximumValue;
    }

}

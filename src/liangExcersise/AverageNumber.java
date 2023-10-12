package liangExcersise;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] array = new double[10];
        for(int number = 0; number< array.length;number++){
            System.out.println("Enter a number: ");
            double input = scanner.nextDouble();
            array[number] = input;
        }
        System.out.println("The average number is : "+ average((array)));
        System.out.println("The average number is : " + average((array)));
    }


    public static int average(int [] array) {
        int total = 0;
        int count = 0;
        for (int number = 0; number < array.length; number++) {
            total += array[number];
            count++;
        }
        return total / count;
    }
    public static double average(double [] array) {
        double total = 0;
        double count = 0;
        for (int number = 0; number < array.length; number++) {
            total += array[number];
            count++;
        }
        return total / count;
    }

}

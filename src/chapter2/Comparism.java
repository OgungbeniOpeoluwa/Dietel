package chapter2;

import java.util.Scanner;

public class Comparism {
    public static void main(String[] args){

        Scanner mathematics = new Scanner(System.in);

        System.out.print("Enter number:");
        int  number1 = mathematics.nextInt();

        int result = number1 * number1;

        System.out.printf("%s%d%n", "The square of the: ", result);

        if (number1 == 100 && result == 100 ) {
            System.out.printf("%d == %d%n", number1, 100);
          System.out.printf("%d == %d%n", result, 100);
        }

        if (number1 < 100 && result < 100) {
            System.out.printf("%d < %d%n", number1, 100);
            System.out.printf("%d < %d%n", result, 100);
        }

        if (number1 != 100 && result != 100){
            System.out.printf("%d != %d%n", number1, 100);
            System.out.printf("%d != %d%n", result, 100);
        }

        if (number1 > 100 && result > 100){
            System.out.printf("%d > %d%n", number1,  100);
            System.out.printf("%d > %d%n", result, 100);
        }

    }

}




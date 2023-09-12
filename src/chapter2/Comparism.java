package chapter2;

import java.util.Scanner;

public class Comparism {
    public static void main(String[] args){

        Scanner mathematics = new Scanner(System.in);

        System.out.print("Enter number:");
        int  number1 = mathematics.nextInt();

        int result = number1 * number1;
        int sum = number1 + result;

        System.out.printf("%s%d%n", "The square of the: ", result);
        System.out.printf("%s%d%n", "The sum of the number is : ", sum);

        if (number1 == 100 && sum == 100 ) {
            System.out.printf("%d == %d%n", number1, 100);
          System.out.printf("%d == %d%n", sum, 100);
        }

        if (number1 < 100 && sum < 100) {
            System.out.printf("%d < %d%n", number1, 100);
            System.out.printf("%d < %d%n", sum, 100);
        }

        if (number1 != 100 && sum != 100){
            System.out.printf("%d != %d%n", number1, 100);
            System.out.printf("%d != %d%n", sum, 100);
        }

        if (number1 > 100 && sum > 100){
            System.out.printf("%d > %d%n", number1,  100);
            System.out.printf("%d > %d%n", sum, 100);
        }

    }

}




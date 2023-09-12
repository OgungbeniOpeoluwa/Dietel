package chapter2;

import java.util.Scanner;

public class Arithmetic {

        public static void main(String[] args){
                Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer:");
            int firstInteger = input.nextInt();

            System.out.print("Enter second integer:");
            int secondInteger = input.nextInt();

            int product = firstInteger * firstInteger;
            int result = secondInteger * secondInteger;

            System.out.printf("%d%n", product);
            System.out.printf("%d%n", result);

            int sum = product + result;
            int differences = product - result;

            System.out.printf("%s%d%n", "the sum of the product : ", sum);
            System.out.printf("%s%d%n", "the diffrence btwee the product: ", differences);
        }

    }

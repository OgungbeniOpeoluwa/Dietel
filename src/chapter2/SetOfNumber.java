package chapter2;

import java.util.Scanner;

public class SetOfNumber{

        public static void main(String[] args){

            Scanner numbers = new Scanner(System.in);

            System.out.print("Enter first integer: ");
            int number1 = numbers.nextInt();

            System.out.print("Enter second integer: ");
            int number2 = numbers.nextInt();

            System.out.print("Enter third integer: ");
            int number3 = numbers.nextInt();

            System.out.print("Enter fourth integer: ");
            int number4 = numbers.nextInt();

            System.out.print("Enter fifth integer: ");
            int number5 = numbers.nextInt();

            if(number1 > number2 && number1 > 3 && number1 > number4 && number1 > number5){
                System.out.printf("The largest is %d%n", number1);
            }

            else if(number2 > number3 && number2 > 4 && number2 > number1 && number2 > number5){
                System.out.printf("The largest is %d%n", number2);
            }

            else if(number3 > number1 && number3 > 2 && number3 > number4 && number3 > number5){
                System.out.printf("The largest is %d%n", number3);
            }

            else if(number4 > number1 && number4 > 2 && number4 > number3 && number4 > number5){
                System.out.printf("The largest is %d%n", number4);
            }

            else
                System.out.printf("The largest is %d%n", number5);

            if (number1 < number2 && number1 < 3 && number1 < number4 && number1 < number5){
                System.out.printf("The smallest is %d%n", number1);
            }

            else if(number2 < number3 && number2 < 4 && number2 < number1 && number2 < number5){
                System.out.printf("The smallest is %d%n", number2);
            }

            else if(number3 < number1 && number3 < 2 && number3 < number4 && number3 < number5){
                System.out.printf("The smallest is %d%n", number3);
            }

            else if(number4 < number1 && number4 < 2 && number4 < number3 && number4 < number5){
                System.out.printf("The smallest is %d%n", number4);
            }

            else
                System.out.printf("The smallest is %d%n", number5);

        }
    }


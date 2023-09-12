package chapter2;

import java.util.Scanner;

public class Arithmetic2 {
    public static void main(String[] args){

        Scanner calculation=new Scanner(System.in);

        System.out.print("Enter first number:");
        int numberOne = calculation.nextInt();

  System.out.print("Enter second number:");
            int numberTwo = calculation.nextInt();

  System.out.print("Enter third number:");
            int numberThree = calculation.nextInt();

            int sum = numberOne + numberTwo +  numberThree;
            int average = (sum / 3);
            int product = numberOne * numberTwo * numberThree;

   System.out.printf(" sum is %d%n", sum);
   System.out.printf("average is %d%n", average);
   System.out.printf("product is %d%n", product);

   if(numberOne < numberTwo && numberOne < numberThree){
                System.out.printf("Smallest number is %d%n", numberOne);
            }

   else if(numberTwo < numberOne && numberTwo < numberThree){
                System.out.printf("Smallest number is %d%n", numberTwo);
            }

   else if(numberThree < numberOne && numberThree < numberTwo){
                System.out.printf("Smallest number is %d%n", numberThree);
            }

   if(numberTwo > numberOne && numberTwo > numberThree){
                System.out.printf("Largest number is %d%n", numberTwo);
            }

   else if(numberThree > numberOne && numberThree > numberTwo){
                System.out.printf("Largest number is %d%n", numberThree);
            }

  else if(numberOne > numberTwo && numberOne > numberThree){
                System.out.printf("Largest number is %d%n" , numberOne);
            }

        }

    }


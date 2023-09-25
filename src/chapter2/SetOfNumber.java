package chapter2;

import java.util.Scanner;

public class SetOfNumber{

        public static void main(String[] args){
            Scanner numbers = new Scanner(System.in);
            int count = 1;
            System.out.print("Enter first integer: ");
             int number1 = numbers.nextInt();

            int largest  = number1;
            int smallest = number1;

             while (count < 5 ) {
                 System.out.print("Enter first integer: ");
                  number1 = numbers.nextInt();

                 if(number1 < smallest){
                     smallest = number1;
                 }
                 if(number1 > largest ){
                     largest = number1;
                 }
                 count ++;
             }

            System.out.println(largest);
            System.out.println(smallest);



        }
    }


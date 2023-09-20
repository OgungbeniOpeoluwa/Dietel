package chapter2;

import java.util.Scanner;

public class Circle {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter radius:");
            int radius = input.nextInt();

            double per = 3.14159;

            System.out.printf("%s%d%n",  " Diameter is : " , 2 * radius);

            System.out.printf("%s%f%n", "Circumference  is : ", 2 * per * radius );

            System.out.printf("%s%f%n", "Area is: ", per * (radius * radius) );

        }
    }


package chapter2;

import java.util.Scanner;

public class Divison {

        public static void main(String[] args){

            Scanner divide = new Scanner(System.in);

            System.out.print("Enter an integer : ");
            int number = divide.nextInt();

            if(number % 3 == 0) {
                System.out.println("number is divisible by 3");
            }
                else
                System.out.println("Number is  not divisible 3");
                }

        }




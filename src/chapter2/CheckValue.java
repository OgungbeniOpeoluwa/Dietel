package chapter2;

import java.util.Scanner;

public class CheckValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integers : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second integer : ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third integer : ");
        int number3 = scanner.nextInt();

        System.out.print("Enter fourth integer : ");
        int number4 = scanner.nextInt();

        System.out.print("Enter fifth integer : ");
        int number5 = scanner.nextInt();

        if(number1 < 0  ){
            System.out.println(number1  + " is a negative number" );

        }
       if(number2 < 0 ){
            System.out.println(number2  +  " is a negative number");
        }

       if(number3 < 0){
            System.out.println(number3  +  " is a negative number");
        }

       if(number4 < 0){
            System.out.println(number4  + " is a negative number");
        }

        if(number5 < 0){
            System.out.println(number5  + " is a negative number");
        }

        if(number1 > 0) {
            System.out.println(number1  + " is a positive number" );
        }

        if(number2 > 0 ){
            System.out.println(number2  +  " is a positive number");
        }

        if(number3 > 0){
            System.out.println(number3  +  " is a positive number");
        }

        if(number4 > 0){
            System.out.println(number4  + " is a positive number");
        }

        if(number5 > 0){
            System.out.println(number5  + " is a positive number");
        }

        if(number1 == 0){
            System.out.println(number1  + " is equal to zero" );
        }

        if(number2 == 0 ){
            System.out.println(number2  +  " is equal to zero");
        }

        if(number3 == 0){
            System.out.println(number3  + " is equal to zero");
        }
        if(number4 == 0){
            System.out.println(number4  + " is equal to zero");
        }

        if(number5 == 0){
            System.out.println(number5  + " is equal to zero");
        }


    }

}






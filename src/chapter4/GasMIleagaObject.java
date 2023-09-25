package chapter4;

import java.util.Scanner;

public class GasMIleagaObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GasMileage autoMobile = new GasMileage();
        System.out.println("Enter -1 to continue or press 0 to stop : ");
        int count = scanner.nextInt();
        int counter = 0;
        double result= 0;
        double milesCount = 0;
        double gallonCount = 0;


        while(count != counter) {
            System.out.println("Enter number of miles Driven : ");
            double miles = scanner.nextDouble();
            autoMobile.miles(miles);
            milesCount+=miles;

            System.out.println("Enter number of gallon used : ");
            double gallon = scanner.nextDouble();
            autoMobile.gallon(gallon);
            gallonCount += gallon;

            result = autoMobile.milesPerGallon();
            System.out.println("miles per gallon = "  + result);


            System.out.println("Enter -1 to continue or press 0 to stop : ");
            count = scanner.nextInt();
        }
        double average = milesCount / gallonCount;

        System.out.println("Total miles per gallon used is : " + result);
        System.out.println("Average total is = "+ average);


    }
}


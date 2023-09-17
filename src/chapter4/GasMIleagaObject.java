package chapter4;

import java.util.Scanner;

public class GasMIleagaObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GasMileage autoMobile = new GasMileage();
        System.out.println("Enter -1 to continue or press 0 to stop : ");
        int count = scanner.nextInt();
        int counter = 0;
        int counter2 = 0;
        int milesCount = 0;
        int gallonCount = 0;


        while(count != counter) {
            System.out.println("Enter number of miles Driven : ");
            int miles = scanner.nextInt();
            autoMobile.miles(miles);
            milesCount+=miles;

            System.out.println("Enter number of gallon used : ");
            int gallon = scanner.nextInt();
            autoMobile.gallon(gallon);
            gallonCount += gallon;

            autoMobile.milesPerGallon(miles, gallon);
            System.out.println("miles per gallon = "  + autoMobile.getFuelConsumption());


            System.out.println("Enter -1 to continue or press 0 to stop : ");
            count = scanner.nextInt();


            counter2++;

        }
        autoMobile.setNumberOfCount(counter2);

        System.out.println("Total miles per gallon used is : " + autoMobile.totalFuelConsumption());
        System.out.println("Average total is = "+ autoMobile.totalFuelConsumption()/ autoMobile.getTotalNumberOfCount());


    }
}


package chapter2;

import java.util.Scanner;

public class PyramidOfGiza {
    public static void main(String[] args) {
        Scanner pyramid = new Scanner(System.in);

        System.out.print("Enter estimate number of stone : ");
        long totalStone = pyramid.nextLong();

        System.out.print("Enter average weight each of stone : ");
        double averageWeight = pyramid.nextDouble();

        System.out.print("Enter number of years taken to build : ");
        int years = pyramid.nextInt();

        int yearsInDays = years * 365;
        int seconds = 60;
        int minutes = 60;
        int secondInHour = seconds * minutes;


        double totalWeight = totalStone *  averageWeight;
        double builtInAYear = totalWeight / yearsInDays ;
        double builtInEachHour = totalWeight / secondInHour ;
        double builtInMinutes = totalWeight / seconds;

        System.out.printf("Weight build in each year is : %f%n", builtInAYear);
        System.out.printf("Weight build in each hour is : %f%n", builtInEachHour);
        System.out.printf("Weight build in each minutes is : % f%n", builtInMinutes);
    }
}

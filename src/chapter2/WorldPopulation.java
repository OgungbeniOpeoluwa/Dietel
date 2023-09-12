package chapter2;

import java.util.Scanner;

public class WorldPopulation {


        public static void main(String[] args){
            Scanner population = new Scanner(System.in);

            System.out.print("Enter 1 as first year: ");
            int year1 = population.nextInt();

            System.out.print("Enter 2 as second year: ");
            int year2 = population.nextInt();

            System.out.print("Enter 3 as third year: ");
            int year3 = population.nextInt();

            System.out.print("Enter 4 as fourth year: ");
            int year4 = population.nextInt();

            System.out.print("Enter 5 as fifth year: ");
            int year5 = population.nextInt();

            double currentPopulation = 7.888e9;
            double GrowthRate = 0.009;

            double firstYear = currentPopulation * Math.pow(1 + GrowthRate, year1) ;
            double secondYear = currentPopulation * Math.pow(1 + GrowthRate, year2);
            double thirdYear = currentPopulation * Math.pow(1 + GrowthRate, year3);
            double fourthYear = currentPopulation * Math.pow(1 + GrowthRate, year4);
            double fifthYear = currentPopulation * Math.pow (1 + GrowthRate, year5);

            System.out.printf("Estimated world population for year1 is : %.4f%n", firstYear);
            System.out.printf("Estimated world population for year2 is : %.4f%n", secondYear);
            System.out.printf("Estimated world population for year3 is : %.4f%n", thirdYear);
            System.out.printf("Estimated world population for year4 is : %.4f%n", fourthYear);
            System.out.printf("Estimated world population for year5 is : %.4f%n", fifthYear);

        }
    }


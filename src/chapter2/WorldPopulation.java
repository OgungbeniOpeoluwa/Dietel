package chapter2;

import java.util.Scanner;

public class WorldPopulation {


        public static void main(String[] args){
            Scanner population = new Scanner(System.in);

            System.out.print("Enter the current population: ");
            double currentPopulation = population.nextDouble();

            System.out.print("Enter the growth rate: ");
            double growthRate = population.nextDouble();

            double result = 0;

            for(int year = 1; year <= 5; year++) {
                result = currentPopulation * Math.pow(1 + growthRate, year);
                System.out.printf("%s%d%.4f%n","Estimated world population for " , year, result );
            }

        }
    }


package chapter2;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner bodyMass = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        double weight = bodyMass.nextDouble();

        System.out.print("Enter height in inches: ");
        int height = bodyMass.nextInt();

        double bodyMassIndex = (weight * 703) / (height * height);

        System.out.printf(" Your body mass index is : %f%n", bodyMassIndex);
        System.out.println();
        System.out.println("Body mass categories");
        System.out.println("Normal weight = 18.5 _ 24.9");
        System.out.println("Underweight = <18.5");
        System.out.println("Overweight = 25 _ 29.9");
        System.out.println("obesity = 30 >=" + " that is greater than or equal to 30");

    }

}
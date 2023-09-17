package chibuzorAssignment;


import java.util.Scanner;

public class TestDriller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of paper copies you will like to buy : ");
        int paper = scanner.nextInt();
        int total = input(paper);
        System.out.println("Your total price is : " + total);
    }

    public static int costOfCopy(int numberOfCopy) {
        int total = 0;
        if(numberOfCopy >= 1 && numberOfCopy <= 4){
            total = numberOfCopy * 2000;
        }
        else if(numberOfCopy <= 9){
            total = numberOfCopy * 1800;
        }
        else if (numberOfCopy <= 29) {
            total = numberOfCopy * 1600;

        }
        else if (numberOfCopy <= 49) {
            total = numberOfCopy * 1500;

        }
        else if (numberOfCopy <= 99) {
            total = numberOfCopy * 1300;

        }
        else if (numberOfCopy <= 199) {
            total = numberOfCopy * 1200;

        }
        else if (numberOfCopy <= 499) {
            total = numberOfCopy * 1100;

        }
        else {
            total = numberOfCopy * 1000;
        }

        return total;
    }

    public static int input(int copies) {
        return costOfCopy(copies);
    }
}

package chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstInput = scanner.nextInt();

        System.out.println("Enter second integer: ");
        int secondInput = scanner.nextInt();

        if(firstInput == secondInput){
            System.out.println("0");
        }
        else if (firstInput > secondInput){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }
}

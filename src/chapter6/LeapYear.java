package chapter6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check whether is a leap year : ");
        int year = scanner.nextInt();
        boolean answer = isLeapYear(year);
        if(answer) System.out.println("IT is a leap year");
        else System.out.println("Not a leap year");
    }
    public static boolean isLeapYear(int number){
        boolean result = false;
        if(number % 4 == 0 )result = true;
        if(number % 400 == 0 && number % 100 != 0)result = true;
        return result;
    }
}

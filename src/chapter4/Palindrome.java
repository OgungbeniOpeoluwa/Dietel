package chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit number : ");
        int input = scanner.nextInt();
        while (input < 11111 || input > 99999){
            System.out.println("You have Enter a wrong value,Kindly input a five digit number : ");
            input = scanner.nextInt();
        }
        int total = input / 10000;
        int total5 = input % 10;

        if(total == total5){
            System.out.println(input + " is a palindrome number");
        }
        else{
            System.out.println(input + " is not a palindrome number");
        }

    }
}

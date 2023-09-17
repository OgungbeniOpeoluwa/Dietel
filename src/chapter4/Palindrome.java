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
        int firstDigit  = input / 10000;
        int secondDigit = input / 1000 % 10;
        int thirdDigit = input / 100 % 10;
        int fourthDigit = input / 10 % 10;
        int fifthDigit  = input % 10;

        String numberOne = String.valueOf( firstDigit);
        String numberTwo = String.valueOf(secondDigit);
        String numberThree = String.valueOf(thirdDigit);
        String numberFour = String.valueOf(fourthDigit);
        String numberFive = String.valueOf(fifthDigit);

        String reverse = numberFive + numberFour + numberThree + numberTwo + numberOne;
        int palindrome = Integer.parseInt(reverse);

        if(input == palindrome){
            System.out.println(input + " is a palindrome number");
        }
        else{
            System.out.println(input + " is not a palindrome number");
        }

    }
}

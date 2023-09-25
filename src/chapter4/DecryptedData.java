package chapter4;

import java.util.Scanner;

public class DecryptedData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a four -digit encrypted integer : ");
        int userInput = scanner.nextInt();

        while (userInput < 1111 || userInput > 9999){
            System.out.println("Kindly Enter a valid four- digit integer: ");
            userInput = scanner.nextInt();
        }
        int firstDigit = userInput / 1000;
        int secondDigit = userInput / 100 % 10;
        int thirdDigit = userInput / 10 % 10;
        int fourthDigit = userInput % 10;

        int firstNumber = firstDigit;
        int secondNumber = secondDigit;
         firstDigit = thirdDigit;
         secondDigit = fourthDigit;
         thirdDigit = firstNumber;
         fourthDigit = secondNumber;

         int constant = 7;
        int numberOne = constant - firstDigit;
        int numberTwo = constant - secondDigit;
        int numberFour =  constant - fourthDigit;
        int numberThree = constant -  thirdDigit ;

        int totalOne;
        int totalTwo;
        int totalThree;
        int totalFour;
        if(numberOne < 0){
            totalOne = firstDigit;
        }
        else {
            totalOne = firstDigit + 10;
            totalOne -= constant;
        }

        if(numberTwo < 0){
            totalTwo = secondDigit;
        }
        else{
            totalTwo = secondDigit + 10 ;
            totalTwo -= constant;
        }
        if(numberThree < 0){
            totalThree = thirdDigit;
        }
        else{
            totalThree = thirdDigit + 10;
            totalThree -= constant;

        }

        if(numberFour < 0){
            totalFour = fourthDigit;
        }
        else{
            totalFour = fourthDigit + 10;
            totalFour -= constant;
        }
        System.out.printf("%s%d%d%d%d", "The encrypted data is : ", totalOne,totalTwo,totalThree,totalFour);






    }
    }


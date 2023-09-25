package chapter4;

import java.util.Scanner;

public class EncryptedData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a four- digit integer: ");
        int userInput = scanner.nextInt();
        while (userInput < 1111 || userInput > 9999){
            System.out.println("Kindly Enter a valid four- digit integer: ");
             userInput = scanner.nextInt();
        }
        int firstDigit = userInput / 1000;
        int secondDigit = userInput / 100 % 10;
        int thirdDigit = userInput / 10 % 10;
        int fourthDigit = userInput % 10;

        int firstSum = (firstDigit + 7) % 10;
        int secondSum = (secondDigit + 7) % 10 ;
        int thirdSum = (thirdDigit + 7) % 10;
        int fourthSum = (fourthDigit + 7) % 10;

        int container = firstSum;
        int container2 = secondSum;

         firstSum = thirdSum;
        secondSum = fourthSum;
        thirdSum = container;
        fourthSum = container2;

        System.out.printf("%s%d%d%d%d", "Encrypted data is : ",  firstSum , secondSum , thirdSum , fourthSum);


    }
}

package chapter6;

import java.util.Scanner;

public class SquareOfAnyCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any characters: ");
        char fill = scanner.next().charAt(0);
        System.out.println("Enter length of square: ");
        int number = scanner.nextInt();
        displayFillCharacter(number,fill);
    }

    public static void displayFillCharacter(int number,char character){
        for(int numb = 0;numb < number;numb++){
            for(int count = 0;count < number;count++){
                System.out.print(character);
            }
            System.out.println();
        }
    }
}

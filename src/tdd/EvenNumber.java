package tdd;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int userInput = scanner.nextInt();
        System.out.println(userInput % 2 == 0 ? "even number" : "odd number");
    }
}

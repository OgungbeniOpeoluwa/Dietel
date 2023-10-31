package chapter6;

import java.util.Scanner;

public class GameOfCrapMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Wager");
        int wager = scanner.nextInt();
        GameCrapModification.displayResult(wager);
    }
}

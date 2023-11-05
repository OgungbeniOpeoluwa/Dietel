package chapter6;

import java.util.Scanner;

public class DisplayingAsterikMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SQUARE ASTERIK LENGTH YOU WANT");
        int input = scanner.nextInt();
        DisplayingSquareAsterik.asterik(input);

    }

}

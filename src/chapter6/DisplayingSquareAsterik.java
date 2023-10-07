package chapter6;

import java.util.Scanner;

public class DisplayingSquareAsterik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SQUARE ASTERIK LENGTH YOU WANT");
        int input = scanner.nextInt();
        asterik(input);

    }

    public static void asterik(int size){
        for(int count = 1;count<= size;count++){
            for(int counts = 1;counts <= size;counts++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}

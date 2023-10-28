 package chapter7;
import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args) {
        displayKnightTour();
    }

    static int currentRow = 3;
    static int currentColoumn = 4;
    static int[][] square = new int[8][8];


    public static void displayKnightTour() {
        square[currentRow][currentColoumn] = 1;
        loop(square);
        knightTour(square, currentRow, currentColoumn);
    }

    public static void loop(int[][] array) {
        for (int count = 0; count < array.length; count++) {
            for (int numb = 0; numb < array.length; numb++) {
                System.out.print(array[count][numb] + "  ");
            }
            System.out.println();
        }
    }

    public static void knightTour(int[][] square, int currentRow, int currentColoumn) {
        for (int counts = 2; counts <= 64; counts++) {
            System.out.println("Enter move number between 0 -7");
            int input = collectInput();
            currentRow += verticalMoves(input);
            currentColoumn += horizontalMoves(input);
            square[currentRow][currentColoumn] = counts;
            loop(square);
        }
    }

    public static int collectInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int horizontalMoves(int input) {
        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        return horizontal[input];
    }

    public static int verticalMoves(int input) {
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
        return vertical[input];
    }

}

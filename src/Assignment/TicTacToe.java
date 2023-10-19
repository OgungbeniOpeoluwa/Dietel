package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        ticTacToe();
    }














    public static void ticTacToe() {
        String[][] arrays = {{" " ," "," "},{" "," "," "},{" "," "," "}};
        int [][] store = new int[3][3];
        String [][] response = new String[arrays.length][1];
        Scanner scanner = new Scanner(System.in);
        int counts = 1;
        loop(arrays);
        while(counts < 5) {
            System.out.println("Enter a row(0, 1, or 2 ) for player X :");
            int input = scanner.nextInt();
            System.out.println("Enter a column (0,1,or 2) for player X: ");
            int result = scanner.nextInt();
            store[input][result] +=1;
            if(store[input][result] > 1){
                System.out.println("The box has been played ,Kindly play again.");
                System.out.println("Enter a row(0, 1, or 2 ) for player X :");
                 input = scanner.nextInt();
                System.out.println("Enter a column (0,1,or 2) for player X: ");
                result = scanner.nextInt();
                store[input][result] +=1;
            }
            response[input][0] = "X";
            arrays[input][result] = "X";
//            if(arrays[input][0] ){
//                System.out.println("player 1 won");
//            }

            System.out.println(Arrays.deepToString(store));
            loop(arrays);
            System.out.println("Enter a row(0, 1, or 2 ) for player O :");
             input = scanner.nextInt();
            System.out.println("Enter a column (0,1,or 2) for player 0: ");
             result = scanner.nextInt();
            store[input][result] +=1 ;
            if(store[input][result] > 1){
                System.out.println("The box has been played ,Kindly play again.");
                System.out.println("Enter a row(0, 1, or 2 ) for player O :");
                input = scanner.nextInt();
                System.out.println("Enter a column (0,1,or 2) for player O : ");
                result = scanner.nextInt();
                store[input][result] +=1;
            }
            arrays[input][result] = "0";
            System.out.println(Arrays.deepToString(store));
             loop(arrays);
             results(arrays);
             counts++;
        }
     }
     public static void loop(String [] []array) {
         System.out.println("-------------------");
         for (int count = 0; count < array.length; count++) {
             for (int numb = 0; numb < array.length; numb++) {
                 System.out.print(array[count][numb] );
                 System.out.print(" | ");
             }
             System.out.println();
             System.out.println("-------------------");
         }
     }
     public static void results(String [][] array) {
        String [][] index = new String[array.length][1];
        for(int numb = 0;numb< array.length;numb++){
            index[numb][0] = "X";
        }


     }

    }




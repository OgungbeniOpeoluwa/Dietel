 package chibuzorAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ShoppingReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arrays = new int[4][3];
        for(int count = 0;count < arrays.length;count++){
            for(int counter = 0;counter < arrays[count].length;counter++){
                System.out.println("Enter price for customer" + count + " item");
                int input = scanner.nextInt();
                arrays[count][counter] = input;
            }
        }
        System.out.println("CUSTOMERS" + "  " + " ITEMS1 " + "  "+ " ITEM2 " + "  " + " ITEM3 ");
        for(int count = 0; count < arrays.length;count++){
            System.out.print("customer" + count + "\t\t");
            for(int counts = 0;counts < arrays[count].length;counts++){
                System.out.print(arrays[count][counts] + "\t\t");
            }
            System.out.println();
        }

    }
}

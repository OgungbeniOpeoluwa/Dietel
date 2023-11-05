package chapter6;

import java.util.Scanner;

public class DisplayingSquareAsterik {
    public static void asterik(int size){
        for(int count = 1;count<= size;count++){
            for(int counts = 1;counts <= size;counts++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}

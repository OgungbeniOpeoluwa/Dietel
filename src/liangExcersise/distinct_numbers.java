package liangExcersise;

import java.util.Arrays;
import java.util.Scanner;

public class distinct_numbers {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[10];
        System.out.println("Enter 10 digit numbers: ");
        for(int count = 0;count <array.length;count++){
            int input = scanner.nextInt();
            array[count] = input;
            for(int n =0; n < array.length;n++){
                if(array[n] == input ){
                    input = 0;
                }
                    a[count] = input;

            }

        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(array));

    }
}

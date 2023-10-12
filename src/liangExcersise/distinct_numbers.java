package liangExcersise;

import java.util.Arrays;
import java.util.Scanner;

public class distinct_numbers {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
//        int [] a = new int[10];
//        System.out.println("Enter 10 digit numbers: ");
//        for(int count = 0;count <array.length;count++){
//            array[count] = scanner.nextInt();
//        }
//        for(int n =0; n < array.length;n++){
//            for(int m = n+1;m <array.length;m ++){
//                if(array[n] == array[m]){
//                    a[n] ++;
//                }
//                //a[n] = array[n];
//            }
//
//        }
//        System.out.println(Arrays.toString(a));
        int[] myList = {1, 5, 3, 4, 5, 5};
        int max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;


            }
        }
        System.out.println(max + " " + indexOfMax);
    }
}

package liangExcersise;

import java.security.SecureRandom;
import java.util.Arrays;

public class LargestRowAndColoumn {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [][] array = new int[4][4];
        int [] number = new int[4];

        for(int count = 0;count < array.length;count++){
            for(int counts = 0;counts < array.length;counts++){
                array[count][counts] = random.nextInt(2);
                System.out.print(array[count][counts] + " ");
                if(array[count][counts] == 1) {
                    number[count] += 1;
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(number));
        int max = number[0];
        int index = 0;
        for(int numb = 1; numb < number.length;numb++){
            if(number[numb] > max){
                max = number[numb];
                index = numb;

            }
            else if(number[numb] == max){
                max = max;
                index = index;
            }
        }
        System.out.println("The largest row index: " + index);
        System.out.println(" The largest column index: " + max);

    }
}

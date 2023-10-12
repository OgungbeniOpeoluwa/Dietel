package Assignment;

import java.util.Arrays;

public class MaxMath {
    public static void main(String[] args) {
        int [] array = {5,3,4,1,2,8};
        int [] result = mathCalculator(array);
        System.out.println(Arrays.toString(result));
    }













    public static int [] mathCalculator(int [] array){
        int total = 0;
        int sums = 0;
        int [] result = new int [array.length];
        for(int n = 0;n< array.length;n++){
            for(int m = 0;m < array.length;m++){
                total = total + array[m];
             }
            sums = total - array[n];
            result[n] = sums;
            total -=total;
        }
        int numb = max(result);
        int numbs = min(result);
        int [] results = new int[2];
        results[0] = numb;
        results[1] = numbs;
        return results;
    }
    public static int max(int [] array) {
        int max = array[0];
        for (int n = 1; n < array.length; n++) {
            if (array[n] > max) {
                max = array[n];
            }


        }
        return max;
    }
    public static int min(int []array) {
        int min = array[0];
        for (int n = 1; n < array.length; n++) {
            if (array[n] < min) {
                min = array[n];
            }


        }
        return min;
    }

}

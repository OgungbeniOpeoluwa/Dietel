package practise;

import java.util.Arrays;

public class MedianOfTwoSortedList {

    public static double medianOfTwoSortedArrrayFunction(int[] firstArrays, int[] secondArrays) {
        int [] arrays = new int[firstArrays.length+secondArrays.length];
        for(int count = 0;count < firstArrays.length;count++){
            arrays[count]  = firstArrays[count];
        }
        int total = firstArrays.length;
        for(int counter = 0; counter < secondArrays.length;counter++){
            arrays[total] = secondArrays[counter];
            total ++;
        }
       return median(sortArray(arrays));
    }

    public static int [] sortArray(int [] arrays){
        for(int count = 0;count < arrays.length;count++){
            for(int results = 0;results < arrays.length;results++){
                if(arrays[count] < arrays[results]){
                    int temp = arrays[count];
                    arrays[count] = arrays[results];
                    arrays[results] = temp;
                }

            }
        }
        return arrays;
    }

    public static  double median(int [] arrays){
        double result = 0;
        if(arrays.length % 2 == 0 ){
            int number = arrays.length / 2;
            result = (double)(arrays[number] + arrays[number-1]) / 2;
        }
        else{
            int number = arrays.length/2;
            result = arrays[number];
        }
        return result;
    }

}


package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSorting {

    public static int[] sortingFunction(int[] number) {
        ArrayList <Integer> results = arrayToArrayList(number);
        int count = 0;
        for(count = results.size()-1; count >=0; count--){
                int maximum = getMax(results);
                int counter = results.indexOf(maximum);
                number[count] = maximum;
                results.remove(counter);

        }
        return number;
    }
    private static int getMax(ArrayList<Integer> arrays){
        int max = arrays.get(0);
        for (int number = 1; number < arrays.size(); number++){
            if(arrays.get(number) > max){
                max = arrays.get(number);
            }
        }
        return max;
    }
    private static ArrayList <Integer> arrayToArrayList(int [] arrays){
      ArrayList <Integer> numb = new ArrayList<>();
        for (int number = 0; number < arrays.length; number++){
            numb.add(arrays[number]);
        }
        return numb;
    }
}

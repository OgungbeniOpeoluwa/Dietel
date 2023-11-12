package liangExcersise;

import java.util.ArrayList;

public class partitionalist {


    public static int[] pivot(int[] numb) {
        ArrayList <Integer> smallest = new ArrayList<>();
        ArrayList <Integer> largest = new ArrayList<>();
        int result = numb[0];
        for(int count = 1; count < numb.length;count++){
            if(numb[count] > result){
                largest.add(numb[count]);
            }
            else{
                smallest.add(numb[count]);
            }
        }
        smallest.add(result);
        smallest.addAll(largest);
        return changeArraylistToArray(smallest);
    }
    private static int[] changeArraylistToArray(ArrayList <Integer> numbers){
        int [] numb = new int [numbers.size()];
        for(int count = 0; count < numbers.size();count++){
            numb[count] = numbers.get(count);
        }
        return numb;
    }
}

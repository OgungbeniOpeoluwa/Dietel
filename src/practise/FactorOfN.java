package practise;

import java.util.ArrayList;

public class FactorOfN {

    public static int functionOfFactor(int number, int value) {
        ArrayList<Integer> result = new ArrayList<>();
        if(number > 0 && value > 0) {
            for (int count = 1; count <= number; count++) {
                for (int counts = 1; counts <= number; counts++) {
                    if (count * counts == number) {
                        result.add(count);
                    }
                }
            }
        }
        return returnValueInAlist(listToArray(result),value);
    }

    public static int [] listToArray(ArrayList<Integer>result){
        int [] array = new  int[result.size()];
        for (int count = 0;count < result.size();count++){
            array[count] = result.get(count);
        }
        return array;
    }

    public static int returnValueInAlist(int[] array, int value) {
        if(value == 1){
            value = 0;
        } else if (value > array.length) {
            return -1;
        } else{
            value -= 1;
        }
        return array[value];
    }
}

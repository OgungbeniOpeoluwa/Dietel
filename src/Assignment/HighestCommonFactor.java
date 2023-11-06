package Assignment;

import prime_factor.PrimeFactorFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class HighestCommonFactor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(commonFactor(12, 6, 30)));
    }

    public static int [] commonFactor(int...number) {
        int max = maximum(number);
        int counter = 0;
        ArrayList <Integer> result = new ArrayList<>();
        for(int count = 2; count < max;count++){
            for(int counts = 0 ; counts < number.length;counts++){
                if(number[counts] % count == 0){
                    counter++;
                }
            }
            if(counter == number.length){
                result.add(count);
            }
            counter = 0;
        }
        int [] arrays = listToArray(result);
        int maximum = maximum(arrays);
        return PrimeFactorFunction.primeNumberFunction(maximum);
    }

    public static int maximum(int...number){
        int max = number[0];
        for(int count = 1; count < number.length;count++){
            if(number[count] > max){
                max = number[count];
            }
        }
        return max;
    }

    public static int [] listToArray(ArrayList <Integer> number){
        int [] arrays = new int[number.size()];
        for(int count = 0; count < arrays.length; count++){
            arrays[count] = number.get(count);
        }
        return arrays;
    }

}





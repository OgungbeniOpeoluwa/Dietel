package practise;

public class TwoSum {

    public static int[] twoSumFunction(int[] input, int target) {
        int [] array = new int[2];
        for(int count = 0; count < input.length;count++){
            for(int counts = count+1;counts < input.length;counts++){
                if(input[count] + input[counts] == target){
                    array[0] = count;
                    array[1] = counts;
                    break;
                }
            }
        }
        return array;
    }
}

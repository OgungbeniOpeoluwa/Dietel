package practise;

public class ShufflingArray {

    public static int[] shuffleFunction(int[] arrays) {
        int counts = 0;
        for(int count = 1; count < arrays.length ;count+=2) {
            int temp = arrays[counts];
            arrays[counts] = arrays[count];
            arrays[count] = temp;
            counts += 2;
        }
        return arrays;
    }

    public static int[] fillShuffleFunction(int[] arrays) {
        int firstNumber = 0;
        int result = 0;
        if(arrays.length%2== 0) {
            result = arrays.length / 2;
            firstNumber = result - 1;
            int temp = arrays[firstNumber];
            arrays[firstNumber] = arrays[result];
            arrays[result] = temp;

        }
        else{
            result = arrays.length / 2;
            firstNumber = result + 1;
            int temp = arrays[result];
            arrays[result] = arrays[firstNumber];
            arrays[firstNumber] =temp;

        }
        return arrays;
    }


}

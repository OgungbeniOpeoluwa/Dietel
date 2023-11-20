package practise;

public class ShufflingArray {

    public static int[] shuffleFunction(int[] arrays) {
        int [] arrayss = new int[arrays.length];
       int counts = 0;
        for(int count = 1; count < arrays.length ;count+=2){
            arrayss[counts] = arrays[count];
            arrayss[count] = arrays[counts];
            counts+=2;
        }
        if(checkLength(arrays)) return arrayss;
        else{
           arrayss[arrays.length-1] = arrays[arrays.length-1];
           return arrayss;
        }
    }
    public static boolean checkLength(int[] arrays) {
        if(arrays.length%2 == 0) return true;
        else return false;
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

public class TupleToArray {

    public static int [] reverseNumber(int [] numbers){
        int [] result = new int[numbers.length];
        int count = 0;
        for(int number = numbers.length - 1;number >= 0;number--){
            result[count] = numbers[number];
            count++;
        }
        return result;
    }

   // public static int[] lastAndFirstElement(int[] item) {
   //     int [] number = new[]
//        for(int number = 0;number < item.length;number++){
       // }
   // }
}

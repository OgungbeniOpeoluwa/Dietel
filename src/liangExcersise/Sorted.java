package liangExcersise;

public class Sorted {

    public static boolean sortFunction(int[] array) {
        int[] result = sortMethod(array);
        boolean answer = false;
        if (answer) {
            answer = true;
        }
        return answer ;


    }

    public static int[] sortMethod(int[] array) {
        for (int numb = 0; numb < array.length; numb++) {
            for (int sum = 0; sum < array.length; sum++) {
                if (array[numb] < array[sum]) {
                    int temp = array[numb];
                    array[numb] = array[sum];
                    array[sum] = temp;
                }
            }

        }
        return array;
    }
}

package practise;

import java.util.ArrayList;

public class AddTwoSum {

    public static int[] twoSumFunctionArray(int[] firstList, int[] secondList) {
        int array = arrayToString(firstList);
        int arrays = arrayToString(secondList);
        int result = array + arrays;
        String number = String.valueOf(result);
        return reverseNumber(stringToArray(number));

    }

    public static int[] reverseNumber(int[] arrays) {
        int[] result = new int[arrays.length];
        int counter = 0;
        for (int count = arrays.length - 1; count >= 0; count--) {
            result[counter] = arrays[count];
            counter++;
        }
        return result;
    }

    public static int arrayToString(int[] arrays) {
        int[] arrayReverse = reverseNumber(arrays);
        String result = "";
        for (int count = 0; count < arrayReverse.length; count++) {
            result += arrayReverse[count];
        }
        return Integer.parseInt(result);
    }
    public static int [] stringToArray(String number) {
        ArrayList <Integer> result = new ArrayList<>();
        for (int count = 0; count < number.length(); count++) {
            int expected = Integer.parseInt(number.charAt(count)+"");
            result.add(expected);
        }
        return FactorOfN.listToArray(result);
    }


}

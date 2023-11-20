package practise;

import java.util.ArrayList;

public class uniqueBinarySearch {

    public static String binarySearchFunction(String[] numbers) {
        String result = "";
        for(int count = 0; count < numbers.length;count++) {
            //String returns = changeValue(numbers[count],)
        }
        return result;
    }


    private static String changeValue(String numbers,int count) {
        String numb = String.valueOf(numbers.charAt(count));
        if (numb.equals("0")) return numbers.replace(numb, "1");
        else return numbers.replace(numb, "0");
    }
}

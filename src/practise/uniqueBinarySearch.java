package practise;

import java.util.ArrayList;

public class uniqueBinarySearch {

    public static String binarySearchFunction(String[] numbers) {
        String result = "";
        for(int count = 0; count < numbers.length;count++){
            String results = numbers[count];


        }
        return result;
    }


    private static String palindrom(String numbers){
        String result = "";
        for(int count = numbers.length()-1; count >= 0 ; count--){
            result += numbers.charAt(count);

        }
        return result;
    }
    private static boolean isPalindrome(String result){
        String returns = palindrom(result);
        boolean answer = false;
        if(result.equals(returns)){
            answer = true;
        }
        return answer;
    }
}

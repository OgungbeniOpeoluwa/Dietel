package convertingNumbers;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
    public static  int binaryToDecimal(String number){
        final int base = 2;
        char result = number.charAt(0);
        int total = Integer.parseInt(String.valueOf(result)) * base;
        for(int count = 1;count < number.length();count++){
            result = number.charAt(count);
            int numb = Integer.parseInt(String.valueOf(result));
            total += numb;
            total *= base;
        }
        return total/2;
    }


    public static String decimalNumber(int userInput){
        String result = "";
        while (userInput != 0) {
            int count = userInput % 2;
            result += count;
            userInput /= 2;
        }
        return reverseNumber(result);
    }

    public static String reverseNumber(String number){
            String finalOutput = "";
        for(int counts = number.length()-1;counts >= 0;counts--){
            finalOutput += number.charAt(counts);
        }
        return finalOutput;
    }


}

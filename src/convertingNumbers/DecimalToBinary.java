package convertingNumbers;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] encrypt = new String[array.length];
        int start = 5;
        int count = 0;
        for (int numb = start; numb < array.length; numb++) {
            encrypt[numb] = array[count];
            count++;
        }
        int result = array.length - start;
            for (int numb = 0; numb < start; numb++) {
                encrypt[numb] =  array[result];
                result++;
            }
        System.out.println(Arrays.toString(encrypt));


    }
    public static  int binaryToDecimal(String number){
        final int base = 2;
        char result = number.charAt(0);
        int total = Integer.parseInt(String.valueOf(result)) * base;
        for(int count = 1;count < number.length()-1;count++){
            result = number.charAt(count);
            int numb = Integer.parseInt(String.valueOf(result));
            total += numb;
            total *= base;
        }
        return total;
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

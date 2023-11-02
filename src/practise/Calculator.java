package practise;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Calculator {

    public static int addition(String number) {
        int total = 0;
        StringTokenizer result = new StringTokenizer(number, " +");
        while(result.hasMoreTokens()){
            total += Integer.parseInt(result.nextToken());
        }
        return total;
    }

    public static int subtraction(String number) {
        int total = 0;
        StringTokenizer myToken = new StringTokenizer(number," -");
        if(number.charAt(0) == '-')total +=total;
        else total=Integer.parseInt(myToken.nextToken());
        while(myToken.hasMoreTokens()){
            total -= Integer.parseInt(myToken.nextToken());
        }
        return total;
    }

    public static int multiplication(String number) {
        int total = 1;
        StringTokenizer result = new StringTokenizer(number," *");
        while(result.hasMoreTokens()){
             total *= Integer.parseInt(result.nextToken());
        }
        return total;
    }

    public static int square(String number) {
        return 0;
    }
}
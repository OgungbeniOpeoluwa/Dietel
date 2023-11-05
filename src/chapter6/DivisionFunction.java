package chapter6;

import java.util.Scanner;

public class DivisionFunction {
     public static  boolean isDivisible(int number){
        boolean result = false;
        if(number % 5 == 0){
            result = true;
        }
        return  result;
    }
}

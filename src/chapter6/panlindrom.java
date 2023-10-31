package chapter6;

import java.util.Scanner;

public class panlindrom {

    public static String isPanidrome(String number){
        String answer = "";
        boolean returns = isPanlidrome(number);
        if(returns){
            answer = number + " is a panlindrome";
        }
        else{
            answer = number + " is not a panlindrome";
        }
        return answer;
    }
    public static boolean isPanlidrome(String number){
        String result = "";
        boolean answer = false;
        for(int count = number.length()-1;count >=0;count--){
            result += number.charAt(count);
        }
        if(number.equalsIgnoreCase(result))answer = true;
        return answer;
    }
}

package practise;

import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class calculator2 {
    public static void main(String[] args) {
        String number = "1+2-4*5";
        StringTokenizer myToken = new StringTokenizer(number,"+");
        int total = 0;
        int result = 0;

        while (myToken.hasMoreTokens()) {
            String num = myToken.nextToken();
            if (num.length() > 2 && num.contains("-")) {
                result += calculate(num);
            } if (num.length()>2 && num.contains("*")) {
                result+=calculates(num);

            } else {
                result += Integer.parseInt(num);
            }
        }
        System.out.println(calculate("-3-8"));

//            if (num.charAt(0) == '+' || num.charAt(0) == '-'){
//                Sresult += Integer.parseInt(num);
//            }else {
//                result += calculate(num);
//            }

        //System.out.println(total);
        System.out.println(result);
        //  System.out.println(Calculator.checkForTheIndexOfAsPositiveAndNegativeSign(number.substring(2)));
        SecureRandom random = new SecureRandom();
        }

    private static int calculate(String num) {
        StringTokenizer numb = new StringTokenizer(num,"-");
        int total = 0;
        if(num.charAt(0) == '-') {
            total += total;
        }
        else{
            total = Integer.parseInt(numb.nextToken());
        }
        while(numb.hasMoreTokens()){
            int result = Integer.parseInt(numb.nextToken());
            total -= result;
        }
       return total;
    }
    private static int calculates(String num) {
        StringTokenizer numb = new StringTokenizer(num,"*");
        int total = 1;
        while(numb.hasMoreTokens()){
            int result = Integer.parseInt(numb.nextToken());
            total *= result;
        }
        return total;
    }

}



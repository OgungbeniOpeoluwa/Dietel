package practise;

import java.util.StringTokenizer;

public class Cal {


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
    public void calculator(String number){
//        for(String numb :number){
//            if(numb.equals("/")){
//                int count = number.indexOf(numb);
//                division(count);
//            }
//        }

        for(int numb = 0; numb < number.length();numb++){
            if(number.charAt(numb) == '*') {
               // int count = number.indexOf(numb);
                multiplication(number);

            }
        }

        for(int numb = 0; numb < number.length();numb++){
            if (number.charAt(numb) == '+') {
          //      int count = number.indexOf(numb);
                addition(number);
            }
        }


        for(int numb = 0; numb < number.length();numb++){
            if(number.charAt(numb) == ('-')){
         //       int count = number.indexOf(numb);
                subtraction(number);

            }
        }
    }

    }


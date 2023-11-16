package practise;

import java.util.ArrayList;

public class RomanFigure {
    static int[] arraysOfNumbers = {1, 5, 10, 50, 100, 500, 1000};
    static char[] romanFigures = {'i', 'v', 'x', 'l', 'c', 'd', 'm'};
    static ArrayList <String> results = new ArrayList<>();

    public static String numberToRomanFigure(int num){
        String input = String.valueOf(num);
        int count = input.length();
        ArrayList <String> result = new ArrayList<>();
        if(count > 0){
            for(int numb = 0; numb < input.length(); numb++){
                count --;
                result.add(input.charAt(numb) + addZeros(count) );
            }
        }
        for(int counts = 0; counts < result.size(); counts++){
            int numbers = Integer.parseInt(result.get(counts));
            if(numbers == 0){
                continue;
            }
            int numb = binaryCheck(numbers);
            if(numb > 0 ){
                results.add(String.valueOf(romanFigures[numb]));
            }
            else{
                int check = rangeCheck(numbers);
                int returns = 0;
                if(numbers > arraysOfNumbers[check]) {
                    returns = numbers - arraysOfNumbers[check] ;
                }
                else {
                   returns = arraysOfNumbers[check] - numbers;
               }
                if(binaryCheck(returns) >= 0 ) {
                    String reset = romanFigures[binaryCheck(returns)] + "" + romanFigures[check];
                    results.add(reset);
                }
                else{
                    checker(numbers);

                }

            }
        }
        return finalResult();
    }
     private static String addZeros(int count){
        String result = "";
        for(int counts = 0; counts < count ; counts++){
            result += "0";
        }
        return result;
     }
     private static  int rangeCheck(int number){
        int max = 0;
        if(number > arraysOfNumbers[arraysOfNumbers.length-1]){
            max = arraysOfNumbers.length-1;
        }
        else {
            for(int count = 0; count < arraysOfNumbers.length; count++){
                if(arraysOfNumbers[count] > number){
                    max = count;
                    break;
                }
            }
        }
        return  max;
     }
     private static int binaryCheck(int number){
        int returns = -1;
        for(int count = 0; count < arraysOfNumbers.length; count++){
            if(number == arraysOfNumbers[count]){
                returns = count;
                break;
            }
        }
        return returns;
     }

     private static void checker(int number){
        int check = 0;
        if(number > arraysOfNumbers[arraysOfNumbers.length-1]){
            check = rangeCheck(number);
        }
       else{
           check = rangeCheck(number) - 1;
        }
         while (number != 0){
            int result = number - arraysOfNumbers[check];
            if (result >= 0) {
                results.add(String.valueOf(romanFigures[check]));
                number = result;
            } else {
                check--;
            }
        }
     }
     private static String finalResult(){
        String result = "";
        for(int count = 0; count < results.size();count++){
            result+=results.get(count);
        }
        results.clear();
        return result;
     }



}










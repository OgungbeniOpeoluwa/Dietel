package chibuzorAssignment;

import java.util.Arrays;

public class FunctionArray {


    public static int largestFunction(int[] number) {
        int maximum = 0;
        for(int numbs = 0; numbs < number.length;numbs++){
            if(number[numbs] > maximum){
                maximum = number[numbs];
            }
        }
        return  maximum;
    }

    public static int[] reverse(int[] numbers) {
        int [] result = new int[numbers.length];
        int index = 0;
           for( int number = result.length - 1; number >= 0 ; number --){
              result[number] = numbers[index];
              index = index +1;
           }

        return result;
    }

    public static int [] oddPosition(int [] numbers){
       int [] result = new int[numbers.length];
        for(int number = 0; number < numbers.length;number = number + 2){
             result[number] = numbers [number];
        }
        return result;
    }
    public static int [] evenPosition(int [] numbers){
        int [] result = new int[numbers.length];
        for(int number = 1; number < numbers.length;number = number +2){
            result[number] = numbers [number];
        }
        return result;
    }
    public static String  palindrome(String [] letters){
        String [] words = new String[letters.length];
        String answer = " ";
        int index = 0;
        for(int number = letters.length-1; number >= 0; number --){
            words[number] = letters[index];
            index += 1;
        }
        if(Arrays.equals(words, letters)){
            answer = "it is a palindrome";
        }
        else{
            answer = " not a palindrome";
        }
        return  answer;
    }
    public static int runningTotal(int[] numbers){
        int result = 0;
        for(int count = 0; count < numbers.length ; count++){
            result += numbers[count];
        }
        return result;

    }
    public static String [] [] numbers(String [][] numbs) {
        String [][] result = new String [numbs.length][numbs.length];
        for(int numbers = 0; numbers < numbs.length; numbers++){
            for(int number = 0 ; number < numbs.length; number++){
                result[numbers][number] = numbs[numbers][numbers];
            }
        }
        return result;

    }






    public static void main(String[] args){
       int [] number = {20,10,45,85,5,6,9};
       int [] number2 = reverse(number);
        System.out.println(Arrays.toString(number2));
       int [] result = oddPosition(number);
        System.out.println(Arrays.toString(result));
        int [] even = evenPosition(number2);
        System.out.println(Arrays.toString(even));
        String [] name = {"l","o","l"} ;
        String result5 = palindrome(name);
        System.out.println(result5);
        int total = runningTotal(number);
        System.out.println(total);
        String [] [] number3 = {{"a","b","c"},{"1","2","3"}};
        String [] []  answer = numbers(number3);
        System.out.println(Arrays.deepToString(answer));

    }


}


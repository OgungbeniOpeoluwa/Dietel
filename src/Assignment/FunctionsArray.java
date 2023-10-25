package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsArray {


    public static int[] returnDuplicateNumber(int[] userInput) {
        int [] array = new int[userInput.length];
        int result = 0;
        for(int numb = 0;numb < userInput.length;numb++){
            if(userInput[numb] == 1){
                result = 0;
            }
            else {
               result = userInput[numb] - 1;
            }
            array[result] +=1;
        }
        return  returnValues(array);
    }
    public static int [] returnValues(int [] userInput){
        ArrayList <Integer> answer = new ArrayList<>();
        for(int numb = 0; numb < userInput.length;numb++){
            if(userInput[numb] >= 2){
                answer.add(numb+1);
            }
        }
        return returns(answer);
    }

    public static int [] returns(ArrayList <Integer> numbs){
        int [] answer = new int[numbs.size()];
        for(int numbers = 0;numbers < numbs.size();numbers++){
            answer[numbers] = numbs.get(numbers);
        }
        return answer;
    }

    public static String returnReverseWord(String numb) {
        String result = " ";
        for (int count = numb.length() - 1; count >= 0; count--) {
            result += numb.charAt(count);
        }
        return result;
    }

    public static String [] returnReverse2(String numb) {
        String result = returnReverseWord(numb);
        ArrayList <Integer> numbs = array(numb);
        String [] counts = new String [numbs.size()];
        int counter = 0;
        int results = numbs.size()-1;
        int temp = 0;
        for(int count = 0; count < numbs.size(); count ++) {
            int input  = numbs.get(count);
             temp += input ;
                counts[results] = result.substring(counter,temp);
                results --;
                counter = temp;


        }
        return counts;

    }


    public static  String returnValue(String numb){
        String result = "";
        String answer = "";
        String [] word = returnReverse2(numb);
        for(int count = 1;count < word.length;count++){
            result += word[count];
        }
        answer += word[0].substring(1);
        return answer + result;
    }

    public static  ArrayList <Integer> array(String words){
        String word = returnReverseWord(words);
        ArrayList <Integer> number = new ArrayList<>();
        int counter = 0;
        for(int numb = 0; numb < word.length();numb++){
            if(String.valueOf(word.charAt(numb)).equals(" ")){
                number.add(counter);
                counter = 0;
            }
            counter +=1;
        }
        number.add(counter);
        return number;
    }

    public static boolean checkWord(String numb) {
        String result = numb.toLowerCase();
        String answer = "".toLowerCase();
        boolean returns = false;
        for (int numbs = result.length() - 1; numbs >=0; numbs--) {
            answer += result.charAt(numbs);
        }
        if (result.equals(answer)) {
            returns = true;
        }
        return returns;
    }
    public static int [] dominateNumber(int[] array) {
        ArrayList<Integer> numbs = new ArrayList<>();
        int counter = 0;
        int result = array.length - 1;
        for (int numb = 0; numb < array.length; numb++) {
            for (int count = numb + 1; count < array.length; count++) {
                if (array[numb] > array[count]) {
                    counter++;
                }

            }
            if (counter == result) {
                numbs.add(array[numb]);
            }
            result--;
            counter = 0;

        }

        return returns(numbs);
    }
    public static boolean checkWords(String numb) {
        boolean answer = false;
            if(numb.matches("\\d+")) {
               answer = true;
            }
            return answer;
    }


    public static boolean checkWordss(String numb) {
        String answer = "".toLowerCase();
        boolean returns = false;
        boolean results = checkWords(numb);
        if(results) {
            for (int numbs = numb.length() - 1; numbs >= 0; numbs--) {
                answer += numb.charAt(numbs);
            }
            if (numb.equals(answer)) {
                returns = true;
            }
        }
        return returns;
    }
    public static boolean checkForTarget(String number, int firstIndices, int secondIndice, int target) {
        boolean answer = false;
        if(String.valueOf(number.charAt(firstIndices)) .equals("-")) {
           String  results = number.charAt(firstIndices) + "" + ( number.charAt(firstIndices+1));
           secondIndice+=1;
            int result = Integer.parseInt(results);
            int result2 = Integer.parseInt(String.valueOf(number.charAt(secondIndice)));
            if (target > result && target < result2) answer = true;

        }
        else {
            int result = Integer.parseInt(String.valueOf(number.charAt(firstIndices)));
            int result2 = Integer.parseInt(String.valueOf(number.charAt(secondIndice)));
            if (target > result && target < result2) answer = true;
        }

        return answer;

    }

}

package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public static String isAnagrm(String firstWord, String secondWord) {
        ArrayList <Integer> number = new ArrayList<>();
        return null;



    }
    public static int [] numberOfLettersInAWord(String word){
        String temp = word.toLowerCase();
        int [] array = new int[word.length()];
        return array;
    }

    public static int countNumberGreaterThanZero(int [] array){
        int total = 0;
        for(int count = 0; count < array.length;count++){
            if(array[count] > 0){
                total += 1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfLettersInAWord("anagram")));
    }

}

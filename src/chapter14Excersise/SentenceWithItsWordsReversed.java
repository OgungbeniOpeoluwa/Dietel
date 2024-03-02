package chapter14Excersise;

import java.util.Arrays;
import java.util.List;

public class SentenceWithItsWordsReversed {

    public static List<String> reverseSentence(String words) {
        String [] array = words.split(" ");
       List<String> arrays = Arrays.stream(array)
               .map((word)->new StringBuilder(word).reverse().toString())
               .toList();
       return arrays;
    }
}

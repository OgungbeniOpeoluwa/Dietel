package chapter14Excersise;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordOfSentence {

    public static String returnLongestWordInSentence(String sentence) {
        Comparator<String> comparator = (a,b)->compare(a,b);
        String [] word = sentence.split(" ");
        String value =Arrays.stream(word)
                .sorted(comparator)
                .toList().get(0);
        return value;
    }

    private static int compare(String a, String b) {
        if(a.length() > b.length())return -1;
        else if (b.length() > a.length()) return 1;
        else return 1;

    }
}

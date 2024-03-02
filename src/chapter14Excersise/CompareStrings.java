package chapter14Excersise;

public class CompareStrings {

    public static boolean compareStrings(String sentence, String secondWord,int start,int end) {
       return sentence.regionMatches(true,start,secondWord,start,end);
    }
}

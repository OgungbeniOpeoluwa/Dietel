package chapter6;

public class BeautifyingString {

    public static String endsWithFullStop(String word) {
        int length = word.length();
        if(String.valueOf(word.charAt(length-1)).equals(".")){
            return word;
        }
          return word + ".";
    }

    public static String firstLetterStartWithCapitalLetter(String word) {
        return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
    }

    public static String beutifiedString(String sentence) {
        return endsWithFullStop(firstLetterStartWithCapitalLetter(sentence));
    }
}

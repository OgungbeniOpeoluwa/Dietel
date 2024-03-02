package chapter14Excersise;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MorseCode {
    public static void main(String[] args) {
        System.out.println(decryptWord(".... . .-.. .-.. ---    .-- --- .-. .-.. -.."));
    }
    private  static  Map<String,String> morse = new TreeMap<>();



    public static String encrptyWord(String word) {
       morse = morseCode();
       StringBuilder result = new StringBuilder();
       for(int count = 0; count < word.length();count++){
           String value = String.valueOf(word.charAt(count)).toUpperCase();
           if (value.equals(" ")){
               result.append("   ");
               continue;
           }
           result.append(morse.get(value)).append(" ");


        }
        return result.substring(0, result.length()-1);
    }

    public static Map<String,String> morseCode() {
        String[] alphabeth = {"A.-", "B-...", "C-.-.", "D-..", "E.", "F..-.",
                "G--.", "H....", "I..", "J.---", "K-.-", "L.-..","M--",
                "N-.", "O---", "P.--.", "Q--.-", "R.-.", "S...",
                "T-", "U..-", "V...-", "W.--", "X-..-", "Y-.--", "Z--..",
                "1.----", "2..---", "3...--", "4....-", "5.....", "6-....",
                "7--...", "8---..", "9----.", "0-----"};
        for (String value : alphabeth) {
            morse.put(value.substring(0,1), value.substring(1));
        }
        return morse;
    }

    public static String decryptWord(String word) {
        StringBuilder result = new StringBuilder();
        String [] array = word.split(" ");
        for (String value:array) {
            result.append(returnkeyInMap(value));
        }
        return result.toString();
    }

    private static String returnkeyInMap(String value){
        Set<String> keys = morseCode().keySet();
        for (String key: keys) {
            String values = morseCode().get(key);
            if(values.equals(value))return key;
        }
        return " ";

    }
}

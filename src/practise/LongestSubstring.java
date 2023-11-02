package practise;

public class LongestSubstring {

    public static int longestSubStringFunction(String input) {
        int total = 0;
        for(int count = 0; count < input.length();count++){
            for(int counts = count+1; counts < input.length();counts++){
                if(input.charAt(count) == input.charAt(counts)){
                    break;
                }
                else {
                    total += 1;
                }
            }
        }
        return total;
    }
}

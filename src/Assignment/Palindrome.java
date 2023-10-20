package Assignment;

public class Palindrome {

    public static boolean anagramFunction(String name, String result) {
       String numb = name.toUpperCase();
        String answer = result.toUpperCase();
        boolean number = false;
        String results = "";
        if(numb.length() == answer.length()) {
            for (int counts = 0; counts < numb.length(); counts++) {
                for (int count = 0; count < result.length(); count++) {
                    if (numb.charAt(counts) == answer.charAt(count)) {
                        results += answer.charAt(count);
                        break;
                    }
                }
            }
        }
        if(numb.equals(results.toUpperCase())){
            number = true;
        }
            return  number;
    }
    public static boolean palindrome(String name){
        String name2 = name.toUpperCase();
        String answer = "";
        boolean returns = false;
        for(int count = name2.length()-1;count >= 0;count--){
            char result = name2.charAt(count);
            answer += result;
        }
        if(name2.equals(answer.toUpperCase())){
            returns = true;
        }
        return returns;
    }




}

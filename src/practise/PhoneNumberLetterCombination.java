package practise;

import java.util.ArrayList;

public class PhoneNumberLetterCombination {
    static String [] letters ={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static String [] numbers = {"2","3","4","5","6","7","8","9"};

    public static String[] letterCombination(String input) {
        String [] array = new String [input.length()];
        for(int count = 0; count < input.length();count++) {
           String result = String.valueOf(input.charAt(count));
           for(int counts = 0;counts < numbers.length;counts++){
               if(result.equalsIgnoreCase(numbers[counts])){
                   array[count] = letters[counts];
               }
           }

        }
        return listToArray(arrange(array));
    }


    public static ArrayList<String> arrange(String [] input){
        ArrayList <String> results = new ArrayList<>();
        for(int numb = 1; numb < input.length;numb++){
            String result = input[numb];
            String p = input[0];
            for(int numbs = 0; numbs < p.length();numbs++){
                String output = String.valueOf(p.charAt(numbs));
                for (int count = 0; count < result.length();count++){
                    String counts = String.valueOf(result.charAt(count));
                    String counter = output + counts;
                    results.add(counter);
                }
            }
        }
        return results;
    }

    public static String [] listToArray(ArrayList<String>result){
        String [] array = new  String[result.size()];
        for (int count = 0;count < result.size();count++){
            array[count] = result.get(count);
        }
        return array;
    }
}

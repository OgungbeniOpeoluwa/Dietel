package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class LowestCommonFactor {

    public static String commonFactor(int... number) {
        String result = "";
        for (int numb = 0; numb < number.length; numb++) {
            for (int count = 2; count <= number[numb]; count++) {
                while (number[numb] % count == 0) {
                    number[numb] /= count;
                    result += count;

                }
            }

        }
        return result;
    }

    public static String commonFactor2(int... number) {
        String result = "";
        int counter = 0;
        int numbers = maximum(number);
        for (int count = 2; count < numbers; count++) {
            for (int numb = 0; numb < number.length; numb++) {
                if(number[numb] % count == 0) {
                    number[numb] /= count;
                    counter = count;
                }

            }
            result += counter;


        }
        return result;
    }

    public static int[] result(int... numb) {
        String answer = commonFactor(numb);
        String[] results = removeDuplicate(answer);
        String[] returns = removeDuplicates(results);
        int[] answers = array(returns);
        return answers;
    }
    public static int maximum(int... number){
        int max = number[0];
        for(int numb = 1; numb < number.length;numb++){
            if(number[numb] > max){
                max = number[numb];
            }
        }
        return max;

    }

    public static String[] removeDuplicate(String answer) {
        String[] result = new String[answer.length()];
        for (int numb = 0; numb < result.length; numb++) {
            result[numb] = String.valueOf(answer.charAt(numb));
        }

        return result;
    }

    public static String[] removeDuplicates(String[] answer) {
        for (int numb = 0; numb < answer.length; numb++) {
            for (int numbs = numb + 1; numbs < answer.length; numbs++) {
                if (answer[numb].equals(answer[numbs])) {
                    answer[numbs] = "0";
                }
            }
        }
        return answer;
    }

    public static String removeZero(String[] answer) {
        String[] result = removeDuplicates(answer);
        String results = "";
        for (int numb = 0; numb < result.length; numb++) {
            int numbs = Integer.parseInt(answer[numb]);
            if (numbs > 0) {
                results += numbs;

            }
        }
        return results;
    }

    public static int[] array(String[] answer) {
        String result = removeZero(answer);
        int[] answers = new int[result.length()];
        for (int numb = 0; numb < result.length(); numb++) {
            answers[numb] = Integer.parseInt(String.valueOf(result.charAt(numb)));
        }
        return answers;
    }


    public static void main(String[] args) {
        System.out.println(commonFactor(8, 16));
    }
}




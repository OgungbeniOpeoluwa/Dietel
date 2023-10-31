package practise;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Calculator {

    public static int addition(int ... number) {
        int total = 0;
        int numbers = 89;
        for (int count = 0; count < number.length; count++) {
            System.out.println(number[count] + " ");
        }


        return total;
    }
//        boolean result = checkIfNumberHasADigitAndCharacterSigns(number);
//        if(result){
//            int numbers = Integer.parseInt(number);
//        }

//        int total = checkIfNumberAsPositiveAndNegativeSign(number);
//      int numbers = checkForTheIndexOfAsPositiveAndNegativeSign(number);
//        int secondIndex = numbers + 1;
  //      boolean result = checkIfNumberHasADigitAndCharacterSigns(number);
//        if(result) {
//            for (int count = 0; count < number.length(); count++) {
//                if(count == numbers|| count == secondIndex ){
//                    continue;
//                }
//                String results = String.valueOf(number.charAt(count));
//                total += Integer.parseInt(results);
//            }
//        }
//            else{
//                throw new InputMismatchException("Invalid Number");
//            }
//        return total;


    public static boolean checkIfNumberHasADigitAndCharacterSigns(String number){
        boolean result = false;
            if (number.matches("[\\d+-]+")) {
                result = true;
            }

        return result;
    }




    public static int checkIfNumberAsPositiveAndNegativeSign(String number){
        int result = checkForTheIndexOfAsPositiveAndNegativeSign(number);
        String results = number.charAt(result ) +  "" + number.charAt(result);
        return Integer.parseInt(results);

    }

    public static int checkForTheIndexOfAsPositiveAndNegativeSign(String number){
        int result = 0;
        for (int count = 0;count < number.length();count++) {
            if (String.valueOf(number.charAt(count)).equals("+") || String.valueOf(number.charAt(count)).equals("-")) {
                result = count;

            }
        }
        return result;

    }

}

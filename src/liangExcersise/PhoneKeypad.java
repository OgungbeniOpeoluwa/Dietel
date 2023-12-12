package liangExcersise;

public class PhoneKeypad {

    public static String stringToNumberFunction(String number) {
        for(int count = 0; count < number.length(); count++){
            String results = String.valueOf(number.charAt(count));
            if(results.matches("[A-Za-z]")){
                String result = String.valueOf(getAlphabetValue(results.toUpperCase()));
                number = number.replace(results,result);


            }
        }
        return number;
    }

    private static int getAlphabetValue(String value){
        int number = 0;
        for(AlphabetValue values: AlphabetValue.values()){
            for(int count = 0; count < values.toString().length(); count++){
               if(String.valueOf(values.toString().charAt(count)).equals(value)){
                   return values.getValue();
               }

               }
        }
        return number;
    }
}

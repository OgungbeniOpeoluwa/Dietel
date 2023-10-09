package AtmCard;

import java.security.PublicKey;

public class AtmCardMain {

    public static String setCardDigit(String cardDigit){
        String result = String.valueOf(cardDigit.length());
        String number = "0";
        int lenght = Integer.parseInt(result);
        if (lenght >= 13 && lenght <=16) {
            number = cardDigit;
        }
        return number;
    }

    public static int getDigitLength(String number) {
        int results = 0;
        String result = String.valueOf(number.length());
        int lenght = Integer.parseInt(result);
        if (lenght >= 13 && lenght <=16){
            results = lenght;
        }
        return results;
    }

    public static String checkCardFirstDigitAndName( String cardDigit) {
         String answer = "Invalid Card";
         boolean Visa = cardDigit.startsWith("4");
         boolean master = cardDigit.startsWith("5");
         boolean americanExpress = cardDigit.startsWith("37");
         boolean dicoverCard = cardDigit.startsWith("6");

         if(Visa)answer = "VisaCard";
         if(master)answer = "MasterCard";
         if(americanExpress)answer = "American Express Card";
         if(dicoverCard)answer = "Discover card";

         return answer;

   }

    public static String validNumber(String number) {
        String answer = "Invalid";
        int result = oddlyPlace(number);
        int results = doublingSecondDigit(number);
        int total = results + result;
        if(total % 10 == 0){
            answer = "Valid";
        }
        return answer;
    }
    public static void display(String inputs){
        System.out.printf("%s%n", "*****************************");
        System.out.printf("%s%s%n", "** Credit Card Type : ", checkCardFirstDigitAndName(inputs) );
        System.out.printf("%s%s%n", "** Credit Card number : ",  setCardDigit(inputs));
        System.out.printf("%s%d%n", "** Credit Card Digit length : ",getDigitLength(inputs));
        System.out.printf("%s%s%n", "** Credit Card Validity Status: ", validNumber(inputs));
        System.out.printf("%s%n","********************************");
               }













    public static int oddlyPlace(String number){
        String numbers = String.valueOf(number.length());
        int result = Integer.parseInt(numbers);
        int total = 0;
        for(int count = result -1;count > 0;count-=2){
            char numbs = number.charAt(count);
            int returns = Integer.parseInt(String.valueOf(numbs));
            total += returns;
        }
        return total;
    }

    public static int doublingSecondDigit(String number){
        String lenght = String.valueOf(number.length());
        int returns = Integer.parseInt(lenght);
        int total = 0;
        int counts = 0;
        int temp = 0;
        for(int count = returns-2;count >= 0;count -=2) {
            char numbers = number.charAt(count);
            int numbss = Integer.parseInt(String.valueOf(numbers));
            total = numbss * 2;
            if (total >= 10) {
                temp = addition(total);
                counts += temp;
            } else {
                counts += total;
            }
        }
        return counts;
    }

        public static int addition(int nmb){
            int resultss = 0;
            int countss = 0;
            while(nmb != 0){
                countss = nmb % 10;
                resultss += countss;
                nmb /=10;
            }
            return resultss;
        }
}

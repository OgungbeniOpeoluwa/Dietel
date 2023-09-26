package generalAssignment;

public class SumOfDigit {


    public static int sumOfDigit(long userInput) {
        long counter;
        int count = 0;
        while (userInput != 0){
            counter = userInput  % 10;
            count+= (int) counter;
            userInput /= 10 ;
        }
        return count;
    }

    public static int differenceOfDigit(long userInput){
        long counter = 0;
        int total = 1;
        int counts = lengthOfNumber(userInput);
        for(int numbers = 1; numbers < counts;numbers++){
            total *= 10;
        }
       int firstDigit = (int) userInput / total;
       int total2 = total / 10;
        int count = firstDigit;

        while(total2!= 0){
            counter = userInput / total2 % 10 ;
            count -= (int)counter;
            total2 /= 10;
        }
        return count;
    }
    public static int lengthOfNumber(long userInput){
        String number = String.valueOf(userInput);
        return number.length();

    }



    }


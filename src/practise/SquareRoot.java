package practise;

public class SquareRoot {
    public static int squareRoot(int userInput) {
        int answer = 0;
        for (int number = 1; number <= userInput; number++) {
           if (number * number == userInput) {
               answer = number;
           }
        }
        return answer;
    }


   }


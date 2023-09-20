package chibuzorAssignment;

public class Function {

    public static boolean evenNumber(int number) {
        if (number % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean checkPrimeNumber(int user_input) {
        if (user_input <= 1) {
            return false;
        }
        int division = 0;
        int count = 0;
        for (int number = 1; number <= user_input; number++) {
            division = user_input % number;
            if (division == 0) {
                count++;
            }
        }


        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (firstNumber < secondNumber) {
            result = secondNumber - firstNumber;
            return result;
        } else {
            result = firstNumber - secondNumber;
            return result;
        }

    }

    public static double divide(int firstNumber, int secondNumber) {
        if(secondNumber == 0){
            return  0;
        }
        double result = (double) firstNumber / secondNumber;
        System.out.printf("%.2f", result);
        return result;
    }

    public static int factor(int user_Input) {
        int count = 0;
        int divide = 0;
        for (int number = 1; number <= user_Input; number++) {
            divide = user_Input % number;
            if (divide == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean square(int number) {
        int product = 0;
        for (int count = 1; count <= number; count++) {
            if (count * count == number) {
                product++;
            }

        }
        return product == 1;

    }


    public static boolean palindrome(int user_Input) {
        int product ;
        int reverse = 0;
        int tempVariable = user_Input;
        if (tempVariable > 9999 && tempVariable <= 99999){
            while (user_Input != 0){
                 product = user_Input % 10;
                reverse = reverse * 10 + product;
                user_Input /=  10;
            }
        }
        else{
            return  false;
        }
        if(tempVariable == reverse){
            return true;
        }
        else {
            return false;
        }
    }

    public static int factorial(int number) {
        int product = 1;
        for(int count = number ; count >= 1; count--){
            product *= count;

        }
        return product;
    }
}

























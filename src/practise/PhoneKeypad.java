package practise;


import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Letter: ");
        String userInput = scanner.next();
        int result = phoneKeyPad(userInput);
        if (result == 0){
            System.out.println(userInput + " " + "is an invalid input");
        }
        else {
            System.out.println("The Corresponding Number is : " + result);
        }
    }


    public static int phoneKeyPad(String userInput) {
        int answer = 0;
        String letter = userInput.toLowerCase();
        if (letter.equals("a") || letter.equals("b") || letter.equals("c")) {
            answer = 2;
        } else if (letter.equals("d") || letter.equals("e") || letter.equals("f")) {
            answer = 3;
        } else if (letter.equals("g") || letter.equals("h") || letter.equals("i")) {
            answer = 4;
        } else if (letter.equals("j") || letter.equals("k") || letter.equals("l")) {
            answer = 5;
        } else if (letter.equals("m") || letter.equals("n") || letter.equals("o")) {
            answer = 6;

        } else if (letter.equals("p") || letter.equals("q") || letter.equals("r") || letter.equals("s")) {
            answer = 7;

        } else if (letter.equals("t") || letter.equals("u") || letter.equals("v")) {
            answer = 8;
        }
        else if (letter.equals("w") || letter.equals("x") || letter.equals("y") || letter.equals("z") ) {
            answer = 9;
        }



            return answer;
    }
}


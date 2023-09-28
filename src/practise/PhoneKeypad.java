package practise;


import java.util.Scanner;
public class PhoneKeypad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Letter: ");
        String userInput = scanner.next();
        String result = phoneKeyPad(userInput);
        System.out.println(result);

        System.out.println("Will you like to Continue: if yes press(1), if No press(0):");
        int stop = scanner.nextInt();

        while (stop != 0){
            System.out.println("Enter a Letter: ");
             userInput = scanner.next();
             result = phoneKeyPad(userInput);
            System.out.println(result);
            System.out.println("Will you like to Continue: if yes press(1), if No press(0):");
            stop = scanner.nextInt();
        }
    }



    public static String phoneKeyPad(String userInput) {
        String answer = " ";
        String letter = userInput.toLowerCase();
        if (letter.equals("a") || letter.equals("b") || letter.equals("c")) {
            answer = "The Corresponding Number is 2";
        } else if (letter.equals("d") || letter.equals("e") || letter.equals("f")) {
            answer = "The Corresponding Number is 3";
        } else if (letter.equals("g") || letter.equals("h") || letter.equals("i")) {
            answer = "The Corresponding Number is 4";
        } else if (letter.equals("j") || letter.equals("k") || letter.equals("l")) {
            answer = "The Corresponding Number is 5";
        } else if (letter.equals("m") || letter.equals("n") || letter.equals("o")) {
            answer = "The Corresponding Number is 6";

        } else if (letter.equals("p") || letter.equals("q") || letter.equals("r") || letter.equals("s")) {
            answer = "The Corresponding Number is 7";

        } else if (letter.equals("t") || letter.equals("u") || letter.equals("v")) {
            answer = "The Corresponding Number is 8";
        }
        else if (letter.equals("w") || letter.equals("x") || letter.equals("y") || letter.equals("z") ) {
            answer = "The Corresponding Number is 9";
        }
        else{
            answer = letter + " is an invalid input";
        }
        return answer;
    }
}


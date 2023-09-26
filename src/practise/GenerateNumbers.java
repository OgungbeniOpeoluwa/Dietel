package practise;

import java.util.Scanner;

public class GenerateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        int total = number1 + number2 + number3;
        System.out.println(number1 + "+" + number2 + "+" + number3);
        int answer = scanner.nextInt();

        if(total == answer) {
            System.out.println("you have answer the question correctly");
        }
        else{
            System.out.println("You can always do better ,you can try again");
        }
        System.out.println("would you like to try again ,if yes press(1)else press (0):");
        int stop = scanner.nextInt();
        while(stop != 0){
            number1 = (int)(Math.random() * 10);
             number2 = (int)(Math.random() * 10);
             number3 = (int)(Math.random() * 10);

             total = number1 + number2 + number3;

            System.out.println(number1 + "+" + number2 + "+" + number3);
            answer = scanner.nextInt();

            if(total == answer) {
                System.out.println("you have answer the question correctly");
            }
            else{
                System.out.println("You can always do better ,you can try again");
            }
            System.out.println("would you like to try again ,if yes press(1)else press no :");

        }



    }
}

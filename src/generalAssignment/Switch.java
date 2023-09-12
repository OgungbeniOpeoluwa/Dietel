package generalAssignment;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                press
                1.To make call
                2.To send a message
                3.To listen to radio
            
                """);
        int userInput = scanner.nextInt();
        switch(userInput){
            case 1: {
                System.out.println("You can now place your call");
                System.out.println("kindly enter the number");
                int number = scanner.nextInt();
                System.out.println("dailing" + number);
                break;
            }

            case 2: {
                System.out.println("you can now send a messagae");
                break;
            }

            case 3 : {
                System.out.println("welcome to 98.6 fm station");
                break;
            }
            default : {
                System.out.println("you have entered a wrong number");
            }
        }

    }
}

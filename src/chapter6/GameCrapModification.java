package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameCrapModification {
    private static int balance = 1000;
    static Scanner scanner = new Scanner(System.in);

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private static SecureRandom random = new SecureRandom();
    private enum status{CONINUE,WON,LOSS};

    public static void displayGameOfCrap(int wager) {
        int myPoint = 0;
        int sumOfDice = rolldice();
        status gameStatus;
        String stoper = "yes";
        while(stoper.equalsIgnoreCase("yes")) {
            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = status.LOSS;
                    break;
                default:
                    gameStatus = status.CONINUE;
                    myPoint = sumOfDice;
            }

            while (gameStatus == status.CONINUE) {
                sumOfDice = rolldice();
                if (sumOfDice == myPoint) {
                    gameStatus = status.WON;
                }
                if (sumOfDice == SEVEN) {
                    gameStatus = status.LOSS;
                }
            }
            if (gameStatus == status.WON) {
                balance += wager;
                System.out.println("Player wins");
                System.out.println("Current balance :"+balance);
                displayWhenBalanceIncreases();
            } else {
                System.out.println("Player loss");
                balance -= wager;
                System.out.println(" current balance :"+ balance);
                displayWhenBalanceDecrease();
                if(balance == 0){
                    System.out.println("Sorry. You are busted! ");
                    break;
                }
            }
            System.out.println("will you like to continue: ");
            stoper = scanner.next().toLowerCase();
        }
    }

        public static int rolldice(){
            int result = 1 + random.nextInt(6);
            int result2 = 1 + random.nextInt(6);
            return total(result,result2);
        }


        public static int total(int firstNumber,int secondNumber){
            return firstNumber + secondNumber;
        }
        public static void displayResult(int wager){
        if(wager > balance){
            while(wager > balance){
                System.out.println("Enter valid wager : ");
                wager = scanner.nextInt();
                if(wager <= balance){
                    displayGameOfCrap(wager);
                }
            }
        }
        else {
            displayGameOfCrap(wager);
        }

        }
        public static void displayWhenBalanceDecrease() {
            int dice = random.nextInt(1, 2);
            switch (dice) {
                case 1 -> System.out.println("Oh,you're going for broke, huh?");
                case 2 -> System.out.println("Aw c'mon, take a chance!");
            }
        }
    public static void displayWhenBalanceIncreases() {
        int dice = random.nextInt(1, 3);
        switch (dice) {
            case 1 -> System.out.println("You're up big");
            case 2 -> System.out.println("Now's the time, to cash in your chips!");
        }
    }



    }






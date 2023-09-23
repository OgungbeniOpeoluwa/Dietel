package tdd;

import java.util.Random;
import java.util.Scanner;

public class PapperGame {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        Random random = new Random();

        System.out.print("scissor (0) , rock (1), paper (2) : ");
        int number = guess.nextInt();

        int randomNumber = random.nextInt(3);

        int scissor = 0;
        int rock = 1;
        int paper = 2;

        if (number == randomNumber && number == scissor) {
            System.out.println("Computer is paper, you are scissor too. it is a draw");
        } else if (number == randomNumber && number == paper) {
            System.out.println("Computer is paper, you are paper too. it is a draw");
        } else if (number == randomNumber && number == rock) {
            System.out.println("Computer is Rock , you are Rock too. it is a draw");
        }

        if (number == rock && randomNumber == paper) {
            System.out.println("The computer is paper, you are rock: Computer won");
        } else if (number == paper && randomNumber == scissor) {
            System.out.println("Computer is Scissor, you are papper: Computer won");
        } else if (number == scissor && randomNumber == rock) {
            System.out.println("Computer is Rock, you are scissor: Computer won");
        }

        if (number == paper && randomNumber == rock) {
            System.out.println("Computer is rock, you are paper: Congratulation you won");
        } else if (number == rock && randomNumber == scissor) {
            System.out.println("Computer is Scissor, you are Rock : Congratulation you won");
        } else if (number == scissor && randomNumber == paper) {
            System.out.println("computer is papper, you are scissor : Congratulation you won");
        }
    }
}


package studentScore;

import java.util.Scanner;

public class AllScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder numbers = new StringBuilder();
        for(int number = 1;number <= 10;number++){
            System.out.println("Enter your Score : ");
             int score = scanner.nextInt();
             numbers.append(score).append(" \t");
        }
        System.out.println("The scores entered is : "+numbers);
    }
}

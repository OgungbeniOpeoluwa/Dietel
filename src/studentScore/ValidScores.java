package studentScore;

import java.util.Scanner;

public class ValidScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for(int number = 1; number <= 10;number++){
            System.out.println("Enter your score:");
            int score = scanner.nextInt();
            if(score >= 1 && score <= 100){
                total += score;
            }
        }
        System.out.println("The total valid score is : "+ total);
    }
}

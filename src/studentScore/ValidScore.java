package studentScore;

import java.util.Scanner;

public class ValidScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int score ;
        for(int number = 1;number <= 3;number++){
            System.out.println("Enter your Score : ");
            score = scanner.nextInt();
            if(score >= 1 && score <= 100){
                total +=score;
            }
            while(score < 0 || score > 100) {
                System.out.println("Enter your Score : ");
                score = scanner.nextInt();
            }
        }
        System.out.println("The sum of valid score: " + total);


    }
}

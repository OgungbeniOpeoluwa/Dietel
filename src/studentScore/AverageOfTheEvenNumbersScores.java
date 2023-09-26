package studentScore;

import java.util.Scanner;

public class AverageOfTheEvenNumbersScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int total = 0;
        for(int number = 1;number <= 10; number++){
            System.out.println("Enter your score : ");
            int score = scanner.nextInt();
            if(score % 2 == 0){
                total += score;
                count ++;
            }
        }
        double average =(double) total/ count;
        System.out.println("the Average sum of even score is : " + average);

    }
}

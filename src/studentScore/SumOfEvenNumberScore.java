package studentScore;

import java.util.Scanner;

public class SumOfEvenNumberScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for(int number = 1; number <= 10;number ++){
            System.out.println("Enter your score: ");
            int score = scanner.nextInt();
            if(score % 2 == 0){
                total += score;
            }
        }
        System.out.println("The sum of even Score is : "+ total);

    }
}

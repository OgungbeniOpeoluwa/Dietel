package studentScore;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 10;
        int total = 0;
        for(int number = 1 ; number <= count; number++){
            System.out.println("Enter your Score :");
            int score = scanner.nextInt();
            total += score;
        }
        double average =(double) total / count;
        System.out.println("The sum is : " + total);
        System.out.println("the average is : "+ average);
    }
}

package studentScore;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 10;
        for(int number = 1;number <= count;number ++){
            System.out.println("Enter your Score: ");
            int score = scanner.nextInt();
            total += score;
        }
        int average = total / count;
        System.out.println("The average is : "+average);

    }
}

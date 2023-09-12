package generalAssignment;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Score");
        int userScore = scanner.nextInt();

        if (userScore >= 90 && userScore < 100) System.out.println("A");

        if (userScore >= 80 && userScore < 89) System.out.println("B");

        if (userScore >= 70 && userScore < 79) System.out.println("C");

        if (userScore >= 60 && userScore < 69) System.out.println("D");

        if (userScore < 60) System.out.println("F");
    }
}






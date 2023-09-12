package generalAssignment;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 6: ");
        int number = scanner.nextInt();

        for( ;number  > 6;) {
            System.out.println("Enter a number between 0 and 6: ");
            number = scanner.nextInt();

        }

        switch (number) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("satuday");
        }


    }
}




package generalAssignment;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today day in number where 0 is Sunday");
        int today = scanner.nextInt();

        System.out.println("Enter the number of days elapsed since today");
        int futureDay = scanner.nextInt();
        int total = futureDay % 7 + today;

        switch(today){
            case 0:
                System.out.print(" Today is Sunday and the future day is ");
                break;

            case 1:
                System.out.print("Today is monday and the future day is ");
                break;

             case 2:
                System.out.print("Today is tuesday and the future day is ");
                break;

            case 3:
                System.out.print("Today is Wednesday and the future day is ");
                break;

            case 4:
                System.out.print("Today is thursday and the future day is ");
                break;

            case 5:
                System.out.print("Today is friday and the future day is ");
                break;

            case 6:
                System.out.print("Today is saturday and the future day is  ");


        }

        switch(total){
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");

        }
    }
}

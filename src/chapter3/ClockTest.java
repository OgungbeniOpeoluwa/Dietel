package chapter3;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Clock clock = new Clock (0, 0, 0);

        System.out.println("Enter current minute: ");
        int minutes = scanner.nextInt();
        clock.setMinutes(minutes);

        System.out.println("Enter current hour : ");
        int hour = scanner.nextInt();
        clock.setHour(hour);

        System.out.println("Enter curent second:" );
        int seconds = scanner.nextInt();
            clock.setSecond(seconds);

            System.out.printf("Current time is : %d:%d:%d hh:mm:ss%n", clock.getHour(), clock.getMinutes(), clock.getSecond());

        }
    }





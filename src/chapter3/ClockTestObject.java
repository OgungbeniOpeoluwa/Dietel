package chapter3;

import java.util.Scanner;

public class ClockTestObject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Clock clock = new Clock (0, 0, 0);

        System.out.println("Enter current minute: ");
        int minutes = scanner.nextInt();
        clock.setMinutes(minutes);

        System.out.println("Enter current hour : ");
        int hour = scanner.nextInt();
        clock.setHour(hour);

        System.out.println("Enter current second:" );
        int seconds = scanner.nextInt();
            clock.setSecond(seconds);

            System.out.println("Current time is :"+ clock.displayClock());

        }
    }





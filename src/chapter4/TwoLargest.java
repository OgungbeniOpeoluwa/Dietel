package chapter4;

import java.util.Scanner;

public class TwoLargest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =1;
        int largest = 0;
        int total = 0;
        int number = 0;
        while(sum <= 10) {
            System.out.println("Enter a number : ");
            number = scanner.nextInt();
           // System.out.println(number);
            if (number > largest) {
                total = largest;
                largest = number;
            }
            else if (total < number) {
                total = number;
            }
            sum++;
        }

        System.out.println(largest);
        System.out.println(total);

        }
    }

